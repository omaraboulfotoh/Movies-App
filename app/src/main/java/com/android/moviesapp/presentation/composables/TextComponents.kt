package com.android.moviesapp.presentation.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.android.moviesapp.presentation.theme.MovieTheme
import com.android.moviesapp.presentation.theme.OpenSans

@Composable
fun Title(
    text: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = MovieTheme.colors.primaryText,
    isUpperCase: Boolean = true,
    style: TextStyle = MovieTheme.typography.h7Bold,
) {
    Text(
        text = if (isUpperCase) text.uppercase() else text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        color = color,
        style = style,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun SectionTitle(
    text: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = MovieTheme.colors.primaryText,
    style: TextStyle = MovieTheme.typography.h5Bold,
) =
    Title(
        text,
        modifier,
        maxLines,
        textAlign,
        color,
        isUpperCase = false,
        style
    )

@Composable
fun MultipleStylesInText(
    text1: String, text2: String,
    modifier: Modifier = Modifier,
) {
    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(
                fontFamily = OpenSans,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )) {
                append(text1)
            }

            withStyle(style = SpanStyle(
                fontFamily = OpenSans,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )) {
                append(text2)
            }
        }
    )
}

@Composable
fun MessageBody(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = MovieTheme.colors.secondaryText,
    style: TextStyle = MovieTheme.typography.body1Medium,
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        color = color,
        style = style,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun Subtitle(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = MovieTheme.colors.secondaryText,
    style: TextStyle = MovieTheme.typography.subtitle1,
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        color = color,
        style = style,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun MessageBodyBold(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = MovieTheme.colors.primaryText,
    style: TextStyle = MovieTheme.typography.body1Bold,
) = MessageBody(text, modifier, maxLines, textAlign, color, style)

@Composable
fun DescriptionBody(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = MovieTheme.colors.primaryText,
    style: TextStyle = MovieTheme.typography.body2,
) = MessageBody(text, modifier, maxLines, textAlign, color, style)

@Composable
fun DescriptionBody(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = MovieTheme.colors.primaryText,
    style: TextStyle = MovieTheme.typography.body2,
) = Text(
    text = text,
    modifier = modifier,
    maxLines = maxLines,
    textAlign = textAlign,
    color = color,
    style = style,
    overflow = TextOverflow.Ellipsis
)

@Composable
fun OverLine(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = MovieTheme.colors.primaryText,
    style: TextStyle = MovieTheme.typography.overline,
) = Text(
    text = text,
    modifier = modifier,
    maxLines = maxLines,
    textAlign = textAlign,
    color = color,
    style = style,
    overflow = TextOverflow.Ellipsis
)

@Composable
fun OverLineBold(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = MovieTheme.colors.primaryText,
    style: TextStyle = MovieTheme.typography.overlineBold,
) = OverLine(text, modifier, maxLines, textAlign, color, style)

@Composable
fun ClickableText(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color = MovieTheme.colors.white,
    style: TextStyle = MovieTheme.typography.h7Bold.copy(textDecoration = TextDecoration.Underline),
    textAlign: TextAlign = TextAlign.Start,
    isEnabled: Boolean = true,
) {
    Text(
        text = text,
        modifier = modifier.clickable(enabled = isEnabled, onClick = onClick),
        style = style,
        color = color,
        textAlign = textAlign,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun Header4Bold(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = MovieTheme.colors.primaryText,
) =
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        color = color,
        style = MovieTheme.typography.h4Bold,
        overflow = TextOverflow.Ellipsis
    )

@Composable
fun Caption(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = MovieTheme.colors.primaryText,
    isBold: Boolean = false,
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        color = color,
        style = if (isBold) MovieTheme.typography.captionBold else MovieTheme.typography.caption,
        overflow = TextOverflow.Ellipsis
    )
}
