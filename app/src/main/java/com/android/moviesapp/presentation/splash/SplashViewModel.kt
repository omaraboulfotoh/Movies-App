package com.android.moviesapp.presentation.splash

import com.abs.app.presentation.app.IGlobalState
import com.android.moviesapp.presentation.base.BaseViewModel
import com.android.moviesapp.presentation.splash.SplashContract.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class SplashViewModel @Inject constructor(
    globalState: IGlobalState,
) : BaseViewModel<Event, State, Effect>(globalState) {


    override fun setInitialState() = State
    override fun handleEvents(event: Event) {
    }
}