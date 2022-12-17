package com.android.moviesapp.presentation.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class AbsSizing(
    val default: Dp = 0.dp,

    // normalized //TODO AGREE ON THE NAMING
    val half: Dp = .5.dp,
    val unit: Dp = 1.dp,
    val x_small: Dp = 16.dp,
    val small: Dp = 24.dp,
    val small_x: Dp = 32.dp,
    val medium: Dp = 48.dp,
    val patrolCardHeightMissionDetails: Dp = 200.dp,
    val patrolCardHeightLogbook: Dp = 134.dp
)

val LocalAbsSizing = staticCompositionLocalOf { AbsSizing() }
