package com.android.moviesapp.presentation.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.android.moviesapp.presentation.theme.MovieTheme
import com.android.moviesapp.presentation.theme.Shapes

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier.fillMaxWidth(),
    background: Color = MovieTheme.colors.primaryButtonColor,
    disabledBackground: Color = MovieTheme.colors.primaryButtonDisableColor,
    textColor: Color = MovieTheme.colors.primaryButtonTextColor,
    textColorDisabled: Color = MovieTheme.colors.primaryButtonTextColorDisabled,
    enabled: Boolean = true,
) {
    Button(
        onClick = onClick,
        shape = Shapes.medium,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = background,
            disabledBackgroundColor = disabledBackground
        ),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp
        ),
        modifier = modifier.defaultMinSize(minHeight = 46.dp),
        enabled = enabled
    ) {
        MessageBodyBold(
            text = text.uppercase(),
            color = if (enabled)textColor else textColorDisabled ,
            style = MovieTheme.typography.body1Bold
        )
    }
}

@Composable
fun PrimaryOutlinedButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier.fillMaxWidth(),
    enabled: Boolean = true,
    stroke: Color = MovieTheme.colors.stroke,
    icon: ImageVector? = null,
) {

    OutlinedButton(
        modifier = modifier.defaultMinSize(minHeight = 46.dp),
        onClick = onClick,
        shape = Shapes.medium,
        enabled = enabled,
        colors = ButtonDefaults.outlinedButtonColors(),
        border = BorderStroke(1.dp, stroke),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp
        )
    ) {

        icon?.let {
            Image(imageVector = icon, contentDescription = "")
            Spacer(modifier = Modifier.width(MovieTheme.spacing.spacerMini))
        }

        MessageBody(
            text = text,
            style = MovieTheme.typography.subtitle1SemiBold,
            color = MovieTheme.colors.black
        )
    }
}
