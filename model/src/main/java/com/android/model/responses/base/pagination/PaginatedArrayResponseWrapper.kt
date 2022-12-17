package com.android.model.responses.base.pagination

import com.android.model.IPaginatedModel
import com.google.gson.annotations.SerializedName
import com.squareup.moshi.JsonClass

/**
 * Created by Mohamed Shalan on 6/3/20.
 */

@JsonClass(generateAdapter = true)
data class PaginatedArrayResponseWrapper<T>(
    val results: List<T> = listOf(),
    val page: Int = 0,
    @SerializedName("total_pages")
    val totalPages: Int = 0,
    @SerializedName("total_results")
    val totalResults: Int = 0,
) : IPaginatedModel {
}
