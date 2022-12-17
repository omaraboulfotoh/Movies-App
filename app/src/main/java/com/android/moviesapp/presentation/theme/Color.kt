package com.android.moviesapp.presentation.theme

import androidx.compose.material.lightColors
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode

val AMERICAN_Gold = Color(0xFFD5B050)
val RAISIN_BLACK = Color(0xFF22201F)
val DANDELION = Color(0xFF002C47)
val DARK_KHAKI = Color(0xFFD5CCC7)
val DARK_TEXT_KHAKI = Color(0xFFA19B97)
val GRAY300 = Color(0xFFEAE6E4)
val TransCharcoalGrey = Color(0x88212121)
val StrokeGrey = Color(0xFF767676)
val Black = Color(0xFF010101)
val PlaceholderGrey = Color(0XFF484848)
val BorderStroke = Color(0XFF929292)
val Brown = Color(0XFF633D22)
val GHOST_WHITE = Color(0XFFF9F9F9)
val TAUPE_GRAY = Color(0XFF888888)
val DARK_CHARCOAL = Color(0XFF31302C)
val WHITE = Color(0XFFFFFFFF)
val BLACK = Color(0XFF000000)
val BLACK50 = Color(0XFF000000)
val BLACK0 = Color(0x0000000)
val CHARCOAL = Color(0XFF344054)
val QUICK_SILVER = Color(0XFFA7A6A5)
val SMOKY_BLACK = Color(0XFF222222)
val SONIC_SILVER = Color(0XFF777777)
val LIGHT_SILVER = Color(0XFFf9f7f7)
val DARK_LIVER = Color(0XFF505050)
val DIVIDER_COLOR = Color(0xFFBEBEBE)
val PHILIPPINE_GRAY = Color(0xFF8F8F8E)
val GREY_BTN = Color(0xFFDADADA)
val LIGHT_BLACK = Color(0XFF4E4D4C)
val LIGHT_BLACK_GOSPEL = Color(0XFF2A2928)

val PrimaryGradient =
    Brush.verticalGradient(listOf(BLACK50, BLACK0), tileMode = TileMode.Decal)

val ColorPalette =
    lightColors(
        primary = RAISIN_BLACK,
        primaryVariant = RAISIN_BLACK,
        secondary = AMERICAN_Gold,
        secondaryVariant = DANDELION,
        background = RAISIN_BLACK,
        surface = WHITE,
        onPrimary = WHITE,
        onSecondary = BLACK,
        onBackground = WHITE,
        onSurface = BLACK
    )

@Immutable
data class AbsColors(
    val bottomNavBarBackground: Color = DARK_CHARCOAL,
    val background: Color = RAISIN_BLACK,
    val backgroundColor: Color = LIGHT_SILVER,
    val primaryButtonColor: Color = DANDELION,
    val primaryButtonDisableColor: Color = DARK_KHAKI,
    val primaryButtonTextColor: Color = AMERICAN_Gold,
    val primaryButtonTextColorDisabled: Color = DARK_TEXT_KHAKI,
    val primaryDisabledColor: Color = TransCharcoalGrey,
    val primaryText: Color = DANDELION,
    val secondaryText: Color = SMOKY_BLACK,
    val LightBlackGospel: Color = LIGHT_BLACK_GOSPEL,
    val gold: Color = DANDELION,
    val stroke: Color = GRAY300,
    val black: Color = Black,
    val indicatorGrey:Color = StrokeGrey,
    val white: Color = Color(0XFFFFFFFF),
    val whiteAlpha30: Color = Color(0x4DFFFFFF),
    val transparent: Color = Color(0x00FFFFFF),
    val placeholder: Color = PlaceholderGrey,
    val borderColor: Color = BorderStroke,
    val brown: Color = Brown,
    val pickerHeader: Color = BLACK,
    val pickerContent: Color = BLACK,
    val pickerOption: Color = WHITE,
    val primaryGradient: Brush = PrimaryGradient,
    val textSecondary: Color = CHARCOAL,
    val textGray: Color = PHILIPPINE_GRAY,
    val textHint: Color = QUICK_SILVER,
    val smokeyBlack: Color = SMOKY_BLACK,
    val indicatorActiveColor: Color = Color.White,
    val indicatorInActiveColor: Color = background,
    val spacer: Color = SONIC_SILVER,
    val unselectedColor: Color = LIGHT_SILVER,
    val progressBg: Color = DARK_LIVER,
    val dividerColor: Color = DIVIDER_COLOR,
    val greyBtn: Color = GREY_BTN,
    val unSelectedCard: Color = DARK_LIVER,
    val lightBlack: Color = LIGHT_BLACK,
)

val LocalAbsColor = staticCompositionLocalOf { AbsColors() }
