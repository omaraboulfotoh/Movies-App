package com.android.core.extension



import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.text.Spanned
import androidx.annotation.StringRes
import kotlin.reflect.KClass

fun @receiver:StringRes Int.errorDialog(activity: Activity) {
    AlertDialog.Builder(activity, android.R.style.Theme_Material_Dialog_Alert)
        .setTitle("Error")
        .setMessage(this@errorDialog)
        .setPositiveButton(android.R.string.ok) { dialog, _ -> dialog.dismiss() }
        .setIcon(android.R.drawable.ic_dialog_alert).show()
}

fun String?.parseHtml(): Spanned {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        return Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY)
    } else {
        @Suppress("deprecation")
        return Html.fromHtml(this)
    }
}

fun <T : Activity> KClass<T>.start(activity: Activity, finish: Boolean = false) {
    Intent(activity, this.java).apply {
        activity.startActivity(this)
    }
    if (finish) {
        activity.finish()
    }
}

fun <T : Activity> KClass<T>.start(activity: Context) {
    Intent(activity, this.java).apply {
        activity.startActivity(this)
    }
}

fun <T : Activity> KClass<T>.start(activity: Context, bundle: Bundle?) {
    Intent(activity, this.java).apply {
        if (bundle != null) putExtras(bundle)
        activity.startActivity(this)
    }
}


fun <T : Activity> KClass<T>.start(activity: Activity, finish: Boolean = false, bundle: Bundle?) {
    Intent(activity, this.java).apply {
        if (bundle != null) putExtras(bundle)
        activity.startActivity(this)
    }
    if (finish) {
        activity.finish()
    }

}
fun <T : Activity> KClass<T>.startOnTOP(activity: Activity, finish: Boolean = false, bundle: Bundle?) {
    Intent(activity, this.java).apply {
        if (bundle != null) putExtras(bundle)
        addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        activity.startActivity(this)
    }
    if (finish) {
        activity.finish()
    }

}

fun <T : Activity> KClass<T>.startWithCLearStack(activity: Activity, finish: Boolean = false, bundle: Bundle?) {
    Intent(activity, this.java).apply {
        if (bundle != null) putExtras(bundle)
        addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        activity.startActivity(this)
    }
    if (finish) {
        activity.finish()
    }

}


fun <T : Activity> KClass<T>.startForResult(activity: Activity, resultCode: Int) {
    Intent(activity, this.java).apply {
        activity.startActivityForResult(this, resultCode)
    }
}

fun <T : Activity> KClass<T>.startForResult(activity: Activity, resultCode: Int, bundle: Bundle) {
    Intent(activity, this.java).apply {
        putExtras(bundle)
        activity.startActivityForResult(this, resultCode)
    }

    fun <T> Context.openActivity(it: Class<T>, extras: Bundle.() -> Unit = {}) {
        val intent = Intent(this, it)
        intent.putExtras(Bundle().apply(extras))
        startActivity(intent)
    }

}
