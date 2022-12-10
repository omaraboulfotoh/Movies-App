package com.android.network.services;

import java.lang.System;

/**
 * Created by Mohamed Shalan on 6/1/20.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0007H&\u00a2\u0006\u0002\u0010\bJ)\u0010\t\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0007H&\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/android/network/services/SerializationService;", "", "deserialize", "T", "value", "", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "serialize", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/String;", "remote_debug"})
public abstract interface SerializationService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract <T extends java.lang.Object>java.lang.String serialize(T value, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>T deserialize(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz);
}