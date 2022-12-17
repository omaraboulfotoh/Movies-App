package com.android.network.service

import com.android.model.movie.MovieModel
import com.android.model.responses.base.MoviesListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface MovieApiServices {

    @GET("discover/movie")
    suspend fun getTrendMovies(
        @Query("api_key") apiKey: String,
        @Query("page") page: Int,
    ):
            Response<MoviesListResponse>

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String,
    ): Response<MovieModel>
}

