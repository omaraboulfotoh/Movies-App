package com.android.model.responses.base.pagination

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by Mohamed Shalan on 6/3/20.
 */

@JsonClass(generateAdapter = true)
data class PageMeta(
	@Json(name = "current_page") val currentPage: Int,
	val from: Int?,
	@Json(name = "last_page") val lastPage: Int,
	val path: String,
	@Json(name = "per_page") val perPage: Int,
	val to: Int?,
	val total: Int
)
