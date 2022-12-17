package com.android.moviesapp.common

import android.annotation.TargetApi
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.os.Build
import androidx.annotation.DrawableRes
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

@TargetApi(Build.VERSION_CODES.N)
fun Context.createChannel(
    id: String,
    name: String,
    priority: Int = NotificationManager.IMPORTANCE_HIGH
): NotificationChannel? {
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return null
    val service = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    return when {
        service.getNotificationChannel(id) == null -> {
            val channel = NotificationChannel(id, name, priority).apply {
                lockscreenVisibility = Notification.VISIBILITY_PUBLIC
            }
            service.createNotificationChannel(channel)
            channel
        }
        else -> service.getNotificationChannel(id)
    }
}

fun Context.checkUserNotificationPermissions(): Boolean {
    return NotificationManagerCompat.from(this).areNotificationsEnabled()
}

fun Context.createNotificationChannel(id: String, name: String, priority: Int): String? {
    val channel = createChannel(id, name, priority)
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        channel?.id
    } else {
        null
    }
}

fun Context.dismissNotification(id: Int) {
    val service = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    service.cancel(id)
}

fun Context.showNotification(
    notificationId: Int = System.currentTimeMillis().toInt(),
    title: String,
    info: String,
    @DrawableRes icon: Int,
    autoCancel: Boolean = true,
    channelId: String,
    priority: Int = NotificationCompat.PRIORITY_DEFAULT,
    defaults: Int = NotificationCompat.DEFAULT_VIBRATE,
    pendingIntent: PendingIntent? = null
) {

    val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    val notification = NotificationCompat.Builder(this, channelId)
        .setSmallIcon(icon)
        .setContentTitle(title)
        .setContentText(info)
        .setAutoCancel(autoCancel)
        .setPriority(priority)
        .setContentIntent(pendingIntent)
        .setDefaults(defaults)
        .build()

    notificationManager.notify(notificationId, notification)
}
