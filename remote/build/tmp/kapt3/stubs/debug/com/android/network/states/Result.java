package com.android.network.states;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003\u0016\u0017\u0018B7\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u001e\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0001\u0003\u0019\u001a\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/android/network/states/Result;", "T", "Lcom/android/network/states/IResult;", "data", "message", "", "errors", "", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getErrors", "()Ljava/util/Map;", "setErrors", "(Ljava/util/Map;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "Error", "Loading", "Success", "Lcom/android/network/states/Result$Error;", "Lcom/android/network/states/Result$Loading;", "Lcom/android/network/states/Result$Success;", "remote_debug"})
public abstract class Result<T extends java.lang.Object> implements com.android.network.states.IResult<T> {
    @org.jetbrains.annotations.Nullable()
    private T data;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.lang.String> errors;
    
    private Result(T data, java.lang.String message, java.util.Map<java.lang.String, java.lang.String> errors) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getErrors() {
        return null;
    }
    
    public final void setErrors(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/android/network/states/Result$Success;", "T", "Lcom/android/network/states/Result;", "data", "(Ljava/lang/Object;)V", "remote_debug"})
    public static final class Success<T extends java.lang.Object> extends com.android.network.states.Result<T> {
        
        public Success(T data) {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/android/network/states/Result$Loading;", "T", "Lcom/android/network/states/Result;", "data", "(Ljava/lang/Object;)V", "remote_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.android.network.states.Result<T> {
        
        public Loading() {
            super(null, null, null);
        }
        
        public Loading(@org.jetbrains.annotations.Nullable()
        T data) {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/android/network/states/Result$Error;", "T", "Lcom/android/network/states/Result;", "data", "message", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "remote_debug"})
    public static final class Error<T extends java.lang.Object> extends com.android.network.states.Result<T> {
        
        public Error(@org.jetbrains.annotations.Nullable()
        T data, @org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super(null, null, null);
        }
    }
}