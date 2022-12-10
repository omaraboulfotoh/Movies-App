package com.android.model.responses.base

import com.squareup.moshi.JsonClass

/**
 * Created by Mohamed Shalan on 6/12/20.
 */

@JsonClass(generateAdapter = true)
data class BaseWrapper<T>(val data: T, val message: String? = null)
