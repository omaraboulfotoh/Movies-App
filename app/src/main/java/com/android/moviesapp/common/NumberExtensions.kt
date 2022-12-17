package com.android.moviesapp.common

import java.text.DecimalFormat

fun Double.removeTrailingZeros(): String =
    DecimalFormat("#.##")
        .format(this)

fun Int?.toBoolean() = this == 1

fun Double.toPriceFormat(): String =
    DecimalFormat("#,##0.00")
        .format(this)

fun Int?.orZero() = this ?: 0

fun Int?.orOne() = this ?: 1

fun Float?.orZero() = this ?: 0f

fun Double?.orZero() = this ?: 0.toDouble()

fun Long?.orZero() = this ?: 0L

fun Float.half() = this.div(2)

fun Float.quarter() = this.div(2)

fun Int.half() = this.div(2)

fun Int.quarter() = this.div(2)

fun Int.negative() = this.times(-1)

fun Float.negative() = this.times(-1)

fun Float.inRange(number: Float, tolerance: Int): Boolean {
    return this in (number - tolerance)..(number + tolerance)
}

fun Int.isPositive() = this > 0

fun Int.isNegative() = this < 0

fun Float.isPositive() = this > 0

fun Float.isNegative() = this < 0
