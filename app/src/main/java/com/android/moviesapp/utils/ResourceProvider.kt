package com.android.moviesapp.utils

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat

class ResourceProvider(private val context: Context) : IResourceProvider {
    override fun getString(resId: Int): String {
        return context.getString(resId)
    }

    override fun getString(resId: Int, vararg formatArgs: Any): String {
        return context.getString(resId, *formatArgs)
    }

    override fun getStrings(resIds: List<Int>): List<String> {
        return resIds.map { resId ->
            context.getString(resId)
        }
    }

    override fun getStringArray(resId: Int): Array<String> {
        return context.resources.getStringArray(resId)
    }

    override fun getQuantityString(resId: Int, quantity: Int): String {
        return context.resources.getQuantityString(resId, quantity)
    }

    override fun getQuantityString(resId: Int, quantity: Int, vararg formatArgs: Any): String {
        return context.resources.getQuantityString(resId, quantity, *formatArgs)
    }

    override fun getDrawable(resId: Int): Drawable? {
        return ContextCompat.getDrawable(context, resId)
    }

    override fun getColor(resId: Int): Int {
        return ContextCompat.getColor(context, resId)
    }

    override fun getColorStateList(resId: Int): ColorStateList? {
        return ContextCompat.getColorStateList(context, resId)
    }
}
