package com.android.moviesapp.common

import android.content.Context
import android.content.ContextWrapper
import android.graphics.Color
import android.net.Uri
import android.webkit.MimeTypeMap
import androidx.activity.ComponentActivity
import com.android.moviesapp.R
import org.apache.http.conn.ConnectTimeoutException
import java.io.File
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.*

fun File.getMimeType(): String {
    var type: String? = null
    val extension = MimeTypeMap.getFileExtensionFromUrl(absolutePath)
    if (extension != null) {
        type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension)
    }

    return type ?: "*/*"
}

fun Double.round(decimals: Int = 2): Double = "%.${decimals}f".format(this).toDouble()

fun Uri.addUriParameter(key: String, newValue: String): Uri {
    val params = queryParameterNames
    val newUri = buildUpon().clearQuery()
    var isSameParamPresent = false
    for (param in params) {
        // if same param is present override it, otherwise add the old param back
        newUri.appendQueryParameter(
            param,
            if (param == key) newValue else getQueryParameter(param)
        )
        if (param == key) {
            // make sure we do not add new param again if already overridden
            isSameParamPresent = true
        }
    }
    if (!isSameParamPresent) {
        // never overrode same param so add new passed value now
        newUri.appendQueryParameter(
            key,
            newValue
        )
    }
    return newUri.build()
}

val File.size get() = if (!exists()) 0.0 else length().toDouble()
val File.sizeInKb get() = size / 1024
val File.sizeInMb get() = sizeInKb / 1024
val File.sizeInGb get() = sizeInMb / 1024
val File.sizeInTb get() = sizeInGb / 1024

fun Uri.asFile(): File = File(toString())

fun String?.asUri(): Uri? {
    try {
        return Uri.parse(this)
    } catch (e: Exception) {
    }
    return null
}

val File?.exists get() = this?.exists() ?: false

fun Int.addAlpha(alpha: Int): Int {
    return Color.argb(
        alpha,
        Color.red(this),
        Color.green(this),
        Color.blue(this)
    )
}

fun Int.isOdd(): Boolean = this % 2 != 0

fun randomColor(): Int {
    val random = Random()
    return Color.argb(
        255,
        random.nextInt(256),
        random.nextInt(256),
        random.nextInt(256)
    )
}

fun <T> Array<T>.random(): T {
    val random = Random()
    val index = random.nextInt(size - 1)
    return this[index]
}

fun Boolean?.orFalse() = this ?: false

inline fun <reified Activity : ComponentActivity> Context.getActivity(): Activity? {
    return when (this) {
        is Activity -> this
        else -> {
            var context = this
            while (context is ContextWrapper) {
                context = context.baseContext
                if (context is Activity) return context
            }
            null
        }
    }
}


fun Throwable.catchErrorMessage(): Pair<Int?, String?> =
    when (this) {
        is UnknownHostException -> Pair(R.string.network_error_message, null)
        is SocketTimeoutException,
        is ConnectTimeoutException,
        -> Pair(R.string.server_time_issue_message, null)
        else -> Pair(null, this.localizedMessage)
    }
