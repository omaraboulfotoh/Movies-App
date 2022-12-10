package com.android.local;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PrefersStoreImp_Factory implements Factory<PrefersStoreImp> {
  private final Provider<Context> contextProvider;

  public PrefersStoreImp_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PrefersStoreImp get() {
    return newInstance(contextProvider.get());
  }

  public static PrefersStoreImp_Factory create(Provider<Context> contextProvider) {
    return new PrefersStoreImp_Factory(contextProvider);
  }

  public static PrefersStoreImp newInstance(Context context) {
    return new PrefersStoreImp(context);
  }
}
