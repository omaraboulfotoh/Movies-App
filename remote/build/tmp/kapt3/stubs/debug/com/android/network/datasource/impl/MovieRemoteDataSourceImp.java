package com.android.network.datasource.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/android/network/datasource/impl/MovieRemoteDataSourceImp;", "Lcom/android/network/datasource/MovieRemoteDataSource;", "apiServices", "Lcom/android/network/service/MovieApiServices;", "(Lcom/android/network/service/MovieApiServices;)V", "getMovieDetails", "Lretrofit2/Response;", "Lcom/android/model/movie/MovieModel;", "apiKey", "", "movieId", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendMovies", "Lcom/android/model/responses/base/MoviesListResponse;", "page", "remote_debug"})
public final class MovieRemoteDataSourceImp implements com.android.network.datasource.MovieRemoteDataSource {
    private final com.android.network.service.MovieApiServices apiServices = null;
    
    @javax.inject.Inject()
    public MovieRemoteDataSourceImp(@org.jetbrains.annotations.NotNull()
    com.android.network.service.MovieApiServices apiServices) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTrendMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.android.model.responses.base.MoviesListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovieDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.android.model.movie.MovieModel>> continuation) {
        return null;
    }
}