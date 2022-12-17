package com.android.moviesapp.di

import android.content.Context
import com.abs.app.presentation.app.GlobalState
import com.abs.app.presentation.app.IGlobalState
import com.android.moviesapp.MoviesApplication
import com.android.moviesapp.utils.IResourceProvider
import com.android.moviesapp.utils.ResourceProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object CommonModule {

    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): MoviesApplication {
        return app as MoviesApplication
    }

    @Singleton
    @Provides
    fun provideGlobalState(): IGlobalState {
        return GlobalState()
    }

    @Singleton
    @Provides
    fun resourceProvider(@ApplicationContext context: Context): IResourceProvider =
        ResourceProvider(context)
}
