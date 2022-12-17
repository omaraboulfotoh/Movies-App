package com.android.network.domain.usecases;

import com.android.network.domain.repos.MovieRepo;
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
public final class MovieUseCase_Factory implements Factory<MovieUseCase> {
  private final Provider<MovieRepo> movieRepoProvider;

  public MovieUseCase_Factory(Provider<MovieRepo> movieRepoProvider) {
    this.movieRepoProvider = movieRepoProvider;
  }

  @Override
  public MovieUseCase get() {
    return newInstance(movieRepoProvider.get());
  }

  public static MovieUseCase_Factory create(Provider<MovieRepo> movieRepoProvider) {
    return new MovieUseCase_Factory(movieRepoProvider);
  }

  public static MovieUseCase newInstance(MovieRepo movieRepo) {
    return new MovieUseCase(movieRepo);
  }
}
