package com.android.local;

import android.content.SharedPreferences;
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
public final class SharedPrefersManager_Factory implements Factory<SharedPrefersManager> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SharedPrefersManager_Factory(Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SharedPrefersManager get() {
    return newInstance(sharedPreferencesProvider.get());
  }

  public static SharedPrefersManager_Factory create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SharedPrefersManager_Factory(sharedPreferencesProvider);
  }

  public static SharedPrefersManager newInstance(SharedPreferences sharedPreferences) {
    return new SharedPrefersManager(sharedPreferences);
  }
}
