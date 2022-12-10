package com.android.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u0006J\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/android/local/SharedPrefersManager;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "LANGUAGE_AR", "", "getLANGUAGE_AR", "()Ljava/lang/String;", "LANGUAGE_EN", "getLANGUAGE_EN", "getAppLanguage", "getToken", "saveToken", "", "token", "setAppLanguage", "newLanguage", "local_debug"})
public final class SharedPrefersManager {
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String LANGUAGE_AR = "ar";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String LANGUAGE_EN = "en";
    
    @javax.inject.Inject()
    public SharedPrefersManager(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLANGUAGE_AR() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLANGUAGE_EN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppLanguage() {
        return null;
    }
    
    public final void setAppLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String newLanguage) {
    }
    
    public final void saveToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
}