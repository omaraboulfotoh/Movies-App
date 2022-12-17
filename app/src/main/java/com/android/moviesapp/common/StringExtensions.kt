package com.android.moviesapp.common

import android.graphics.Color
import android.util.Patterns
import androidx.compose.ui.graphics.Color as ComposeColor
import java.util.*
import java.util.regex.Pattern

fun String?.ifNotNullOrEmpty(callback: (String) -> Unit) {
    if (!this.isNullOrEmpty()) {
        callback(this)
    }
}

fun String.removeAllWhiteSpaces(): String {
    return this.replace(" ", "")
}

fun String.removeLeadingZeros(): String {
    var i = 0
    while (i < this.length && this[i] == '0') i++
    val stringBuffer = StringBuffer(this)
    stringBuffer.replace(0, i, "")
    return stringBuffer.toString()
}

private val PASSWORD_PATTERN =
    Pattern.compile("^(?=.*?[A-Z\u0621-\u064A])(?=.*?[a-z\u0621-\u064A])(?=.*?[0-9])(?=.*?[@_&,.:$!-]).{8,}\$")

fun String.isValidPassword(): Boolean {
    return this.isNotEmpty() && PASSWORD_PATTERN.matcher(this).matches()
}

fun String.isValidEmail(): Boolean {
    return !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
}

fun String.removeDoubleIdentifier(): String {
    return this.toLowerCase(Locale.getDefault()).remove("d")
}

fun String.removeLongIdentifier(): String {
    return this.lowercase(Locale.getDefault()).remove("l")
}

inline fun String.remove(substring: String) = replace(substring, "")

fun String?.nullIfEmpty() = if (isNullOrEmpty()) null else this

fun String.isValidURL(): Boolean {
    return Patterns.WEB_URL.matcher(this).matches()
}

fun String?.parseToColorInt(): Int? {
    return try {
        this?.let {
            val colorStr = if (it[0] == '#') it else "#$it"
            Color.parseColor(colorStr)
        }
    } catch (e: Throwable) {
        null
    }
}

fun String?.parseToColor(): ComposeColor? {
    return parseToColorInt()?.let {
        ComposeColor(it)
    }
}
