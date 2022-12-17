package com.android.moviesapp.common

import android.text.format.DateUtils
import java.text.SimpleDateFormat
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*
import kotlinx.datetime.LocalDate
import kotlinx.datetime.toJavaLocalDate

@SuppressWarnings("MagicNumber")
fun Long.toMinSec(): String {
    val secs = this / 1000
    return String.format("%02d:%02d", secs / 60, secs % 60)
}

@SuppressWarnings("MagicNumber")
fun Long.toHourMinSec(): String {
    val secs = this / 1000
    if (secs / 60 < 60) {
        return String.format("%02d:%02d", secs % 3600 / 60, secs % 60)
    }
    return String.format("%d:%02d:%02d", secs / 3600, secs % 3600 / 60, secs % 60)
}

fun Date.getDateFormatted(format: String = DATE_DAY_FORMAT): String {
    val sdf = SimpleDateFormat(format, Locale.getDefault())
    return sdf.format(this)
}

fun Date.getDateFormattedWithoutZone(format: String = DATE_DAY_FORMAT): String {
    val sdf = SimpleDateFormat(format, Locale.getDefault())
    return sdf.format(this)
}

fun Long.formatDate(format: String = DATE_DAY_FORMAT): String {
    val sdf = SimpleDateFormat(format, Locale.getDefault())
    return sdf.format(this)
}

fun Long.formatDateWithoutZone(format: String = DATE_DAY_FORMAT): String {
    val sdf = SimpleDateFormat(format, Locale.getDefault())
    return sdf.format(this)
}

fun Long.toTimeFromFormat() = DateUtils.getRelativeTimeSpanString(
    this,
    Calendar.getInstance().timeInMillis,
    DateUtils.SECOND_IN_MILLIS
).toString()

fun Long.longTimestampToDateFormat(formatPattern: String): String? =
    SimpleDateFormat(formatPattern, Locale.US).format(this)

fun Long.longTimestampToTimeFormat(): String? =
    SimpleDateFormat(TIME_FORMAT, Locale.US).format(this)

fun Calendar.toDate(): Date = this.time

fun Date.toCalender(): Calendar {
    val calender = Calendar.getInstance(Locale.US)
    calender.timeInMillis = time
    return calender
}

fun Date.toDateTimeWithoutYearFormat(): String =
    SimpleDateFormat(DAY_TIME_DATE_FORMAT, Locale.US).format(this)

fun Date.toServerDateFormat(): String = SimpleDateFormat(SERVER_DATE_FORMAT, Locale.US).format(this)

fun Date.toFullDateFormat(): String =
    SimpleDateFormat(FULL_TIME_DATE_FORMAT, Locale.US).format(this)

fun String.toDateTimeWithoutYearFormat(): Date? =
    SimpleDateFormat(DAY_TIME_DATE_FORMAT, Locale.US).parse(this)

fun String.toServerDateFormat(): Date? =
    SimpleDateFormat(SERVER_DATE_FORMAT, Locale.US).parse(this)

fun String.toFullDateFormat(): Date? =
    SimpleDateFormat(FULL_TIME_DATE_FORMAT, Locale.US).parse(this)

fun LocalDate.toDayNameMonthYear() =
    this.toJavaLocalDate()
        .format(DateTimeFormatter.ofPattern(DAYNAME_MONTH_YEAR_DATE_FORMAT, Locale.US))

fun LocalDate.toDayNameDayMonth() =
    this.toJavaLocalDate()
        .format(DateTimeFormatter.ofPattern(DAYNAME_DAYNUMBER_DATE_FORMAT, Locale.US))

fun LocalDate.toDayMonthYear() =
    this.toJavaLocalDate()
        .format(DateTimeFormatter.ofPattern(YEAR_MONTH_DAT_DATE_FORMAT, Locale.US))

fun LocalDate.toMonthNameDayYear() =
    this.toJavaLocalDate()
        .format(DateTimeFormatter.ofPattern(MONTH_NAME_DAY_YEAR_DATE_FORMAT, Locale.US))

fun java.time.LocalDate.toDayMonthYear() =
    this.format(DateTimeFormatter.ofPattern(YEAR_MONTH_DAT_DATE_FORMAT, Locale.US))

fun Date.toDayMonthYear(): String =
    SimpleDateFormat(YEAR_MONTH_DAT_DATE_FORMAT, Locale.US).format(this)

fun LocalDate.toCalendar(): Calendar {
    val c = Calendar.getInstance()
    c.time =
        Date.from(this.toJavaLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant())
    return c
}

fun LocalDate.toTimeInMillis() =
    this.toCalendar().timeInMillis

fun String.toDateFromTimeSecondsFormat(): Date? =
    SimpleDateFormat(TIME_FORMAT_SECONDS, Locale.US).parse(this)

fun Date.formatDateToTimeFormat(): String =
    SimpleDateFormat(TIME_FORMAT, Locale.US).format(this)

fun formatToTime(hourOfDay: Int, minute: Int, seconds: Int = 0): String =
    String.format("%02d:%02d:%02d", hourOfDay, minute, seconds)

const val SERVER_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
const val FULL_TIME_DATE_FORMAT = "yyyy-MM-dd hh:mm a"
const val DAY_TIME_DATE_FORMAT = "MM/dd hh:mm a"
const val DATE_TIME_FORMAT: String = "dd-MM-yyyy 'at' hh:mm a"
const val SCORE_DATE_TIME_FORMAT: String = "MM/dd/yyyy @HH:mm"
const val DATE_DAY_FORMAT: String = "dd MMM yyyy"
const val SHORT_DATE_DAY_FORMAT: String = "dd.MM"
const val TIME_FORMAT: String = "hh:mm a"
const val TIME_FORMAT_SECONDS: String = "hh:mm:ss"
const val SERVER_BASIC_DATE_TIME_FORMAT: String = "yyyy-MM-dd'T00:00:00.000'"
const val SERVER_BASIC_DATE_TIME_FULL_FORMAT: String = "yyyy-MM-dd'T'HH:mm:ss'.000'"
const val DAYNAME_MONTH_YEAR_DATE_FORMAT = "EEEE, dd MMM yyyy"
const val DAYNAME_DAYNUMBER_DATE_FORMAT = "EEEE, dd"
const val DAY_MONTH_YEAR_DATE_FORMAT = "dd-MM-yyyy"
const val YEAR_MONTH_DAT_DATE_FORMAT = "yyyy-MM-dd"
const val YEAR_MONTH_DAT_DATE_DOTS_FORMAT = "MM.dd.yyyy"
const val MONTH_NAME_DAY_YEAR_DATE_FORMAT = "MMMM dd, yyyy"
