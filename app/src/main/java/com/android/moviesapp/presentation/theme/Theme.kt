package com.android.moviesapp.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

/**
 * will behave as our theme source
 */
object MovieTheme {
    val colors
        @Composable
        @ReadOnlyComposable
        get() = LocalAbsColor.current

    val typography
        @Composable
        @ReadOnlyComposable
        get() = LocalAbsTypography.current

    val sizing
        @Composable
        @ReadOnlyComposable
        get() = LocalAbsSizing.current

    val spacing
        @Composable
        @ReadOnlyComposable
        get() = LocalAbsSpacing.current
}

@Composable
fun AbsComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        color = Color.Black
    )
    CompositionLocalProvider(
        LocalAbsSpacing provides AbsSpacing(),
        LocalAbsColor provides AbsColors(),
        LocalAbsTypography provides AbsTypography(),
    ) {
        MaterialTheme(
            colors = ColorPalette,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}
