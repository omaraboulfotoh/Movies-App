package com.android.moviesapp.presentation.splash

import com.abs.app.presentation.app.IGlobalState
import com.android.moviesapp.presentation.base.BaseViewModel
import com.android.moviesapp.presentation.splash.SplashContract.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import javax.inject.Inject
import kotlin.time.Duration.Companion.seconds


@HiltViewModel
class SplashViewModel @Inject constructor(
    globalState: IGlobalState,
) : BaseViewModel<Event, State, Effect>(globalState) {

    override fun setInitialState() = State
    override fun handleEvents(event: Event) {
        when (event) {
            Event.StartScreen -> navigateToHome()
        }
    }

    private fun navigateToHome() = executeCatching({
        delay(2.seconds)
        setEffect { Effect.Navigation.GoToHome }
    })

}