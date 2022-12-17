package com.android.moviesapp.presentation.splash.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.android.moviesapp.R
import com.android.moviesapp.presentation.splash.SplashContract
import com.android.moviesapp.presentation.theme.MovieTheme

@Composable
fun SplashScreenContent(state: SplashContract.State) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(MovieTheme.colors.backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .weight(1f))

        Image(modifier = Modifier
            .fillMaxWidth()
            .height(120.dp),
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .weight(2f))
    }

}