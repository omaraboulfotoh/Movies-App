package com.android.moviesapp.presentation.splash

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.android.moviesapp.common.getActivity
import com.android.moviesapp.common.sideEffect
import com.android.moviesapp.common.viewState
import com.android.moviesapp.presentation.app.MainActivity
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
    val intent = LocalContext.current.getActivity<MainActivity>()?.intent

    viewModel.sideEffect { effect ->
        when (effect) {
            SplashContract.Effect.Navigation.GoToHome -> {}
        }
    }

    SplashScreenContent(state = state)
}