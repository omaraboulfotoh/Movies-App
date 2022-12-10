package com.android.core.util

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

/**
 * Created by Mohamed Shalan on 7/1/20.
 */

const val DAY_OF_WEEK_DAY_MONTH_YEAR_FORMAT = "EEEE dd MMM yyyy"
const val DAY_MONTH_YEAR_FORMAT = "dd MMM yyyy"
const val YEAR_MONTH_DAY_FORMAT = "yyyy-MM-dd"
const val PT_SCHEDULE_RESPONSE_FORMAT = "hh:mm:ss"
const val PT_SCHEDULE_FORMAT = "hh:mm"
const val _24_HOURS_FORMAT = "hh:mm:ss"
const val _12_HOURS_FORMAT = "hh:mm a"
const val ZONE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
const val BANNER_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss"
const val WEEK_DAY_MONTH_YEAR_TIME_FORMAT = "EEEE dd MMM yyyy hh:mm a"
const val DAY_OF_WEEK = "EEE"
const val MINUTE_IN_MILLI_SECONDS: Long = 60000
const val THREE_DAYS_IN_MILLI = 259200000

fun getCurrentYear() = Calendar.getInstance().get(Calendar.YEAR)

fun getCurrentMonth() = Calendar.getInstance().get(Calendar.MONTH)

fun getCurrentDay() = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)

const val MONTH_IN_MILLISECONDS = 2628000000

const val DAY_IN_MILLISECONDS = 86400000

const val DATE_FORMAT_DD_MM_YYYY = "dd/MM/yyyy"

fun getDateAfter48HRs(): Long {
    val currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
    return Calendar.getInstance().apply {
        set(Calendar.DAY_OF_MONTH, currentDay + 2)
    }.timeInMillis
}

fun isAcceptedDate(year: Int, month: Int, day: Int): Boolean {
    val calendar = Calendar.getInstance()
    calendar.set(Calendar.YEAR, year)
    calendar.set(Calendar.MONTH, month)
    calendar.set(Calendar.DAY_OF_MONTH, day)
    val futureDate = Calendar.getInstance()
    futureDate.add(Calendar.HOUR, 48)
    return calendar.compareTo(futureDate) >= 0
}

fun getDateOf(year: Int, month: Int, day: Int): String =
    SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(
        Date(Calendar.getInstance().apply {
            set(Calendar.YEAR, year)
            set(Calendar.MONTH, month)
            set(Calendar.DAY_OF_MONTH, day)
        }.timeInMillis)
    )

fun getCurrentDateAsString() =
    getDateOf(year = getCurrentYear(), month = getCurrentMonth(), day = getCurrentDay())

/**
 * get end of day in milli seconds (12 AM)
 */
fun getEOD(): Long {
    val alarmTime = Calendar.getInstance().apply {
        timeInMillis = System.currentTimeMillis()
        set(Calendar.HOUR_OF_DAY, 0)
        set(Calendar.MINUTE, 0)
        set(Calendar.SECOND, 0)
    }
    return if (System.currentTimeMillis() < alarmTime.timeInMillis) {
        alarmTime.timeInMillis
    } else {
        alarmTime.add(Calendar.HOUR_OF_DAY, 24)
        alarmTime.timeInMillis
    }
}

fun getUpdateStepsTime(hourOfFullDay: Int): Long {
    return Calendar.getInstance().apply {
        timeInMillis = System.currentTimeMillis()
        set(Calendar.HOUR_OF_DAY, hourOfFullDay)
        set(Calendar.MINUTE, 0)
        set(Calendar.SECOND, 0)
    }.timeInMillis
}

fun isAcceptedAge(year: Int, month: Int, day: Int): Boolean {
    val dob = Calendar.getInstance()
    val today = Calendar.getInstance()
    dob[year, month] = day
    var age = today[Calendar.YEAR] - dob[Calendar.YEAR]
    if (today[Calendar.DAY_OF_YEAR] < dob[Calendar.DAY_OF_YEAR]) {
        age--
    }

    return age > 10
}

fun getAge(dateOfBirth: String): String {
    val dob = Calendar.getInstance()
    val today = Calendar.getInstance()
    dob[dateOfBirth.split("-")[0].toInt(), dateOfBirth.split("-")[1].toInt()] =
        dateOfBirth.split("-")[2].toInt()
    var age = today[Calendar.YEAR] - dob[Calendar.YEAR]
    if (today[Calendar.DAY_OF_YEAR] < dob[Calendar.DAY_OF_YEAR]) {
        age--
    }
    return age.toString()
}

fun formatDate(date: Date, format: String, locale: Locale = Locale.getDefault()): String {
    val simpleDateFormat = SimpleDateFormat(format, locale)
    return simpleDateFormat.format(date)
}

fun getFormattedDate(format: String = DAY_MONTH_YEAR_FORMAT, date: Date? = null) =
    SimpleDateFormat(format, Locale.ENGLISH).format(date ?: Date())

fun getDateFromString(format: String = DAY_MONTH_YEAR_FORMAT, date: String) =
    SimpleDateFormat(format, Locale.ENGLISH).parse(date)

fun getSelectedDate(year: Int, month: Int, dayOfMonth: Int) =
    Calendar.getInstance(Locale.ENGLISH).apply {
        set(Calendar.YEAR, year)
        set(Calendar.MONTH, month)
        set(Calendar.DAY_OF_MONTH, dayOfMonth)
    }.time

fun getFormattedTime(
    fromFormat: String = PT_SCHEDULE_RESPONSE_FORMAT,
    toFormat: String = PT_SCHEDULE_FORMAT,
    time: String
): String? =
    SimpleDateFormat(fromFormat, Locale.ENGLISH).parse(time)?.let {
        SimpleDateFormat(toFormat, Locale.ENGLISH).format(it)
    }

fun isDateInThePast(date: Date): Boolean {
    val currentDate = Date(getCurrentDate())
    return currentDate.after(date)
}

fun getCurrentDate(): Long = System.currentTimeMillis()

//fun String.toDate(@DateFormats format: String): Date =
//    SimpleDateFormat(format, Locale.ENGLISH).parse(this) ?: Date()

fun String.convert24HoursFormatTo12HoursFormat(): String {
    val _24HoursSimpleDateFormate = SimpleDateFormat(_24_HOURS_FORMAT, Locale.ENGLISH)
    return _24HoursSimpleDateFormate.parse(this)?.let {
        val _12HoursSimpleDateFormate = SimpleDateFormat(_12_HOURS_FORMAT, Locale.ENGLISH)
        _12HoursSimpleDateFormate.format(it)
    } ?: ""
}

fun getDayOfMonthFromStringDate(format: String = YEAR_MONTH_DAY_FORMAT, date: String): String {
    val formattedDate = SimpleDateFormat(format, Locale.ENGLISH).parse(date)
    val dayOfWeekDate =
        SimpleDateFormat(DAY_OF_WEEK, Locale.getDefault()).format(formattedDate)
    return dayOfWeekDate.toString()
}

fun getLongDateFormat(format: String = YEAR_MONTH_DAY_FORMAT, date: String): String {
    val formattedDate = SimpleDateFormat(format, Locale.ENGLISH).parse(date)
    val longDateFormat =
        SimpleDateFormat(DAY_MONTH_YEAR_FORMAT, Locale.getDefault()).format(formattedDate)
    return longDateFormat.toString()
}

fun getDateInMilliSecondsFromStringDate(
    stringDate: String,
    format: String = YEAR_MONTH_DAY_FORMAT
): Long {
    val formatter = SimpleDateFormat(YEAR_MONTH_DAY_FORMAT, Locale.ENGLISH)
    return (formatter.parse(stringDate) as Date).time
}
