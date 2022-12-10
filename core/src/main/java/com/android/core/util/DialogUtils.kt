package com.android.core.util

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import com.android.core.R

/**
 * Created by Mohamed Shalan on 7/2/20.
 */


fun showInformaticDialog(
	context: Context,
	@StringRes title: Int,
	@StringRes message: Int
): AlertDialog =
	AlertDialog.Builder(context).apply {
		setTitle(title)
		setMessage(message)
		setPositiveButton(context.getString(R.string.txt_ok)) { dialog, which ->
			dialog.dismiss()
		}
	}.show()

fun showActionRequiredDialog(
	context: Context,
	message: String,
	action: (DialogInterface?) -> Unit
) {
	AlertDialog.Builder(context).apply {
		setMessage(message)
		setPositiveButton(
			context.getString(R.string.txt_ok)
		) { dialog: DialogInterface?, which: Int ->
			action.invoke(dialog)
		}
	}.show().apply {
		getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(ContextCompat.getColor(context, android.R.color.black))
	}
}


object DialogsUtils {
	inline fun showBlockingDialog(
		context: Context,
		@LayoutRes view: Int,
		@StringRes message: Int,
		crossinline retryAction: () -> Unit = {},
		crossinline cancelAction: () -> Unit = {}
	): AlertDialog {
		val inflatedView: View
		return AlertDialog.Builder(context).apply {
			inflatedView = LayoutInflater.from(context).inflate(view, null)
			inflatedView.findViewById<TextView>(R.id.tv_dialog_message)?.apply {
				text = context.getString(message)
			}
			setView(inflatedView)
			setCancelable(false)
		}.create().apply {
			window?.decorView?.setBackgroundResource(android.R.color.transparent)
			inflatedView.findViewById<TextView>(R.id.btn_retry)?.setOnClickListener {
				dismiss()
				retryAction.invoke()
			}
			inflatedView.findViewById<TextView>(R.id.tv_dialog_cancel)?.setOnClickListener {
				dismiss()
				cancelAction.invoke()
			}
			show()
		}
	}

}

