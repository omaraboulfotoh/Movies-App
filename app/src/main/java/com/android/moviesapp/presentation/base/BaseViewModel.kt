package com.android.moviesapp.presentation.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abs.app.presentation.app.IGlobalState
import com.android.moviesapp.BuildConfig
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import org.apache.http.conn.ConnectTimeoutException
import java.net.UnknownHostException

interface ViewEvent

interface ViewState

interface ViewSideEffect

const val SIDE_EFFECTS_KEY = "side-effects_key"

abstract class BaseViewModel<Event : ViewEvent, UiState : ViewState, Effect : ViewSideEffect>(
    protected val globalState: IGlobalState,
) :
    ViewModel() {

    abstract fun setInitialState(): UiState
    abstract fun handleEvents(event: Event)

    private val initialState: UiState by lazy { setInitialState() }

    private val _viewState: MutableStateFlow<UiState> = MutableStateFlow(initialState)
    val viewState: StateFlow<UiState> = _viewState.asStateFlow()

    val currentState: UiState get() = viewState.value

    private val _event: MutableSharedFlow<Event> = MutableSharedFlow()

    private val _effect: Channel<Effect> = Channel()
    val effect = _effect.receiveAsFlow()

    init {
        subscribeToEvents()
    }

    private fun subscribeToEvents() {
        viewModelScope.launch {
            _event.collect {
                handleEvents(it)
            }
        }
    }

    fun setEvent(event: Event) {
        viewModelScope.launch { _event.emit(event) }
    }

    protected fun setState(reducer: UiState.() -> UiState) {
        val newState = viewState.value.reducer()
        viewModelScope.launch { _viewState.emit(newState) }
    }

    protected fun setEffect(builder: () -> Effect) {
        val effectValue = builder()
        viewModelScope.launch { _effect.send(effectValue) }
    }

    fun <T> executeCatching(
        block: suspend () -> T,
        onError: ((Throwable, String) -> Unit)? = null,
        withLoading: Boolean = true,
    ) {
        viewModelScope.launch {
            try {
                if (withLoading) globalState.loading(true)
                block.invoke()
                if (withLoading) globalState.loading(false)
            } catch (e: kotlin.coroutines.cancellation.CancellationException) {
                onError?.invoke(e, "")
            } catch (e: java.util.concurrent.CancellationException) {
                onError?.invoke(e, "")
            } catch (e: kotlinx.coroutines.CancellationException) {
                onError?.invoke(e, "")
            } catch (throwable: Throwable) {
                if (BuildConfig.DEBUG) throwable.printStackTrace()
                val errorMessage = when (throwable) {
                    is UnknownHostException -> {
                        "No internet connection, please check your connection and try again."
                    }
                    is java.net.SocketTimeoutException,
                    is ConnectTimeoutException,
                    -> {
                        "Looks like the server is taking too long to respond, please try again later."
                    }
                    else -> {
                        throwable.localizedMessage
                    }
                }
                globalState.error(errorMessage, withLoading)
                onError?.invoke(throwable, errorMessage)
            }
        }
    }

    fun <T> executeSilent(
        block: suspend () -> T,
        onError: (() -> Unit)? = null,
        onComplete: (() -> Unit)? = null,
        scope: CoroutineScope = viewModelScope,
    ) {
        scope.launch {
            try {
                block.invoke()
            } catch (throwable: Throwable) {
                if (BuildConfig.DEBUG) throwable.printStackTrace()
                onError?.invoke()
            }
            onComplete?.invoke()
        }
    }
}