package com.android.core.util

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

private const val TIMEZONE = "Egypt"
const val BASIC_DATE_FORMAT = "dd - MM - yyy  hh:mm a"
const val SERVER_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
const val DETAILED_DATE_FORMAT = "EEEE, dd MMM, yyyy  hh:mm a"
const val SEMI_DETAILED_DATE_FORMAT = "EEEE, dd MMM, yyyy"



fun Long.formatToServerTimeUTC(requiredFormat: String = SERVER_DATE_FORMAT): String = try {
    val date = Date(this)
    val format = SimpleDateFormat(requiredFormat, Locale.ENGLISH)
    format.timeZone = TimeZone.getTimeZone(TIMEZONE)

    format.format(date)
} catch (nfe: NumberFormatException) {
    requiredFormat
}

fun String.formatLongString(requiredFormat: String = SERVER_DATE_FORMAT): String = try {
    val date = Date(this.toLong() + 2 * 60 * 60 * 1000)
    val format = SimpleDateFormat(requiredFormat, Locale("ar"))
    format.timeZone = TimeZone.getTimeZone("Africa/Cairo")
    format.format(date)
} catch (nfe: NumberFormatException) {
    this
}

fun String.formatFromServerTimeUTC(requiredFormat: String = BASIC_DATE_FORMAT): String = try {
    val inputFormat = SimpleDateFormat(SERVER_DATE_FORMAT,Locale("ar"))
    // in case of Z the time zone will be RFC 822 time zone
    inputFormat.timeZone = if (endsWith("Z")) TimeZone.getTimeZone("02") else TimeZone.getTimeZone(TIMEZONE)
    val outputFormat = SimpleDateFormat(requiredFormat, Locale("ar"))
    outputFormat.timeZone = TimeZone.getTimeZone(TIMEZONE)
    val parsedDate = inputFormat.parse(this)
    val formattedDate = outputFormat.format(parsedDate)
    formattedDate
} catch (pe: Exception) {
    pe.printStackTrace()
    this
}

fun formatFromServerTimeUTCToLong(
    dateStr: String,
    format: String = SERVER_DATE_FORMAT,
): String {
    val inputFormat = SimpleDateFormat(format, Locale("ar"))
    inputFormat.timeZone = TimeZone.getTimeZone("Africa/Cairo")
    return try {
        inputFormat.parse(dateStr)?.time.toString()
    } catch (e: ParseException) {
        e.printStackTrace()
        // System.currentTimeMillis()
        dateStr
    }
}

var TIME_COUNTDOWN: Long = 60000L
private const val TIME_FORMAT = "%02d:%02d"
// convert time to milli seconds
fun Long.formatTime(): String =
    String.format(
        TIME_FORMAT,
        TimeUnit.MILLISECONDS.toMinutes(this) ,
        TimeUnit.MILLISECONDS.toSeconds(this) % 60
    )
