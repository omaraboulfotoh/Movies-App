package com.android.core.extension

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

/**
 * Hides the soft input window.
 */
fun View.hideKeyboard() {
    val imm = (context.getSystemService(Context.INPUT_METHOD_SERVICE) ?: return)
        as InputMethodManager

    imm.hideSoftInputFromWindow(windowToken, 0)
}
