package com.android.moviesapp.presentation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.android.moviesapp.presentation.theme.MovieTheme

@Composable
fun DefaultMessageDialog(
    title: String,
    body: String,
    buttonText: String,
    onNegative: () -> Unit,
    onPositive: () -> Unit,
    dismissOnBackPress: Boolean = true,
    dismissOnClickOutside: Boolean = true,
    bodyColor: Color = Color.White,
    backgroundColor: Color = MovieTheme.colors.background
) {
    Dialog(
        onDismissRequest = onNegative,
        properties = DialogProperties(dismissOnBackPress, dismissOnClickOutside)
    ) {
        Card(
            shape = MaterialTheme.shapes.large,
            backgroundColor = backgroundColor,
        ) {

            Column(
                modifier = Modifier.padding(MovieTheme.spacing.primaryPadding),
                horizontalAlignment = Alignment.End
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {

                    Title(
                        text = title,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = MovieTheme.colors.gold
                    )

                    Image(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Close",
                        modifier = Modifier
                            .clickable { onNegative() }
                            .align(Alignment.CenterEnd),
                        colorFilter = ColorFilter.tint(bodyColor)
                    )
                }

                Spacer(modifier = Modifier.padding(MovieTheme.spacing.l))

                MessageBody(
                    text = body,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = bodyColor
                )

                Spacer(modifier = Modifier.padding(MovieTheme.spacing.xl))

                PrimaryButton(text = buttonText, onClick = onPositive)
            }
        }
    }
}

@Preview
@Composable
fun DefaultMessageDialogPreview() =
    DefaultMessageDialog(
        title = "Title",
        body = "Body",
        buttonText = "Got it",
        onNegative = {},
        onPositive = {}
    )

@Composable
fun TwoButtonsMessageDialog(
    title: String,
    body: String,
    buttonText: String,
    onNegative: () -> Unit,
    onPositive: () -> Unit,
    dismissOnBackPress: Boolean = true,
    dismissOnClickOutside: Boolean = true,
    bodyColor: Color = Color.White,
    backgroundColor: Color = MovieTheme.colors.background,
    negativeButtonText: String
) {
    Dialog(
        onDismissRequest = onNegative,
        properties = DialogProperties(dismissOnBackPress, dismissOnClickOutside)
    ) {
        Card(
            shape = MaterialTheme.shapes.large,
            backgroundColor = backgroundColor,
        ) {

            Column(
                modifier = Modifier.padding(MovieTheme.spacing.primaryPadding),
                horizontalAlignment = Alignment.End
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {

                    Title(
                        text = title,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = MovieTheme.colors.gold
                    )

                    Image(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Close",
                        modifier = Modifier
                            .clickable { onNegative() }
                            .align(Alignment.CenterEnd),
                        colorFilter = ColorFilter.tint(bodyColor)
                    )
                }

                Spacer(modifier = Modifier.padding(MovieTheme.spacing.l))

                MessageBody(
                    text = body,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Start,
                    color = bodyColor
                )

                Spacer(modifier = Modifier.padding(MovieTheme.spacing.l))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    PrimaryButton(
                        modifier = Modifier.weight(0.5f),
                        text = negativeButtonText,
                        onClick = onNegative,
                        background = MovieTheme.colors.greyBtn
                    )
                    Spacer(modifier = Modifier.width(MovieTheme.spacing.s))
                    PrimaryButton(
                        modifier = Modifier.weight(0.5f),
                        text = buttonText,
                        onClick = onPositive
                    )
                }
            }
        }
    }
}

@Composable
fun PatrolStepsMessageDialog(
    title: String,
    body: String,
    buttonText: String,
    onNegative: () -> Unit,
    onPositive: () -> Unit,
    dismissOnBackPress: Boolean = true,
    dismissOnClickOutside: Boolean = true,
    bodyColor: Color = Color.White,
    backgroundColor: Color = MovieTheme.colors.background,
    negativeButtonText: String
) {
    Dialog(
        onDismissRequest = onNegative,
        properties = DialogProperties(dismissOnBackPress, dismissOnClickOutside)
    ) {
        Card(
            shape = MaterialTheme.shapes.large,
            backgroundColor = backgroundColor,
        ) {

            Column(
                modifier = Modifier.padding(MovieTheme.spacing.primaryPadding),
                horizontalAlignment = Alignment.End
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {

                    Title(
                        text = title,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = MovieTheme.colors.gold
                    )

                    Image(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Close",
                        modifier = Modifier
                            .clickable { onPositive() }
                            .align(Alignment.CenterEnd),
                        colorFilter = ColorFilter.tint(bodyColor)
                    )
                }

                Spacer(modifier = Modifier.padding(MovieTheme.spacing.l))

                MessageBody(
                    text = body,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Start,
                    color = bodyColor
                )

                Spacer(modifier = Modifier.padding(MovieTheme.spacing.l))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    PrimaryButton(
                        modifier = Modifier.weight(0.5f),
                        text = negativeButtonText,
                        onClick = onNegative,
                        background = MovieTheme.colors.greyBtn
                    )
                    Spacer(modifier = Modifier.width(MovieTheme.spacing.s))
                    PrimaryButton(
                        modifier = Modifier.weight(0.5f),
                        text = buttonText,
                        onClick = onPositive
                    )
                }
            }
        }
    }
}


@Composable
fun ConfirmationMessageDialog(
    title: String,
    body: String,
    positiveButtonText: String,
    negativeButtonText: String,
    onNegative: () -> Unit,
    onPositive: () -> Unit,
    backgroundColor: Color = MaterialTheme.colors.background
) {
    Dialog(onDismissRequest = onNegative) {
        Card(
            shape = MaterialTheme.shapes.large,
            backgroundColor = backgroundColor,
        ) {

            Column(
                modifier = Modifier.padding(MovieTheme.spacing.primaryPadding),
                horizontalAlignment = Alignment.End
            ) {
                Image(
                    imageVector = Icons.Filled.Close,
                    contentDescription = "Close",
                    modifier = Modifier.clickable { onNegative() }
                )

                Title(
                    text = title,
                    modifier = Modifier.fillMaxWidth(),
                )

                Spacer(modifier = Modifier.padding(MovieTheme.spacing.l))

                MessageBody(
                    text = body,
                    modifier = Modifier.fillMaxWidth(),
                )

                Spacer(modifier = Modifier.padding(MovieTheme.spacing.xl))

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                    ) {
                        PrimaryButton(
                            background = MovieTheme.colors.greyBtn,
                            text = negativeButtonText,
                            onClick = onNegative
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                    ) {
                        PrimaryButton(
                            text = positiveButtonText,
                            onClick = onPositive
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun TwoButtonPreview() =
    TwoButtonsMessageDialog(
        title = "Title",
        body = "Body",
        buttonText = "Got it",
        onNegative = {},
        onPositive = {},
        negativeButtonText = "close"
    )
