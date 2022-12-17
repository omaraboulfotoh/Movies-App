package com.android.moviesapp.presentation.movieDetails

import com.android.model.movie.MovieModel
import com.android.moviesapp.presentation.base.ViewEvent
import com.android.moviesapp.presentation.base.ViewSideEffect
import com.android.moviesapp.presentation.base.ViewState

class MovieDetailsContract {
    data class State(
        val movie: MovieModel? = null,
    ) : ViewState

    sealed class Event : ViewEvent {
        data class GetMovieDetails(val movie: MovieModel?) : Event()
        object OnBackCLicked : Event()
    }

    sealed class Effect : ViewSideEffect {
        sealed class Navigation : Effect() {
            object GoBack : Navigation()
        }
    }
}