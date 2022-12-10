package com.android.network

/**
 * That will represent the base url for our API. It's wrapped in class because it will be injected
 * and this better instead of a string and add dagger Qualifier annotation. Ideally, It should be
 * an inline class but dagger is not friendly with them yet. In tests that will be replaced by another
 * impl to a local server.
 * Created by Mohamed Elshawaf
 */
data class BaseUrl(val url: String)
