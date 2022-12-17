package com.android.model.responses.base;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J7\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\""}, d2 = {"Lcom/android/model/responses/base/MoviesListResponse;", "Landroid/os/Parcelable;", "results", "", "Lcom/android/model/movie/MovieModel;", "page", "", "totalPages", "totalResults", "(Ljava/util/List;III)V", "getPage", "()I", "getResults", "()Ljava/util/List;", "getTotalPages", "getTotalResults", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class MoviesListResponse implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.android.model.movie.MovieModel> results = null;
    private final int page = 0;
    private final int totalPages = 0;
    private final int totalResults = 0;
    public static final android.os.Parcelable.Creator<com.android.model.responses.base.MoviesListResponse> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.model.responses.base.MoviesListResponse copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.model.movie.MovieModel> results, int page, @com.squareup.moshi.Json(name = "total_pages")
    int totalPages, @com.squareup.moshi.Json(name = "total_results")
    int totalResults) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MoviesListResponse() {
        super();
    }
    
    public MoviesListResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.model.movie.MovieModel> results, int page, @com.squareup.moshi.Json(name = "total_pages")
    int totalPages, @com.squareup.moshi.Json(name = "total_results")
    int totalResults) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.android.model.movie.MovieModel> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.android.model.movie.MovieModel> getResults() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.android.model.responses.base.MoviesListResponse> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.android.model.responses.base.MoviesListResponse createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.android.model.responses.base.MoviesListResponse[] newArray(int size) {
            return null;
        }
    }
}