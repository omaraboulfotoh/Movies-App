package com.android.model.responses.base.pagination;

import java.lang.System;

/**
 * Created by Mohamed Shalan on 6/3/20.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u000bH\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\r\u00a8\u0006\'"}, d2 = {"Lcom/android/model/responses/base/pagination/PaginatedArrayResponseWrapper;", "T", "Lcom/android/model/IPaginatedModel;", "data", "", "links", "Lcom/android/model/responses/base/pagination/PagesLinks;", "meta", "Lcom/android/model/responses/base/pagination/PageMeta;", "(Ljava/util/List;Lcom/android/model/responses/base/pagination/PagesLinks;Lcom/android/model/responses/base/pagination/PageMeta;)V", "currentPage", "", "getCurrentPage", "()I", "getData", "()Ljava/util/List;", "from", "getFrom", "lastPage", "getLastPage", "getLinks", "()Lcom/android/model/responses/base/pagination/PagesLinks;", "getMeta", "()Lcom/android/model/responses/base/pagination/PageMeta;", "perPage", "getPerPage", "to", "getTo", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "model_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class PaginatedArrayResponseWrapper<T extends java.lang.Object> implements com.android.model.IPaginatedModel {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> data = null;
    @org.jetbrains.annotations.NotNull()
    private final com.android.model.responses.base.pagination.PagesLinks links = null;
    @org.jetbrains.annotations.NotNull()
    private final com.android.model.responses.base.pagination.PageMeta meta = null;
    
    /**
     * Created by Mohamed Shalan on 6/3/20.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.android.model.responses.base.pagination.PaginatedArrayResponseWrapper<T> copy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> data, @org.jetbrains.annotations.NotNull()
    com.android.model.responses.base.pagination.PagesLinks links, @org.jetbrains.annotations.NotNull()
    com.android.model.responses.base.pagination.PageMeta meta) {
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
    
    public PaginatedArrayResponseWrapper(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> data, @org.jetbrains.annotations.NotNull()
    com.android.model.responses.base.pagination.PagesLinks links, @org.jetbrains.annotations.NotNull()
    com.android.model.responses.base.pagination.PageMeta meta) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.model.responses.base.pagination.PagesLinks component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.model.responses.base.pagination.PagesLinks getLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.model.responses.base.pagination.PageMeta component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.model.responses.base.pagination.PageMeta getMeta() {
        return null;
    }
    
    @java.lang.Override()
    public int getCurrentPage() {
        return 0;
    }
    
    @java.lang.Override()
    public int getLastPage() {
        return 0;
    }
    
    @java.lang.Override()
    public int getFrom() {
        return 0;
    }
    
    @java.lang.Override()
    public int getTo() {
        return 0;
    }
    
    @java.lang.Override()
    public int getPerPage() {
        return 0;
    }
    
    /**
     * check current page against the last page to check if i should paginate or not
     */
    public boolean shouldPaginate() {
        return false;
    }
}