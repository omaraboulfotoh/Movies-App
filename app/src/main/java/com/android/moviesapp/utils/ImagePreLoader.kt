package com.android.moviesapp.utils

import android.content.Context
import coil.imageLoader
import coil.request.ImageRequest
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ImagesPreLoader @Inject constructor(
    @ApplicationContext private val context: Context
) {
    fun preLoadImage(imageUrl: String) {
        val request = ImageRequest.Builder(context)
            .data(imageUrl)
            .build()
        context.imageLoader.enqueue(request)
    }
}
