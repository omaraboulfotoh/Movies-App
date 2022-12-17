package com.android.moviesapp.presentation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.moviesapp.R

@Composable
fun AppToolbar(
    title: String? = null,
    showBack: Boolean = false,
    onBackClick: (() -> Unit)? = null,
    showClose: Boolean = false,
    onCloseClick: (() -> Unit)? = null,
    endButtonsContent: (@Composable () -> Unit)? = null,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 20.dp, bottom = 12.dp, start = 24.dp, end = 24.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            // Back icon
            if (showBack) {
                Image(
                    imageVector = Icons.Filled.ArrowBackIosNew,
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                        .padding(top = 18.dp, end = 18.dp)
                        .clickable {
                            onBackClick?.invoke()
                        }
                )
            }

            Spacer(
                modifier = Modifier
                    .height(24.dp)
                    .weight(1f)
            )

            // Close icon
            if (showClose) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_close),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                        .padding(top = 12.dp, start = 12.dp)
                        .clickable {
                            onCloseClick?.invoke()
                        }
                )
            }

            // Render end buttons content if exists
            endButtonsContent?.invoke()
        }

        if (title != null) {
            Title(text = title)
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
)
@Composable
fun CozoToolbarPreview() {
    AppToolbar(
        title = "Add Room",
        showBack = true,
        showClose = true
    )
}
