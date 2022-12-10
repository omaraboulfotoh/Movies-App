package com.android.network.services

/**
 * Created by Mohamed Shalan on 6/1/20.
 */

interface SerializationService {

	fun <T> serialize(value: T, clazz: Class<T>): String

	fun <T> deserialize(value: String, clazz: Class<T>): T?
}
