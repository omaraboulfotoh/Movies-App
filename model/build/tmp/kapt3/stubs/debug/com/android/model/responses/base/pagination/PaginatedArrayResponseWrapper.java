package com.android.model.responses.base.pagination;

import java.lang.System;

/**
 * Created by Mohamed Shalan on 6/3/20.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B3\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J=\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/android/model/responses/base/pagination/PaginatedArrayResponseWrapper;", "T", "Lcom/android/model/IPaginatedModel;", "results", "", "page", "", "totalPages", "totalResults", "(Ljava/util/List;III)V", "getPage", "()I", "getResults", "()Ljava/util/List;", "getTotalPages", "getTotalResults", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "model_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class PaginatedArrayResponseWrapper<T extends java.lang.Object> implements com.android.model.IPaginatedModel {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> results = null;
    private final int page = 0;
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    private final int totalPages = 0;
    @com.google.gson.annotations.SerializedName(value = "total_results")
    private final int totalResults = 0;
    
    /**
     * Created by Mohamed Shalan on 6/3/20.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.android.model.responses.base.pagination.PaginatedArrayResponseWrapper<T> copy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> results, int page, int totalPages, int totalResults) {
        return null;
    }
    
    /**
     * Created by Mohamed Shalan on 6/3/20.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Created by Mohamed Shalan on 6/3/20.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Mohamed Shalan on 6/3/20.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PaginatedArrayResponseWrapper() {
        super();
    }
    
    public PaginatedArrayResponseWrapper(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> results, int page, int totalPages, int totalResults) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getResults() {
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
}