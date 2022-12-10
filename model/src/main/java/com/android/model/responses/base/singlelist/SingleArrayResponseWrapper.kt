package com.android.model.responses.base.singlelist

import com.squareup.moshi.JsonClass

/**
 * Created by Mohamed Shalan on 6/10/20.
 */

@JsonClass(generateAdapter = true)
data class SingleArrayResponseWrapper<T>(val data: List<T>)
