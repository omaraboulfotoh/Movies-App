package com.android.network.service

import com.android.model.movie.MovieModel
import com.android.model.responses.base.MoviesListResponse
import com.android.model.responses.base.pagination.PaginatedArrayResponseWrapper
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface MovieApiServices {

    @GET("discover/movie")
    suspend fun getTrendMovies(@Query("api_key") apiKey: String, @Query("page") page: Int):
            Response<MoviesListResponse>
}

