package com.android.model.movie;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u00102\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00b6\u0001\u0010;\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0002\u0010<J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010>\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010@H\u00d6\u0003J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001J\t\u0010B\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b,\u0010\u001d\u00a8\u0006H"}, d2 = {"Lcom/android/model/movie/MovieModel;", "Landroid/os/Parcelable;", "id", "", "originalTitle", "", "title", "overview", "popularity", "", "status", "tagline", "homepage", "backdrop", "poster", "releaseDate", "voteAverage", "", "voteCount", "adult", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getAdult", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackdrop", "()Ljava/lang/String;", "getHomepage", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOriginalTitle", "getOverview", "getPopularity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPoster", "getReleaseDate", "getStatus", "getTagline", "getTitle", "getVoteAverage", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getVoteCount", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/android/model/movie/MovieModel;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class MovieModel implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String originalTitle = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double popularity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tagline = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String homepage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String backdrop = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String poster = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Float voteAverage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer voteCount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean adult = null;
    public static final android.os.Parcelable.Creator<com.android.model.movie.MovieModel> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.model.movie.MovieModel copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "id")
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "original_title")
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "overview")
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "popularity")
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "tagline")
    java.lang.String tagline, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "homepage")
    java.lang.String homepage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "backdrop_path")
    java.lang.String backdrop, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "poster_path")
    java.lang.String poster, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "release_date")
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vote_average")
    java.lang.Float voteAverage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vote_count")
    java.lang.Integer voteCount, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "adult")
    java.lang.Boolean adult) {
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
    
    public MovieModel() {
        super();
    }
    
    public MovieModel(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "id")
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "original_title")
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "overview")
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "popularity")
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "tagline")
    java.lang.String tagline, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "homepage")
    java.lang.String homepage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "backdrop_path")
    java.lang.String backdrop, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "poster_path")
    java.lang.String poster, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "release_date")
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vote_average")
    java.lang.Float voteAverage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vote_count")
    java.lang.Integer voteCount, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "adult")
    java.lang.Boolean adult) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPopularity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTagline() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdrop() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPoster() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getVoteAverage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVoteCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAdult() {
        return null;
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
    public static final class Creator implements android.os.Parcelable.Creator<com.android.model.movie.MovieModel> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.android.model.movie.MovieModel createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.android.model.movie.MovieModel[] newArray(int size) {
            return null;
        }
    }
}