package com.android.core.util

import android.app.Activity
import android.content.Context
import android.widget.Toast

object ToastUtilities {


    fun showToast(activity: Activity, message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_LONG).show()
    }

    fun showToast(activity: Context, message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_LONG).show()
    }
}