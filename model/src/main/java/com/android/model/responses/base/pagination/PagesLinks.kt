package com.android.model.responses.base.pagination

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by Mohamed Shalan on 6/3/20.
 */

@JsonClass(generateAdapter = true)
data class PagesLinks(
	val first: String?,
	val last: String?,
	@Json(name = "prev") val previous: String?,
	val next: String?
)
