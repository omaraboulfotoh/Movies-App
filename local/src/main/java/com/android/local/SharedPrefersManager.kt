package com.android.local

import android.content.SharedPreferences
import javax.inject.Inject

class SharedPrefersManager @Inject constructor(private val sharedPreferences: SharedPreferences) {
    val LANGUAGE_AR = "ar"
    val LANGUAGE_EN = "en"

    fun getAppLanguage(): String {
        return sharedPreferences.getString(Constants.sharedPreference_language, null)
            ?: LANGUAGE_AR
    }

    fun setAppLanguage(newLanguage: String) {
        var prefereEdit = sharedPreferences.edit().apply {
            putString(Constants.sharedPreference_language, newLanguage)
        }
        prefereEdit.commit()
    }

    fun saveToken(token: String?) {
        var prefereEdit = sharedPreferences.edit().apply {
            putString(Constants.sharedPreference_token, token)
        }
        prefereEdit.commit()
    }

    fun getToken(): String? {
        return sharedPreferences.getString(Constants.sharedPreference_token, null)
    }

}