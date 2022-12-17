package  com.android.moviesapp.di

import android.content.Context
import android.content.SharedPreferences
import com.android.local.Constants
import com.android.local.PrefersStore
import com.android.local.PrefersStoreImp
import com.android.local.SharedPrefersManager
import com.android.moviesapp.common.event.CompDispatcher
import com.android.moviesapp.common.event.IODispatcher
import com.android.moviesapp.common.event.MainDispatcher
import com.android.moviesapp.utils.AppCoroutineDispatchers
import com.android.network.datasource.MovieRemoteDataSource
import com.android.network.datasource.impl.MovieRemoteDataSourceImp
import com.android.network.service.MovieApiServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Singleton
    @Provides
    fun provideMovieApiServices(retrofit: Retrofit): MovieApiServices =
        retrofit.create(MovieApiServices::class.java)

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(remoteApiServices: MovieApiServices): MovieRemoteDataSource =
        MovieRemoteDataSourceImp(remoteApiServices)

    @Singleton
    @Provides
    fun provideDataStore(@ApplicationContext appContext: Context): PrefersStore =
        PrefersStoreImp(appContext)

    @Singleton
    @Provides
    fun provideSharedPreference(@ApplicationContext context: Context): SharedPreferences =
        context.getSharedPreferences(Constants.sharedPreferencesName, 0)

    @Singleton
    @Provides
    fun provideSharedPrefersManager(sharedPreferences: SharedPreferences): SharedPrefersManager =
        SharedPrefersManager(sharedPreferences)

    @Singleton
    @Provides
    fun provideCoroutineDispatchers() = AppCoroutineDispatchers(
        io = Dispatchers.IO,
        computation = Dispatchers.Default,
        main = Dispatchers.Main
    )

    @Provides
    @IODispatcher
    fun providesIODispatcher(dispatchers: AppCoroutineDispatchers): CoroutineDispatcher {
        return dispatchers.io
    }

    @Provides
    @MainDispatcher
    fun providesMainDispatcher(dispatchers: AppCoroutineDispatchers): CoroutineDispatcher {
        return dispatchers.main
    }

    @Provides
    @CompDispatcher
    fun providesComputationDispatcher(dispatchers: AppCoroutineDispatchers): CoroutineDispatcher {
        return dispatchers.computation
    }
}