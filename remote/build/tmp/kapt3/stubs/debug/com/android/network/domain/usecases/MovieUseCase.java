package com.android.network.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ-\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/android/network/domain/usecases/MovieUseCase;", "", "movieRepo", "Lcom/android/network/domain/repos/MovieRepo;", "(Lcom/android/network/domain/repos/MovieRepo;)V", "getMovieDetails", "Lkotlinx/coroutines/flow/Flow;", "Lcom/android/network/states/Result;", "Lcom/android/model/movie/MovieModel;", "apiKey", "", "movieId", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendMovies", "Lcom/android/model/responses/base/MoviesListResponse;", "page", "remote_debug"})
public final class MovieUseCase {
    private final com.android.network.domain.repos.MovieRepo movieRepo = null;
    
    @javax.inject.Inject()
    public MovieUseCase(@org.jetbrains.annotations.NotNull()
    com.android.network.domain.repos.MovieRepo movieRepo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTrendMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.android.network.states.Result<com.android.model.responses.base.MoviesListResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovieDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.android.network.states.Result<com.android.model.movie.MovieModel>>> continuation) {
        return null;
    }
}