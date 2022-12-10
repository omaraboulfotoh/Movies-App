package com.android.core.util

import android.content.res.Resources

/**
 * Created by Mohamed Shalan on 6/12/20.
 */


fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

fun Int.toDp(): Int = (this / Resources.getSystem().displayMetrics.density).toInt()
