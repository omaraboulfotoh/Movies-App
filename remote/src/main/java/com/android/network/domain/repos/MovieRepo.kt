package com.android.network.domain.repos

import com.android.model.responses.base.MoviesListResponse
import com.android.network.states.Result
import kotlinx.coroutines.flow.Flow

interface MovieRepo {
    suspend fun getTrendMovies(
        apiKey: String,
        page: Int,
    ): Flow<Result<MoviesListResponse>>
}