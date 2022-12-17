package com.android.moviesapp.di

import com.android.local.SharedPrefersManager
import com.android.model.OptionsList
import com.android.moviesapp.BuildConfig
import com.android.network.BaseUrl
import com.android.network.OkHttpClientFactory
import com.android.network.RetrofitFactory
import com.android.network.services.OptionsListDeserializer
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideBaseUrl() = BaseUrl(





        BuildConfig.BASE_URL)


    @Provides
    @Singleton
    fun provideMoshi(): Moshi = Moshi.Builder().build()


    @Provides
    @Singleton
    fun provideOkHttpClient(sharedPreferences: SharedPrefersManager): OkHttpClient {
        return OkHttpClientFactory.createOkHttpClient(
            isDebug = BuildConfig.DEBUG,
            sslSocket = null,
            prefersStore = sharedPreferences
        )
    }

    @Provides
    @Singleton
    fun providesGson(): Gson {
        return GsonBuilder()
            .setLenient()
            .registerTypeAdapter(OptionsList::class.java, OptionsListDeserializer())
            .serializeNulls()
            .create()
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        baseUrl: BaseUrl,
        okHttpClient: OkHttpClient,
        moshi: Moshi,
    ): Retrofit {
        return RetrofitFactory.createRetrofit(
            baseUrl = baseUrl,
            okHttpClient = okHttpClient,
            moshi = moshi
        )
    }
}
