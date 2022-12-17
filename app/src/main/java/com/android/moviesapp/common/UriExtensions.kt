package com.android.moviesapp.common

import android.content.Context
import android.net.Uri
import android.provider.MediaStore

fun Uri.getRealPath(context: Context): String? {
    val cursor =
        context.contentResolver?.query(this, null, null, null, null)
    return if (cursor == null) {
        path
    } else {
        cursor.moveToFirst()
        val idx = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA)
        cursor.getString(idx)
            .also {
                cursor.close()
            }
    }
}
