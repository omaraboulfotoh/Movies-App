package com.android.moviesapp.di

import com.android.network.domain.repos.MovieRepo
import com.android.network.domain.usecases.MovieUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    /**
     * All UseCases
     */
    @Provides
    fun provideMovieUseCase(userRepo: MovieRepo) = MovieUseCase(userRepo)

}