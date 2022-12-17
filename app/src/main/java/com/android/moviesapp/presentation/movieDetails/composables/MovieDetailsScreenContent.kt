package com.android.moviesapp.presentation.movieDetails.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.model.movie.MovieModel
import com.android.moviesapp.presentation.composables.AppToolbar
import com.android.moviesapp.presentation.composables.MessageBody
import com.android.moviesapp.presentation.composables.RemoteImage
import com.android.moviesapp.presentation.composables.Title
import com.android.moviesapp.presentation.movieDetails.MovieDetailsContract.Event
import com.android.moviesapp.presentation.movieDetails.MovieDetailsContract.State
import com.android.moviesapp.presentation.theme.MovieTheme

@Composable
fun MovieDetailsScreenContent(
    state: State,
    onEventSent: ((event: Event) -> Unit),
) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)) {

        // toolbar
        AppToolbar(title = state.movie?.title.orEmpty(),
            showBack = true,
            onBackClick = {
                onEventSent(Event.OnBackCLicked)
            })

        // content
        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)) {

            // header image
            RemoteImage(modifier = Modifier
                .fillMaxWidth()
                .height(180.dp),
                imageUrl = state.movie?.backdrop)


            Spacer(modifier = Modifier.heightIn(MovieTheme.spacing.spacerM))
            // title
            Title(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp),
                text = state.movie?.title.orEmpty(),
                textAlign = TextAlign.Start)

            // date
            MessageBody(modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                text = state.movie?.releaseDate.orEmpty(), textAlign = TextAlign.Start)

            // description
            MessageBody(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp),
                text = state.movie?.overview.orEmpty(),
                textAlign = TextAlign.Start)

        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    backgroundColor = 0xFFFFFF
)
@Composable
fun MovieDetailsScreenContentPreview() {
    MovieDetailsScreenContent(state = State(
        movie = MovieModel(
            title = "new Movie",
            releaseDate = "10-10-2020",
            overview = "helelo iasdfksdh skdfhs dkf sdkfhsd "),
    ), onEventSent = {})
}
