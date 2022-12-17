package com.android.network.states

sealed class Result<T>(
    var data: T? = null,
    var message: String? = null,
    var errors: Map<String, String>? = null,
) : IResult<T> {
    class Success<T>(data: T) : Result<T>(data)
    class Loading<T>(data: T? = null) : Result<T>(data)
    class Error<T>(data: T? = null, message: String?) : Result<T>(data, message)
}