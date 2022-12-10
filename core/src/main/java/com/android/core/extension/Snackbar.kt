package com.android.core.extension

import android.view.View
import androidx.annotation.StringRes
import com.google.android.material.snackbar.Snackbar

fun shortSnackbar(container: View, @StringRes textRes: Int) {
    Snackbar.make(container, textRes, Snackbar.LENGTH_SHORT).show()
}
