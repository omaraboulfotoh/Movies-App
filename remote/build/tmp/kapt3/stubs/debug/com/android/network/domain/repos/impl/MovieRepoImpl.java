package com.android.network.domain.repos.impl;

import java.lang.System;

@androidx.annotation.WorkerThread()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J-\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/android/network/domain/repos/impl/MovieRepoImpl;", "Lcom/android/network/domain/repos/MovieRepo;", "movieRemoteDataSource", "Lcom/android/network/datasource/MovieRemoteDataSource;", "(Lcom/android/network/datasource/MovieRemoteDataSource;)V", "getMovieRemoteDataSource", "()Lcom/android/network/datasource/MovieRemoteDataSource;", "setMovieRemoteDataSource", "getMovieDetails", "Lkotlinx/coroutines/flow/Flow;", "Lcom/android/network/states/Result;", "Lcom/android/model/movie/MovieModel;", "apiKey", "", "movieId", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendMovies", "Lcom/android/model/responses/base/MoviesListResponse;", "page", "remote_debug"})
public final class MovieRepoImpl implements com.android.network.domain.repos.MovieRepo {
    @org.jetbrains.annotations.NotNull()
    private com.android.network.datasource.MovieRemoteDataSource movieRemoteDataSource;
    
    @javax.inject.Inject()
    public MovieRepoImpl(@org.jetbrains.annotations.NotNull()
    com.android.network.datasource.MovieRemoteDataSource movieRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.network.datasource.MovieRemoteDataSource getMovieRemoteDataSource() {
        return null;
    }
    
    public final void setMovieRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.android.network.datasource.MovieRemoteDataSource p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTrendMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.android.network.states.Result<com.android.model.responses.base.MoviesListResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovieDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.android.network.states.Result<com.android.model.movie.MovieModel>>> continuation) {
        return null;
    }
}