package com.android.moviesapp.presentation.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.android.moviesapp.R

internal val OpenSans: FontFamily =
    FontFamily(
        Font(R.font.opensans_regular),
        Font(R.font.opensans_medium, FontWeight.Medium),
        Font(R.font.opensans_light, FontWeight.Light),
        Font(R.font.opensans_semibold, FontWeight.SemiBold),
        Font(R.font.opensans_bold, FontWeight.Bold),
        Font(R.font.opensans_extrabold, FontWeight.ExtraBold)
    )

val Typography = Typography(defaultFontFamily = OpenSans)

/**
 * from my perspective TextStyles shouldn't have colors and should be abstract
 * colors should be applied later on for Text components
 * refer to @see [https://material.io/design/typography/the-type-system.html#type-scale]
 */
@Immutable
data class AbsTypography(
    val h1Bold: TextStyle =
        TextStyle(
            fontFamily = OpenSans,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 42.sp
        ),
    val h2Bold: TextStyle =
        TextStyle(
            fontFamily = OpenSans,
            fontSize = 56.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 56.sp
        ),
    val h3Bold: TextStyle =
        TextStyle(
            fontFamily = OpenSans,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 48.sp
        ),
    val h4Bold: TextStyle =
        TextStyle(
            fontFamily = OpenSans,
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 48.sp
        ),
    val h5: TextStyle =
        TextStyle(
            fontFamily = OpenSans,
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal
        ),
    val h5Bold: TextStyle =
        h5.copy(fontWeight = FontWeight.Bold),
    val h5SemiBold: TextStyle =
        h5.copy(fontWeight = FontWeight.SemiBold),
    val h7Bold: TextStyle =
        h5Bold.copy(fontSize = 18.sp),
    val subtitle1: TextStyle =
        TextStyle(
            fontFamily = OpenSans,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 26.sp
        ),
    val subtitle1Bold: TextStyle =
        subtitle1.copy(fontWeight = FontWeight.Bold),
    val subtitle1SemiBold: TextStyle =
        subtitle1.copy(fontWeight = FontWeight.SemiBold),
    val body1Medium: TextStyle =
        TextStyle(
            fontFamily = OpenSans,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 24.sp
        ),
    val body1Bold: TextStyle = body1Medium.copy(fontWeight = FontWeight.Bold),
    val body1: TextStyle = body1Medium.copy(fontWeight = FontWeight.Normal),
    val body2: TextStyle =
        TextStyle(
            fontFamily = OpenSans,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        ),
    val body2Bold: TextStyle =
        body2.copy(fontWeight = FontWeight.Bold),
    val body2Medium: TextStyle =
        body2.copy(fontWeight = FontWeight.Medium),

    val bottomSheetTextItemStyle: TextStyle = TextStyle(
        fontFamily = OpenSans,
        fontSize = 23.sp,
        fontWeight = FontWeight.Normal
    ),
    val overline: TextStyle =
        TextStyle(
            fontFamily = OpenSans,
            fontSize = 10.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 24.sp
        ),
    val overlineBold: TextStyle =
        overline.copy(fontWeight = FontWeight.Bold),
    val caption: TextStyle =
        TextStyle(
            fontFamily = OpenSans,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 18.sp
        ),
    val captionBold: TextStyle =
        caption.copy(fontWeight = FontWeight.Bold),

    )

val LocalAbsTypography = staticCompositionLocalOf { AbsTypography() }
