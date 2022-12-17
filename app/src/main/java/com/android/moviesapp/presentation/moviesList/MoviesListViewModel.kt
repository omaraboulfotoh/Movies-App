package com.android.moviesapp.presentation.moviesList

import com.abs.app.presentation.app.IGlobalState
import com.android.model.responses.base.MoviesListResponse
import com.android.moviesapp.BuildConfig
import com.android.moviesapp.presentation.base.BaseViewModel
import com.android.moviesapp.presentation.moviesList.MoviesListContract.*
import com.android.network.domain.usecases.MovieUseCase
import com.android.network.states.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MoviesListViewModel @Inject constructor(
    globalState: IGlobalState,
    private val movieUseCase: MovieUseCase,
) : BaseViewModel<Event, State, Effect>(
    globalState
) {


    private var isInitialized = false

    override fun setInitialState() = State()

    override fun handleEvents(event: Event) {
        when (event) {
            Event.FetchList -> initMoviesList()
            Event.ReachedListEnd -> loadMoreMovies()
            is Event.OnItemClick -> navigateToDetails(event.position)

        }
    }

    private fun initMoviesList() = executeCatching({
        if (!isInitialized) {
            movieUseCase.getTrendMovies(BuildConfig.MDB_ID, currentState.page)
                .collect {
                    isInitialized = true
                    handleResponse(it)
                }
        }
    })

    private fun loadMoreMovies() = executeCatching({
        setState { currentState.copy(isLoadingMore = true) }
        movieUseCase.getTrendMovies("c9856d0cb57c3f14bf75bdc6c063b8f3", currentState.page)
            .collect {
                isInitialized = true
                handleResponse(it)
            }
    })

    private fun handleResponse(result: Result<MoviesListResponse>) {
        when (result) {
            is Result.Error -> globalState.error(result.message.orEmpty())
            is Result.Loading -> globalState.loading(true)
            is Result.Success -> {
                val updatedList = currentState.list.toMutableList()
                updatedList.addAll(result.data?.results.orEmpty())
                setState {
                    currentState.copy(list = updatedList,
                        page = page + 1,
                        isLoadingMore = false)
                }
            }
        }
    }


    private fun navigateToDetails(position: Int) {
        val item = currentState.list[position]
        setEffect { Effect.Navigation.GoToMovieDetails(item) }

    }

}