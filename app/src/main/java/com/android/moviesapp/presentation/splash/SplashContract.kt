package com.android.moviesapp.presentation.splash

import com.android.moviesapp.presentation.base.ViewEvent
import com.android.moviesapp.presentation.base.ViewSideEffect
import com.android.moviesapp.presentation.base.ViewState

class SplashContract {

    object State : ViewState

    sealed class Event : ViewEvent

    sealed class Effect : ViewSideEffect {
        sealed class Navigation : Effect() {
            object GoToHome : Navigation()
        }
    }
}