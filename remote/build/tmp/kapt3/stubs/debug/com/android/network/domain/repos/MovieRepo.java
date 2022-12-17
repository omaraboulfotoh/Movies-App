package com.android.network.domain.repos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ-\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/android/network/domain/repos/MovieRepo;", "", "getMovieDetails", "Lkotlinx/coroutines/flow/Flow;", "Lcom/android/network/states/Result;", "Lcom/android/model/movie/MovieModel;", "apiKey", "", "movieId", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendMovies", "Lcom/android/model/responses/base/MoviesListResponse;", "page", "remote_debug"})
public abstract interface MovieRepo {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTrendMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.android.network.states.Result<com.android.model.responses.base.MoviesListResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.android.network.states.Result<com.android.model.movie.MovieModel>>> continuation);
}