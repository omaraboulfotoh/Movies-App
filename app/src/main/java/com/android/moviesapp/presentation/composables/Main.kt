package com.android.moviesapp.presentation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.android.moviesapp.common.noRippleClickable
import com.android.moviesapp.presentation.theme.MovieTheme

@Composable
fun MbcAppBar(
    title: String = String(),
    modifier: Modifier = Modifier,
    navigationIcon: ImageVector? = Icons.Filled.ArrowBackIos,
    navigationIconTint: Color = MovieTheme.colors.smokeyBlack,
    actions: @Composable RowScope.() -> Unit = {},
    backgroundColor: Color = Color.Transparent,
    onNavigationClick: () -> Unit = {},
) {
    Row(
        modifier
            .background(backgroundColor)
            .padding(MovieTheme.spacing.primaryPadding)
    ) {

        navigationIcon?.let {
            Box(
                modifier = Modifier
                    .defaultMinSize(minWidth = 50.dp, minHeight = 50.dp)
                    .noRippleClickable(onClick = onNavigationClick)
            ) {
                Image(
                    imageVector = navigationIcon,
                    alignment = Alignment.CenterStart,
                    contentDescription = "navigate",
                    modifier = Modifier,
                    colorFilter = ColorFilter.tint(navigationIconTint)
                )
            }

        }

        Title(text = title, color = MovieTheme.colors.smokeyBlack)

        Row(content = actions)
    }
}

@Composable
fun MbcAppBarWithClose(
    title: String = String(),
    modifier: Modifier = Modifier,
    navigationIcon: ImageVector? = Icons.Filled.ArrowBackIos,
    navigationIconTint: Color = Color.White,
    gradient: Brush = MovieTheme.colors.primaryGradient,
    onNavigationClick: () -> Unit = {},
    onCloseClick: () -> Unit = {},
) {
    Row(
        modifier
            .background(gradient)
            .padding(MovieTheme.spacing.l)
    ) {

        navigationIcon?.let {
            Image(
                imageVector = navigationIcon,
                contentDescription = "navigate",
                modifier = Modifier.clickable(onClick = onNavigationClick),
                colorFilter = ColorFilter.tint(navigationIconTint)
            )
        }

        Title(
            text = title, color = MovieTheme.colors.white,
            modifier = Modifier.weight(1f)
        )

        Image(
            imageVector = Icons.Filled.Close,
            contentDescription = "close",
            modifier = Modifier.clickable(onClick = onCloseClick),
            colorFilter = ColorFilter.tint(navigationIconTint)
        )
    }
}


@Composable
fun EmptyMbcAppBar(title: String = String()) =
    MbcAppBar(title = title, navigationIcon = null)

@Composable
fun RowScope.MbcAppBarCloseAction(
    onClose: () -> Unit,
) {
    Image(
        imageVector = Icons.Filled.Close,
        contentDescription = "Close",
        modifier = Modifier.clickable(onClick = onClose)
    )
}
