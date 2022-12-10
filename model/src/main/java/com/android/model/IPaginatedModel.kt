package com.android.model

/**
 * Created by Mohamed Shalan on 6/2/20.
 */


/**
 * An interface will be used for any paginated response/model
 * */

interface IPaginatedModel {

	val currentPage: Int

	val lastPage: Int

	val from: Int

	val to: Int

	val perPage: Int

	/**
	 * check current page against the last page to check if i should paginate or not
	 * */
	fun shouldPaginate(): Boolean = currentPage < lastPage
}
