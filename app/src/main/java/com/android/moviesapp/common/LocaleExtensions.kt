package com.android.moviesapp.common

import android.content.Context
import android.os.Build
import java.util.*

fun Context.updateLocale(locale: Locale): Context {
    Locale.setDefault(locale)
    val resources = this.resources
    val configuration = resources.configuration

    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        configuration.setLocale(locale)
        configuration.setLayoutDirection(locale)

        this.createConfigurationContext(configuration)
    } else {
        configuration.locale = locale
        configuration.setLayoutDirection(locale)
        resources.updateConfiguration(configuration, resources.displayMetrics)
        this
    }
}
