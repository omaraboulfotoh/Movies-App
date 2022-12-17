package com.android.moviesapp.common

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

fun ViewModel.scopedLaunch(
    onError: suspend (Throwable) -> Unit,
    launched: suspend CoroutineScope.() -> Unit
) =
    viewModelScope.launch {
        try {
            launched()
        } catch (ex: Throwable) {
            onError(ex)
        }
    }

fun ViewModel.scopedCatching(
    launched: suspend CoroutineScope.() -> Unit
) =
    viewModelScope.launch {
        try {
            launched()
        } catch (ex: Throwable) {
            // Run catching
        }
    }
