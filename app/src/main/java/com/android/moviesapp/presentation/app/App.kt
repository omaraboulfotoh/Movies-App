package com.android.moviesapp.presentation.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.abs.app.presentation.app.IGlobalState
import com.android.moviesapp.R
import com.android.moviesapp.presentation.composables.ConfirmationMessageDialog
import com.android.moviesapp.presentation.composables.DefaultMessageDialog
import com.android.moviesapp.presentation.theme.AbsComposeTheme
import com.android.moviesapp.presentation.common.Progress

@Composable
fun App(globalState: IGlobalState) {
    AbsComposeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {

            if (globalState.loadingState.value) {
                Progress()

            }

            if (globalState.errorState.value != null) {
                DefaultMessageDialog(
                    title = stringResource(R.string.error),
                    body = globalState.errorState.value!!,
                    buttonText = stringResource(R.string.got_it),
                    onNegative = {
                        globalState.idle()
                    },
                    onPositive = {
                        globalState.idle()
                    }
                )
            }

            if (globalState.successState.value != null) {
                DefaultMessageDialog(
                    title = stringResource(R.string.success),
                    body = globalState.successState.value!!,
                    buttonText = stringResource(R.string.got_it),
                    onNegative = {
                        globalState.idle()
                    },
                    onPositive = {
                        globalState.idle()
                    }
                )
            }

            if (globalState.confirmationState.value != null) {
                val state = globalState.confirmationState.value!!
                ConfirmationMessageDialog(
                    title = state.title,
                    body = state.description,
                    positiveButtonText = state.positiveButtonTitle,
                    negativeButtonText = state.negativeButtonTitle,
                    onNegative = {
                        globalState.idle()
                        state.onNegative?.invoke()
                    },
                    onPositive = {
                        globalState.idle()
                        state.onPositive.invoke()
                    }
                )
            }
        }
    }
}
