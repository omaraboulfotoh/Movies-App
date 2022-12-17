package com.android.moviesapp.common

import kotlin.math.abs

inline fun <T> Iterable<T>.firstOrDefault(default: () -> T, predicate: (T) -> Boolean): T {
    return firstOrNull(predicate) ?: default()
}

fun List<Float>.closest(targetValue: Float) = minByOrNull {
    abs(targetValue - it)
}

fun List<Int>.closest(targetValue: Int) = minByOrNull {
    abs(targetValue - it)
}

inline fun <T> Iterable<T>.contains(predicate: (T) -> Boolean): Boolean {
    return find(predicate) != null
}
