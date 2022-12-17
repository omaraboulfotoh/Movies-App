package com.android.moviesapp.utils

import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import androidx.annotation.ArrayRes
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.NonNull
import androidx.annotation.PluralsRes
import androidx.annotation.StringRes

interface IResourceProvider {
    @NonNull
    fun getString(@StringRes resId: Int): String

    @NonNull
    fun getStrings(resIds: List<Int>): List<String>

    @NonNull
    fun getString(@StringRes resId: Int, vararg formatArgs: Any): String

    @NonNull
    fun getStringArray(@ArrayRes resId: Int): Array<String>

    @NonNull
    fun getQuantityString(@PluralsRes resId: Int, quantity: Int): String

    @NonNull
    fun getQuantityString(@PluralsRes resId: Int, quantity: Int, vararg formatArgs: Any): String

    fun getDrawable(@DrawableRes resId: Int): Drawable?

    @ColorInt
    fun getColor(@ColorRes resId: Int): Int

    fun getColorStateList(@ColorRes resId: Int): ColorStateList?
}
