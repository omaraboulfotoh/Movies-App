package com.android.network;

import java.lang.System;

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
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u000f"}, d2 = {"Lcom/android/network/OkHttpClientFactory;", "", "()V", "createOkHttpClient", "Lokhttp3/OkHttpClient;", "isDebug", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "prefersStore", "Lcom/android/local/SharedPrefersManager;", "makeInterceptor", "Lokhttp3/Interceptor;", "makeLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "remote_debug"})
public final class OkHttpClientFactory {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.network.OkHttpClientFactory INSTANCE = null;
    
    private OkHttpClientFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient createOkHttpClient(boolean isDebug, @org.jetbrains.annotations.Nullable()
    javax.net.ssl.SSLSocket sslSocket, @org.jetbrains.annotations.NotNull()
    com.android.local.SharedPrefersManager prefersStore) {
        return null;
    }
    
    private final okhttp3.logging.HttpLoggingInterceptor makeLoggingInterceptor(boolean isDebug) {
        return null;
    }
    
    private final okhttp3.Interceptor makeInterceptor(com.android.local.SharedPrefersManager prefersStore) {
        return null;
    }
}