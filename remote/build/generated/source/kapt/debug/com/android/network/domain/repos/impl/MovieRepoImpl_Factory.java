package com.android.network.domain.repos.impl;

import com.android.network.datasource.MovieRemoteDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieRepoImpl_Factory implements Factory<MovieRepoImpl> {
  private final Provider<MovieRemoteDataSource> movieRemoteDataSourceProvider;

  public MovieRepoImpl_Factory(Provider<MovieRemoteDataSource> movieRemoteDataSourceProvider) {
    this.movieRemoteDataSourceProvider = movieRemoteDataSourceProvider;
  }

  @Override
  public MovieRepoImpl get() {
    return newInstance(movieRemoteDataSourceProvider.get());
  }

  public static MovieRepoImpl_Factory create(
      Provider<MovieRemoteDataSource> movieRemoteDataSourceProvider) {
    return new MovieRepoImpl_Factory(movieRemoteDataSourceProvider);
  }

  public static MovieRepoImpl newInstance(MovieRemoteDataSource movieRemoteDataSource) {
    return new MovieRepoImpl(movieRemoteDataSource);
  }
}
