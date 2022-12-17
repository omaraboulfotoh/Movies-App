package com.abs.app.presentation.app

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

data class ConfirmationDialogParams(
    val title: String,
    val description: String,
    val positiveButtonTitle: String,
    val onPositive: () -> Unit,
    val negativeButtonTitle: String,
    val onNegative: (() -> Unit)? = null
)

interface IGlobalState {
    val loadingState: State<Boolean>
    val errorState: State<String?>
    val successState: State<String?>
    val confirmationState: State<ConfirmationDialogParams?>
    val appLoaded: State<Boolean>

    fun idle()
    fun loading(show: Boolean)
    fun error(msg: String, hideLoading: Boolean = true)
    fun error(msgs: List<String>, hideLoading: Boolean = true)
    fun success(msg: String, hideLoading: Boolean = true)
    fun confirmationDialog(params: ConfirmationDialogParams, hideLoading: Boolean = true)
    fun appLoaded()
}

class GlobalState : IGlobalState {
    override val loadingState = mutableStateOf(false)
    override val errorState = mutableStateOf<String?>(null)
    override val successState = mutableStateOf<String?>(null)
    override val confirmationState = mutableStateOf<ConfirmationDialogParams?>(null)
    override val appLoaded = mutableStateOf(false)

    override fun idle() {
        loadingState.value = false
        errorState.value = null
        successState.value = null
        confirmationState.value = null
    }

    override fun loading(show: Boolean) {
        errorState.value = null
        confirmationState.value = null
        successState.value = null
        loadingState.value = show
    }

    override fun error(msg: String, hideLoading: Boolean) {
        if (hideLoading) loadingState.value = false
        confirmationState.value = null
        successState.value = null
        errorState.value = msg
    }

    override fun error(msgs: List<String>, hideLoading: Boolean) {
        if (hideLoading) loadingState.value = false
        confirmationState.value = null
        successState.value = null
        errorState.value = msgs.joinToString("\n")
    }

    override fun success(msg: String, hideLoading: Boolean) {
        if (hideLoading) loadingState.value = false
        confirmationState.value = null
        errorState.value = null
        successState.value = msg
    }

    override fun confirmationDialog(params: ConfirmationDialogParams, hideLoading: Boolean) {
        if (hideLoading) loadingState.value = false
        errorState.value = null
        successState.value = null
        confirmationState.value = params
    }

    override fun appLoaded() {
        appLoaded.value = true
    }
}
