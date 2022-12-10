package com.android.model.responses.base

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by Mohamed Shalan on 1/5/21
 */

@JsonClass(generateAdapter = true)
class BaseWrapperWithErrorCode<T>(
    val data: T,
    val message: String?,
    @Json(name = "error_code") val errorCode: Long? = null
)