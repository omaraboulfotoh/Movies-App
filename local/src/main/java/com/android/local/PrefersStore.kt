package com.android.local

import kotlinx.coroutines.flow.Flow

interface PrefersStore {

    suspend fun saveUserToken(token: String)
    fun getUserToken(): Flow<String>
    suspend fun saveFCMToken(token: String)
    fun getFCMToken(): Flow<String>

}