package com.android.moviesapp.presentation.composables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.android.moviesapp.presentation.base.UiError
import com.android.moviesapp.presentation.base.UiLoading
import com.android.moviesapp.R
import com.android.moviesapp.presentation.common.Progress

@Composable
fun UiError.Catch(
    unCaught: @Composable (error: UiError) -> Unit = {},
    onNegative: () -> Unit = {},
    onPositive: () -> Unit = {}
) {
    when (this) {
        is UiError.Dialog ->
            DefaultMessageDialog(
                title = stringResource(id = title),
                body = body ?: stringResource(id = bodyStrRes ?: R.string.unknown),
                buttonText = stringResource(id = button),
                onNegative = onNegative,
                onPositive = onPositive
            )
        is UiError.Na -> Unit
        else -> unCaught(this)
    }
}

@Composable
fun UiLoading.Catch(
    unCaught: @Composable (loading: UiLoading) -> Unit = {}
) {
    when (this) {
        is UiLoading.Blocking ->
            Progress()
        is UiLoading.Na -> Unit
        else -> unCaught(this)
    }
}

/**
 * In some situations you might want to capture a value in your effect that, if it changes, you do
 * not want the effect to restart. In order to do this, it is required to use rememberUpdatedState
 * to create a reference to this value which can be captured and updated. This approach is helpful
 * for effects that contain long-lived operations that may be expensive or prohibitive to recreate
 * and restart.
 */
@Composable
fun LifecycleOwner.LifecycleEffect(
    onCreate: () -> Unit = {},
    onStart: () -> Unit = {},
    onResume: () -> Unit = {},
    onPause: () -> Unit = {},
    onStop: () -> Unit = {},
    onDestroy: () -> Unit = {}
) {
    val rememberedCreate by rememberUpdatedState { onCreate() }
    val rememberedStart by rememberUpdatedState { onStart() }
    val rememberedResume by rememberUpdatedState { onResume() }
    val rememberedPause by rememberUpdatedState { onPause() }
    val rememberedStop by rememberUpdatedState { onStop() }
    val rememberedDestroy by rememberUpdatedState { onDestroy() }

    DisposableEffect(this) {
        val observer = LifecycleEventObserver { _, event ->
            when (event) {
                Lifecycle.Event.ON_CREATE -> rememberedCreate()
                Lifecycle.Event.ON_START -> rememberedStart()
                Lifecycle.Event.ON_RESUME -> rememberedResume()
                Lifecycle.Event.ON_PAUSE -> rememberedPause()
                Lifecycle.Event.ON_STOP -> rememberedStop()
                Lifecycle.Event.ON_DESTROY -> rememberedDestroy()
                else -> {}
            }
        }
        lifecycle.addObserver(observer)
        onDispose {
            lifecycle.removeObserver(observer)
        }
    }
}
