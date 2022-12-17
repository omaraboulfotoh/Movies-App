package com.android.moviesapp.presentation.moviesList

import com.android.model.movie.MovieModel
import com.android.moviesapp.presentation.base.ViewEvent
import com.android.moviesapp.presentation.base.ViewSideEffect
import com.android.moviesapp.presentation.base.ViewState

class MoviesListContract {
    data class State(
        val list: List<MovieModel> = listOf(),
        val page: Int = 1,
        val isLoadingMore: Boolean = false,
    ) : ViewState

    sealed class Event : ViewEvent {
        object FetchList : Event()
        object ReachedListEnd : Event()
        data class OnItemClick(val position: Int) : Event()
    }

    sealed class Effect : ViewSideEffect {
        sealed class Navigation : Effect() {
            data class GoToMovieDetails(val item: MovieModel) : Navigation()
        }
    }
}