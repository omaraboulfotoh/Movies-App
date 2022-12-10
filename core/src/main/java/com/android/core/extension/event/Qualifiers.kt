package com.android.core.extension.event

import javax.inject.Qualifier

/**
 * Created by Amr Elghobary on 6/21/20.
 */

@Retention(AnnotationRetention.RUNTIME)
@Qualifier
@MustBeDocumented
annotation class IODispatcher

@Retention(AnnotationRetention.RUNTIME)
@Qualifier
@MustBeDocumented
annotation class MainDispatcher

@Retention(AnnotationRetention.RUNTIME)
@Qualifier
@MustBeDocumented
annotation class CompDispatcher
