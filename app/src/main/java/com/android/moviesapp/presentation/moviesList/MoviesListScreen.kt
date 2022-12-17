package com.android.moviesapp.presentation.moviesList

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.android.moviesapp.common.sideEffect
import com.android.moviesapp.common.viewState
import com.android.moviesapp.presentation.destinations.MovieDetailsScreenDestination
import com.android.moviesapp.presentation.moviesList.composables.MoviesListScreenContent
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
@Destination
fun MoviesListScreen(
    viewModel: MoviesListViewModel = hiltViewModel(),
    navigator: DestinationsNavigator,
) {
    val state = viewModel.viewState()
    viewModel.setEvent(MoviesListContract.Event.FetchList)


    viewModel.sideEffect { effect ->
        when (effect) {
            is MoviesListContract.Effect.Navigation.GoToMovieDetails -> navigator.navigate(
                MovieDetailsScreenDestination(effect.item))
        }
    }

    // screen content
    MoviesListScreenContent(state = state) { viewModel.setEvent(it) }

}