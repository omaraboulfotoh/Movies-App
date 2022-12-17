package com.android.network.domain.usecases

import com.android.network.domain.repos.MovieRepo
import javax.inject.Inject

class MovieUseCase @Inject constructor(private val movieRepo: MovieRepo) {

    suspend fun getTrendMovies(
        apiKey: String,
        page: Int,
    ) = movieRepo.getTrendMovies(apiKey, page)

    suspend fun getMovieDetails(
        apiKey: String,
        movieId: Int,
    ) = movieRepo.getMovieDetails(apiKey, movieId)

}