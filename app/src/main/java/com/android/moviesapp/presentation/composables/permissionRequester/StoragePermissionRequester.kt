package com.android.moviesapp.presentation.composables.permissionRequester

import android.Manifest
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect

@Composable
fun NotificationPermissionRequester(
    onPermissionGranted: () -> Unit,
    onPermissionDenied: () -> Unit,
) {
    rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) {
        if (!it) {
            onPermissionDenied.invoke()
        } else {
            onPermissionGranted.invoke()
        }
    }.apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            SideEffect {
                launch(
                    Manifest.permission.POST_NOTIFICATIONS
                )
            }
        }
    }
}
