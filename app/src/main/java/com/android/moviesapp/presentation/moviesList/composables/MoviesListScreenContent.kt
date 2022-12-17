package com.android.moviesapp.presentation.moviesList.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.android.moviesapp.presentation.moviesList.MoviesListContract.Event
import com.android.moviesapp.presentation.moviesList.MoviesListContract.State


@Composable
fun MoviesListScreenContent(
    state: State,
    onEventSent: ((event: Event) -> Unit),
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(all = 16.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp),
        contentPadding = PaddingValues(bottom = 18.dp)) {
        itemsIndexed(
            items = state.list
        ) { index, item ->

            // list draw item
            MovieItem(
                title = item.title,
                releasedDate = item.releaseDate,
                poster = item.poster,
                modifier = Modifier.fillMaxSize(), onItemClick = {
                    onEventSent(Event.OnItemClick(index))
                }
            )
            // Check to trigger reached list end if required
            if (index == state.list.lastIndex && state.isLoadingMore.not()) {
                onEventSent(Event.ReachedListEnd)
            }
        }
    }
}