package com.android.moviesapp.di

import com.android.network.datasource.MovieRemoteDataSource
import com.android.network.domain.repos.MovieRepo
import com.android.network.domain.repos.impl.MovieRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoriesModule {

    @Singleton
    @Provides
    fun provideMovieRepo(remoteDataSource: MovieRemoteDataSource): MovieRepo =
        MovieRepoImpl(remoteDataSource)

}
