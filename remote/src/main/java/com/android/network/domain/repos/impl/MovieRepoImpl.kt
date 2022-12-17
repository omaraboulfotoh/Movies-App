package com.android.network.domain.repos.impl

import androidx.annotation.WorkerThread
import com.android.model.movie.MovieModel
import com.android.model.responses.base.MoviesListResponse
import com.android.network.datasource.MovieRemoteDataSource
import com.android.network.domain.repos.MovieRepo
import com.android.network.states.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

@WorkerThread
class MovieRepoImpl @Inject constructor(var movieRemoteDataSource: MovieRemoteDataSource) :
    MovieRepo {
    override suspend fun getTrendMovies(
        apiKey: String,
        page: Int,
    ): Flow<Result<MoviesListResponse>> = flow {
        try {
            movieRemoteDataSource.getTrendMovies(apiKey, page).let {
                if (it.isSuccessful) {
                    emit(Result.Success(it.body()!!))
                } else
                    Result.Error(
                        MoviesListResponse(),
                        "error will be handled"
                    )
            }
        } catch (throwable: Throwable) {
            emit(
                Result.Error(
                    MoviesListResponse(),
                    throwable.message
                )
            )
        }
    }.onStart { emit(Result.Loading()) }.flowOn(Dispatchers.IO)

    override suspend fun getMovieDetails(apiKey: String, movieId: Int): Flow<Result<MovieModel>> =
        flow {
            try {
                movieRemoteDataSource.getMovieDetails(apiKey, movieId).let {
                    if (it.isSuccessful) {
                        emit(Result.Success(it.body()!!))
                    } else
                        Result.Error(
                            MovieModel(),
                            "error will be handled"
                        )
                }
            } catch (throwable: Throwable) {
                emit(
                    Result.Error(
                        MovieModel(),
                        throwable.message
                    )
                )
            }
        }.onStart { emit(Result.Loading()) }.flowOn(Dispatchers.IO)


}