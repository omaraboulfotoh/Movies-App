package com.android.network.datasource.impl

import com.android.model.movie.MovieModel
import com.android.model.responses.base.MoviesListResponse
import com.android.model.responses.base.pagination.PaginatedArrayResponseWrapper
import com.android.network.datasource.MovieRemoteDataSource
import com.android.network.service.MovieApiServices
import retrofit2.Response
import javax.inject.Inject


class MovieRemoteDataSourceImp @Inject constructor(private val apiServices: MovieApiServices) :
    MovieRemoteDataSource {
    override suspend fun getTrendMovies(
        apiKey: String,
        page: Int,
    ): Response<MoviesListResponse> =
        apiServices.getTrendMovies(apiKey, page)
}