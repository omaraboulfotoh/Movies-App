package com.android.model;

import java.lang.System;

/**
 * An interface will be used for any paginated response/model
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0005\u00a8\u0006\u0010"}, d2 = {"Lcom/android/model/IPaginatedModel;", "", "currentPage", "", "getCurrentPage", "()I", "from", "getFrom", "lastPage", "getLastPage", "perPage", "getPerPage", "to", "getTo", "shouldPaginate", "", "model_debug"})
public abstract interface IPaginatedModel {
    
    public abstract int getCurrentPage();
    
    public abstract int getLastPage();
    
    public abstract int getFrom();
    
    public abstract int getTo();
    
    public abstract int getPerPage();
    
    /**
     * check current page against the last page to check if i should paginate or not
     */
    public abstract boolean shouldPaginate();
    
    /**
     * An interface will be used for any paginated response/model
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        /**
         * check current page against the last page to check if i should paginate or not
         */
        public static boolean shouldPaginate(@org.jetbrains.annotations.NotNull()
        com.android.model.IPaginatedModel $this) {
            return false;
        }
    }
}