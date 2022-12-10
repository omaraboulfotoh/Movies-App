package com.android.core.extension

/**
 * Used to convert when to an expression that means if you are passing a sealed class or an enum you
 * must handle all of its cases.
 * Created by Ahmed Abd-Elmeged on 2/1/21.
 */
val <T> T.exhaustive: T get() = this
