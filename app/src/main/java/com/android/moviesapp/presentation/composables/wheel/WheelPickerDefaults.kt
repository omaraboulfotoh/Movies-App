package com.android.moviesapp.presentation.composables.wheel

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * The default implementation of focus view in vertical.
 */
@Composable
fun FWheelPickerFocusVertical(
    modifier: Modifier = Modifier,
    dividerSize: Dp = 1.dp,
    dividerColor: Color = DefaultDividerColor,
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(dividerColor)
                .height(dividerSize)
                .fillMaxWidth()
                .align(Alignment.TopCenter),
        )
        Box(
            modifier = Modifier
                .background(dividerColor)
                .height(dividerSize)
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
        )
    }
}

/**
 * The default implementation of focus view in horizontal.
 */
@Composable
fun FWheelPickerFocusHorizontal(
    modifier: Modifier = Modifier,
    dividerSize: Dp = 1.dp,
    dividerColor: Color = Color.Transparent,
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(dividerColor)
                .width(dividerSize)
                .fillMaxHeight()
                .align(Alignment.CenterStart),
        )
        Box(
            modifier = Modifier
                .background(dividerColor)
                .width(dividerSize)
                .fillMaxHeight()
                .align(Alignment.CenterEnd),
        )
    }
}

/**
 * Default divider color.
 */
private val DefaultDividerColor: Color
    @Composable
    get() {
        return (
            if (isSystemInDarkTheme()) {
                Color.White
            } else {
                Color.Black
            }
            ).copy(alpha = 0.2f)
    }

/**
 * Default content wrapper.
 */
val DefaultWheelPickerContentWrapper: @Composable FWheelPickerContentWrapperScope.(
    index: Int,
    state: FWheelPickerState
) -> Unit =
    { index, state ->
        val isFocus = index == state.currentIndexSnapshot
        val alpha = if (isFocus) 1.0f else 0.3f
        val scale = if (isFocus) 1.0f else 0.8f
        val animateScale by animateFloatAsState(scale)
        Box(
            modifier = Modifier
                .alpha(alpha)
                .scale(animateScale),
        ) {
            content(index)
        }
    }
