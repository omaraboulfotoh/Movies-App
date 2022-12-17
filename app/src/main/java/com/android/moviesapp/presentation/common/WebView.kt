package com.android.moviesapp.presentation.common

import android.annotation.SuppressLint
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import com.android.moviesapp.presentation.composables.MbcAppBar
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun WebViewScreen(
    navigator: DestinationsNavigator,
    title: String? = null,
    url: String
) {
    val backDispatcher =
        LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher

    Scaffold(
        topBar = {
            title?.let {
                MbcAppBar(
                    title = it
                ) { backDispatcher?.onBackPressed() }
            }

        }
    ) {
        if (url.isNotEmpty())
            WebView(data = url)
        else
            Toast.makeText(LocalContext.current, "Empty Url", Toast.LENGTH_LONG).show()
    }

}


@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebView(
    modifier: Modifier = Modifier,
    data: String,
    webViewClient: WebViewClient = WebViewClient(),
) {
    AndroidView(
        modifier = modifier,
        factory = { context ->
            WebView(context).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                settings.javaScriptEnabled = true
                settings.useWideViewPort = true
                setInitialScale(1)
                this.webViewClient = webViewClient

            }.also {
                it.loadUrl(data)
            }
        }
    )
}
