package com.android.moviesapp.presentation.composables

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.android.moviesapp.presentation.theme.MovieTheme
import com.android.moviesapp.presentation.theme.Shapes

@Composable
fun RemoteImage(
    imageUrl: String?,
    description: String? = null,
    modifier: Modifier = Modifier,
    alignment: Alignment = Alignment.Center,
    contentScale: ContentScale = ContentScale.Crop,
    alpha: Float = DefaultAlpha
) {
    AsyncImage(
        model = imageUrl,
        contentDescription = description,
        modifier = modifier,
        alignment = alignment,
        contentScale = contentScale,
        alpha = alpha,
        onError = { Log.e("RemoteImage", "${it.result.throwable}") },
        onLoading = { Log.i("RemoteImage", "$it") }
    )
}

@Composable
fun DashLine(
    modifier: Modifier = Modifier,
    height: Dp = MovieTheme.spacing.xs,
    width: Dp = 112.dp,
    background: Color = Color.Black
) {
    Spacer(
        modifier = modifier
            .height(height)
            .width(width)
            .background(background, Shapes.medium)
    )
}
