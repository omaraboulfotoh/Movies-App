package com.android.moviesapp.presentation.composables.pager

import androidx.compose.foundation.layout.offset
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerScope
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import kotlin.math.absoluteValue

@OptIn(ExperimentalPagerApi::class)
fun Modifier.pagerOffsetAnimation(page: Int, pagerScope: PagerScope) =
    graphicsLayer {
        // Calculate the absolute offset for the current page from the
        // scroll position. We use the absolute value which allows us to mirror
        // any effects for both directions
        val pageOffset = pagerScope.calculateCurrentOffsetForPage(page).absoluteValue

        // We animate the scaleX + scaleY, between 85% and 100%
        lerp(
            start = 0.85f,
            stop = 1f,
            fraction = 1f - pageOffset.coerceIn(0f, 1f)
        ).also { scale ->
            scaleX = scale
            scaleY = scale
        }

        // We animate the alpha, between 50% and 100%
        alpha = lerp(
            start = 0.5f,
            stop = 1f,
            fraction = 1f - pageOffset.coerceIn(0f, 1f)
        )
    }

@OptIn(ExperimentalPagerApi::class)
fun Modifier.pagerItemOffset(page: Int, pagerScope: PagerScope) =
    offset {
        // Calculate the offset for the current page from the
        // scroll position
        val pageOffset =
            pagerScope.calculateCurrentOffsetForPage(page)
        // Then use it as a multiplier to apply an offset
        IntOffset(
            x = (36.dp * pageOffset).roundToPx(),
            y = 0
        )
    }
