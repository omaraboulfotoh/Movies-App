package com.android.moviesapp.common

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.material.BottomSheetScaffoldState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.flowWithLifecycle
import com.android.moviesapp.presentation.base.BaseViewModel
import com.android.moviesapp.presentation.base.SIDE_EFFECTS_KEY
import com.android.moviesapp.presentation.base.ViewSideEffect
import com.android.moviesapp.presentation.base.ViewState
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

@Composable
fun <T : ViewSideEffect> Flow<T>.consume(action: (effect: T) -> Unit) {
    LaunchedEffect(SIDE_EFFECTS_KEY) { onEach(action).collect() }
}

@Composable
fun <T : R, R : ViewState> Flow<T>.collectWhenStarted(
    initial: R,
    context: CoroutineContext = EmptyCoroutineContext
): State<R> {
    val lifecycleAwareFlow = rememberFlow(flow = this)
    return lifecycleAwareFlow.collectAsState(initial = initial, context = context)
}

@Composable
fun <T> rememberFlow(
    flow: Flow<T>,
    lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current
): Flow<T> =
    remember(key1 = flow, key2 = lifecycleOwner) {
        flow.flowWithLifecycle(lifecycleOwner.lifecycle, Lifecycle.State.STARTED)
    }

@Composable
fun <T : ViewState> BaseViewModel<*, T, *>.viewState() =
    viewState.collectAsState().value

@Composable
fun <T : ViewSideEffect> BaseViewModel<*, *, T>.sideEffect(action: (effect: T) -> Unit) =
    effect.consume(action = action)

@Composable
fun animateAlignmentAsState(
    targetAlignment: Alignment,
): State<Alignment> {
    val biased = targetAlignment as BiasAlignment
    val horizontal by animateFloatAsState(
        biased.horizontalBias,
        animationSpec = spring(stiffness = Spring.StiffnessLow)
    )
    val vertical by animateFloatAsState(
        biased.verticalBias,
        animationSpec = spring(stiffness = Spring.StiffnessVeryLow)
    )
    return derivedStateOf { BiasAlignment(horizontal, vertical) }
}

@OptIn(ExperimentalMaterialApi::class)
fun BottomSheetScaffoldState.trigger(coroutineScope: CoroutineScope) {

    coroutineScope.launch {
        if (bottomSheetState.isCollapsed) bottomSheetState.expand()
        else bottomSheetState.collapse()
    }
}
