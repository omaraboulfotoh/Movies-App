package com.android.network.datasource.impl

import com.android.network.datasource.MovieRemoteDataSource
import com.android.network.service.MovieApiServices
import javax.inject.Inject


class MovieRemoteDataSourceImp @Inject constructor(private val apiServices: MovieApiServices) :
    MovieRemoteDataSource {
}