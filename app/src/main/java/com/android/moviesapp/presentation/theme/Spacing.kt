package com.android.moviesapp.presentation.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class AbsSpacing(
    val default: Dp = 0.dp,

    // normalized //TODO AGREE ON THE NAMING
    val unit: Dp = 1.dp,
    val extra_xxs: Dp = 2.dp,
    val xxs: Dp = 4.dp,
    val xs: Dp = 8.dp,
    val s: Dp = 12.dp,
    val m: Dp = 16.dp,
    val l: Dp = 24.dp,
    val xl: Dp = 32.dp,
    val xxl: Dp = 48.dp,
    val padding: Dp = 8.dp,
    val primaryPadding: Dp = 18.dp,
    val paddingLarge: Dp = xl,
    val paddingLargeExtra: Dp = 40.dp,
    val rowSpacing: Dp = 20.dp,
    val spacerMax: Dp = 148.dp,
    val spacerXXL: Dp = xxl,
    val spacerXL: Dp = xl,
    val spacerL: Dp = 24.dp,
    val spacer: Dp = 15.dp,
    val spacerM: Dp = 20.dp,
    val spacerMini: Dp = 10.dp,
    val cardPadding: Dp = s,
    val briefingIconsDimen: Dp = 72.dp

)

val LocalAbsSpacing = staticCompositionLocalOf { AbsSpacing() }
