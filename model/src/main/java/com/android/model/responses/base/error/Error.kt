package com.android.model.responses.base.error

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by Mohamed Shalan on 6/22/20.
 */

@JsonClass(generateAdapter = true)
data class Error(
    override val message: String,
    @Json(name = "error_code") val errorCode: Long? = null
) : IError

@JsonClass(generateAdapter = true)
data class AuthError(override val message: String, val errors: Map<String, String>) : IError