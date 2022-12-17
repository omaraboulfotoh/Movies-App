package com.android.moviesapp.presentation.splash

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.android.moviesapp.common.navigateAndClearBackStack
import com.android.moviesapp.common.sideEffect
import com.android.moviesapp.common.viewState
import com.android.moviesapp.presentation.destinations.MoviesListScreenDestination
import com.android.moviesapp.presentation.splash.SplashContract.Effect
import com.android.moviesapp.presentation.splash.SplashContract.Event
import com.android.moviesapp.presentation.splash.composables.SplashScreenContent
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@RootNavGraph(start = true)
@Destination
@Composable
fun SplashScreen(
    viewModel: SplashViewModel = hiltViewModel(),
    navigator: DestinationsNavigator,
) {
    val state = viewModel.viewState()

    viewModel.setEvent(Event.StartScreen)
    viewModel.sideEffect { effect ->
        when (effect) {
            Effect.Navigation.GoToHome ->
                navigator.navigateAndClearBackStack(MoviesListScreenDestination)
        }
    }

    SplashScreenContent(state = state)
}