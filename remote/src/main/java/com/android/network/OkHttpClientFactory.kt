package com.android.network

import com.android.local.SharedPrefersManager
import com.android.network.OkHttpClientFactory.createOkHttpClient
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import javax.net.ssl.SSLSocket

/**
 * Factory class to create an [OkHttpClient] using [createOkHttpClient].
 *
 * We are passing a nullable [SSLSocket] because in the E2E test we are using rest mock for mocking
 * API response and to make it work with an HTTPS localhost(secure) we need to pass its socket factory
 * and trust manager to the [OkHttpClient] in tests builds. Use default in debug and release builds.
 * We just wrapped the two in a single class [SSLSocket] for convenience.
 *
 * We are passing [LoggingProvider] because in each build variant we can pass different implementation
 * or use another logging tool. That's why we didn't add Timber here directly. It's up to the app
 * aka host component to pass its desired implementation.
 * Created by Mohamed Elshawaf
 */
object OkHttpClientFactory {

    fun createOkHttpClient(
        isDebug: Boolean,
        sslSocket: SSLSocket?,
        prefersStore: SharedPrefersManager,
    ): OkHttpClient {
        val timeout = 500L

        val builder = OkHttpClient.Builder()
            .addInterceptor(makeLoggingInterceptor(true))
            .addInterceptor(makeInterceptor(prefersStore))
            .connectTimeout(timeout, TimeUnit.SECONDS)
            .readTimeout(timeout, TimeUnit.SECONDS)

        return builder.build()
    }

    private fun makeLoggingInterceptor(
        isDebug: Boolean,

        ): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()

        val debugLevel = if (isDebug) {
            HttpLoggingInterceptor.Level.BODY
        } else {
            HttpLoggingInterceptor.Level.NONE
        }
        httpLoggingInterceptor.setLevel(debugLevel)

        return httpLoggingInterceptor
    }

    private fun makeInterceptor(prefersStore: SharedPrefersManager): Interceptor {
        return Interceptor { chain: Interceptor.Chain ->
            val original = chain.request()
            val requestBuilder = original.newBuilder()
            requestBuilder.addHeader("Content-Type", "application/json")
                .addHeader("Accept-Language", "en")
                .addHeader("Accept", "application/json")
            prefersStore.getToken()?.let {
                requestBuilder.addHeader("Authorization", "Bearer $it")
            }

            /**
             * In Case Wanted to add app signature
             */
            requestBuilder.method(original.method, original.body)
            val startTime = System.currentTimeMillis()
            val request = requestBuilder.build()
            var response = chain.proceed(request)
            response
        }
    }
}
