package com.android.model.responses.base.pagination

import com.android.model.IPaginatedModel
import com.squareup.moshi.JsonClass

/**
 * Created by Mohamed Shalan on 6/3/20.
 */

@JsonClass(generateAdapter = true)
data class PaginatedArrayResponseWrapper<T>(
    val data: List<T>,
    val links: PagesLinks,
    val meta: PageMeta
) : IPaginatedModel {


    override val currentPage: Int
        get() = meta.currentPage
    override val lastPage: Int
        get() = meta.lastPage
    override val from: Int
        get() = meta.from ?: 0
    override val to: Int
        get() = meta.to ?: 0
    override val perPage: Int
        get() = meta.perPage

}
