package com.android.core.util

import com.android.core.BuildConfig


class BuildTypeProvider{

    fun isDebugBuild() = BuildConfig.DEBUG
}
