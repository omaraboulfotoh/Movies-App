package com.android.model.movie

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class MovieModel(
    @Json(name = "id")
    val id: Int? = null,
    @Json(name = "original_title")
    val originalTitle: String? = null,
    @Json(name = "title")
    val title: String? = null,
    @Json(name = "overview")
    val overview: String? = null,
    @Json(name = "popularity")
    val popularity: Double? = null,
    @Json(name = "status")
    val status: String? = null,
    @Json(name = "tagline")
    val tagline: String? = null,
    @Json(name = "homepage")
    val homepage: String? = null,
    @Json(name = "backdrop_path")
    val backdrop: String? = null,
    @Json(name = "poster_path")
    val poster: String? = null,
    @Json(name = "release_date")
    val releaseDate: String? = null,
    @Json(name = "vote_average")
    val voteAverage: Float? = null,
    @Json(name = "vote_count")
    val voteCount: Int? = null,
    @Json(name = "adult")
    val adult: Boolean? = null,
) : Parcelable