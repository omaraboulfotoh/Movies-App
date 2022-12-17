package com.android.model.responses.base

import android.os.Parcelable
import com.android.model.movie.MovieModel
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize


@Parcelize
@JsonClass(generateAdapter = true)
data class MoviesListResponse(
    val results: List<MovieModel> = listOf(),
    val page: Int = 0,
    @Json(name = "total_pages")
    val totalPages: Int = 0,
    @Json(name = "total_results")
    val totalResults: Int = 0,
) : Parcelable