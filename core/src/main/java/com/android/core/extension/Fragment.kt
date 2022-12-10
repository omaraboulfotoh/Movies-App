package com.android.core.extension

import android.content.Context
import android.transition.Slide
import android.transition.Transition
import android.transition.TransitionManager
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.android.core.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


fun Fragment.dismissKeyboard() {
    val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(view?.windowToken, 0)
}

fun View.visible(viewGroup: ViewGroup) {
    val transition: Transition = Slide(Gravity.END)
    transition.duration = 600
    transition.addTarget(this)
    TransitionManager.beginDelayedTransition(viewGroup, transition)
    this.isVisible = true
}

fun View.invisible(viewGroup: ViewGroup, transition: Transition) {
    transition.duration = 600
    transition.addTarget(this)
    TransitionManager.beginDelayedTransition(viewGroup, transition)
    this.isVisible = false
}

fun Fragment.toast(msg: String?) {
    if (msg.isNullOrBlank()) {
        return
    }

    lifecycleScope.launch(Dispatchers.Main) {
        Toast.makeText(this@toast.requireContext(), msg, Toast.LENGTH_LONG).show()
    }
}

fun Fragment.backPressed() = findNavController().popBackStack()

fun Fragment.showSnackBar(text: String) {
    val snackbar = Snackbar.make(this.requireView(), text, Snackbar.LENGTH_LONG)
    val tv = snackbar.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
    tv.layoutDirection = View.LAYOUT_DIRECTION_LOCALE
//        val font = Typeface.createFromAsset(assets, "fonts/ibm_arabic_reg")
//        tv.setTypeface(font)
    tv.setTextColor(ContextCompat.getColor(this.requireContext(), R.color.white))
    val sbView = snackbar.view
    sbView.setBackgroundColor(ContextCompat.getColor(this.requireContext(), R.color.red))
    snackbar.show()
}

