package com.android.moviesapp.presentation.movieDetails

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.android.model.movie.MovieModel
import com.android.moviesapp.common.sideEffect
import com.android.moviesapp.common.viewState
import com.android.moviesapp.presentation.movieDetails.composables.MovieDetailsScreenContent
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
@Destination
fun MovieDetailsScreen(
    viewModel: MovieDetailsViewModel = hiltViewModel(),
    navigator: DestinationsNavigator,
    movie: MovieModel? = null,
) {

    val state = viewModel.viewState()
    viewModel.setEvent(MovieDetailsContract.Event.GetMovieDetails(movie = movie))


    viewModel.sideEffect { effect ->
        when (effect) {
            MovieDetailsContract.Effect.Navigation.GoBack -> navigator.navigateUp()
        }
    }

    // screen content
    MovieDetailsScreenContent(state = state) { viewModel.setEvent(it) }
}