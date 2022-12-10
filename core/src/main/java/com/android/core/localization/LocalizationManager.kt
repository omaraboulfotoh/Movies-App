package com.android.core.localization

import android.content.Context
import java.util.Locale

object LocalizationManager {

    fun changeAppLocale(context: Context, language: String) {
        val resources = context.resources
        val dm = resources.displayMetrics
        val config = resources.configuration
        var locale = Locale(language)
        Locale.setDefault(locale)
        config.setLocale(locale)
        resources.updateConfiguration(config, dm)
    }
}