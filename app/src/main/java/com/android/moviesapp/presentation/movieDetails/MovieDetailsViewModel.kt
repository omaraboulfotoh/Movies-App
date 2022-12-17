package com.android.moviesapp.presentation.movieDetails

import com.abs.app.presentation.app.IGlobalState
import com.android.model.movie.MovieModel
import com.android.moviesapp.BuildConfig
import com.android.moviesapp.common.orOne
import com.android.moviesapp.presentation.base.BaseViewModel
import com.android.moviesapp.presentation.movieDetails.MovieDetailsContract.*
import com.android.network.domain.usecases.MovieUseCase
import com.android.network.states.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MovieDetailsViewModel @Inject constructor(
    globalState: IGlobalState,
    private val movieUseCase: MovieUseCase,
) : BaseViewModel<Event, State, Effect>(
    globalState
) {

    private var isInitialized = false

    override fun setInitialState() = State()
    override fun handleEvents(event: Event) {
        when (event) {
            is Event.GetMovieDetails -> fetchMovieDetails(event.movie)
            Event.OnBackCLicked -> setEffect { Effect.Navigation.GoBack }
        }
    }

    private fun fetchMovieDetails(movie: MovieModel?) = executeCatching({
        if (!isInitialized) {
            setState { currentState.copy(movie = movie) }
            movieUseCase.getMovieDetails(BuildConfig.MDB_ID, movie?.id.orOne())
                .collect {
                    isInitialized = true
                    handleResponse(it)
                }
        }
    })

    private fun handleResponse(result: Result<MovieModel>) {
        when (result) {
            is Result.Error -> globalState.error(result.message.orEmpty())
            is Result.Loading -> globalState.loading(true)
            is Result.Success -> {
                result.data?.let {
                    setState { currentState.copy(movie = it) }
                }
            }
        }
    }
}
