package com.android.local

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PrefersStoreImp @Inject constructor(@ApplicationContext var context: Context) : PrefersStore {


    private object PreferencesKeys {
        var tokenKeyName = "token"
        var fcmTokenKeyName = "fcm_token"


        val TOKEN = stringPreferencesKey(tokenKeyName)
        val FCMTOKEN = stringPreferencesKey(fcmTokenKeyName)

    }

    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "user_data")

    override suspend fun saveUserToken(token: String) {
        context.dataStore.edit {
            it[PreferencesKeys.TOKEN] = token
        }
    }

    override fun getUserToken(): Flow<String> =
        context.dataStore.data.catch { exception ->
            // dataStore.data throws an IOException when an error is encountered when reading data
            if (exception is IOException) {
                emit(emptyPreferences())
            } else {
                throw exception
            }
        }.map { it[PreferencesKeys.TOKEN] ?: "" }


    override suspend fun saveFCMToken(token: String) {
        context.dataStore.edit {
            it[PreferencesKeys.FCMTOKEN] = token
        }
    }

    override fun getFCMToken(): Flow<String> =
        context.dataStore.data.catch { exception ->
            if (exception is IOException) {
                emit(emptyPreferences())
            } else throw exception
        }.map { it[PreferencesKeys.FCMTOKEN] ?: "" }
}