package com.android.network.datasource.impl;

import com.android.network.service.MovieApiServices;
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
public final class MovieRemoteDataSourceImp_Factory implements Factory<MovieRemoteDataSourceImp> {
  private final Provider<MovieApiServices> apiServicesProvider;

  public MovieRemoteDataSourceImp_Factory(Provider<MovieApiServices> apiServicesProvider) {
    this.apiServicesProvider = apiServicesProvider;
  }

  @Override
  public MovieRemoteDataSourceImp get() {
    return newInstance(apiServicesProvider.get());
  }

  public static MovieRemoteDataSourceImp_Factory create(
      Provider<MovieApiServices> apiServicesProvider) {
    return new MovieRemoteDataSourceImp_Factory(apiServicesProvider);
  }

  public static MovieRemoteDataSourceImp newInstance(MovieApiServices apiServices) {
    return new MovieRemoteDataSourceImp(apiServices);
  }
}
