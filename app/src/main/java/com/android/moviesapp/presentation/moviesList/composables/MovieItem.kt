package com.android.moviesapp.presentation.moviesList.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.moviesapp.presentation.composables.MessageBody
import com.android.moviesapp.presentation.composables.RemoteImage
import com.android.moviesapp.presentation.composables.SectionTitle
import com.android.moviesapp.presentation.theme.MovieTheme
import com.android.moviesapp.presentation.theme.SmallRoundedCornerCard

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MovieItem(
    title: String?,
    releasedDate: String?,
    poster: String?,
    modifier: Modifier = Modifier,
    onItemClick: () -> Unit = {},
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .heightIn(120.dp),
        border = BorderStroke(width = 1.dp, MovieTheme.colors.stroke),
        shape = SmallRoundedCornerCard,
        backgroundColor = Color.White,
        onClick = onItemClick
    ) {
        Row(modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.Top) {

            // movie poster
            RemoteImage(
                imageUrl = poster,
                description = title,
                modifier = Modifier
                    .weight(4f)
                    .fillMaxHeight()
                    .background(MovieTheme.colors.placeholder)
            )

            // movie info
            Column(modifier = Modifier
                .weight(6f)
                .padding(vertical = 12.dp)
                .fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalAlignment = Alignment.Start) {

                // title
                SectionTitle(text = title.orEmpty(), textAlign = TextAlign.Start)
                // date
                MessageBody(text = releasedDate.orEmpty(), textAlign = TextAlign.Start)
            }
        }


    }
}


@Preview(
    showBackground = true,
    showSystemUi = true,
    backgroundColor = 0xFFFFFF
)
@Composable
fun MovieItemPreview() {
    MovieItem(poster = "", title = "hello world", releasedDate = "23-2333-3303")
}
