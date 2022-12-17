package com.android.moviesapp.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.android.moviesapp.common.trigger
import com.android.moviesapp.presentation.composables.wheel.WheelPicker
import com.android.moviesapp.presentation.composables.wheel.rememberFWheelPickerState
import com.android.moviesapp.presentation.theme.MovieTheme
import com.android.moviesapp.R
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheet(
    bottomSheetScaffoldState: BottomSheetScaffoldState,
    modifier: Modifier = Modifier.fillMaxSize(),
    backgroundColor: Color = MaterialTheme.colors.background,
    sheetContentBackgroundColor: Color = MaterialTheme.colors.surface,
    sheetGesturesEnabled: Boolean = true,
    sheetShape: Shape = MaterialTheme.shapes.large,
    sheetElevation: Dp = BottomSheetScaffoldDefaults.SheetElevation,
    sheetPeekHeight: Dp = BottomSheetScaffoldDefaults.SheetPeekHeight,
    topBar: (@Composable () -> Unit)? = null,
    content: @Composable (PaddingValues) -> Unit = {},
    sheetContent: @Composable ColumnScope.() -> Unit
) {
    BottomSheetScaffold(
        topBar = topBar,
        sheetContent = sheetContent,
        modifier = modifier,
        scaffoldState = bottomSheetScaffoldState,
        backgroundColor = backgroundColor,
        sheetBackgroundColor = sheetContentBackgroundColor,
        sheetGesturesEnabled = sheetGesturesEnabled,
        sheetShape = sheetShape,
        sheetElevation = sheetElevation,
        sheetPeekHeight = sheetPeekHeight,
        content = content
    )
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PickerBottomSheet(
    bottomSheetScaffoldState: BottomSheetScaffoldState,
    modifier: Modifier = Modifier.fillMaxSize(),
    backgroundColor: Color = MovieTheme.colors.backgroundColor,
    sheetContentBackgroundColor: Color = MovieTheme.colors.backgroundColor,
    sheetHeaderBackgroundColor: Color = MovieTheme.colors.stroke,
    doneTextColor: Color = MovieTheme.colors.secondaryText,
    optionTextColor: Color = MovieTheme.colors.secondaryText,
    sheetGesturesEnabled: Boolean = false,
    sheetShape: Shape = RectangleShape,
    sheetElevation: Dp = BottomSheetScaffoldDefaults.SheetElevation,
    sheetPeekHeight: Dp = 0.dp,
    topBar: (@Composable () -> Unit)? = null,
    content: @Composable (PaddingValues) -> Unit = {},
    selectedIndex: Int = 0,
    items: List<String>,
    onDone: (item: String, index: Int) -> Unit
) {

    BottomSheet(
        bottomSheetScaffoldState = bottomSheetScaffoldState,
        modifier = modifier,
        backgroundColor = backgroundColor,
        sheetContentBackgroundColor = sheetContentBackgroundColor,
        sheetGesturesEnabled = sheetGesturesEnabled,
        sheetShape = sheetShape,
        sheetElevation = sheetElevation,
        sheetPeekHeight = sheetPeekHeight,
        topBar = topBar,
        content = content
    ) {

        var selection by remember { mutableStateOf(selectedIndex) }
        val coroutineScope = rememberCoroutineScope()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(sheetHeaderBackgroundColor)
                .padding(MovieTheme.spacing.s),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Subtitle(
                text = stringResource(id = R.string.done),
                modifier = Modifier.clickable {
                    bottomSheetScaffoldState.trigger(coroutineScope)
                    if (items.isNotEmpty()) onDone(items[selection], selection)
                },
                color = doneTextColor
            )
        }

        val wheelState = rememberFWheelPickerState(initialIndex = selectedIndex)

        coroutineScope.launch { wheelState.scrollToIndex(selectedIndex) }

        WheelPicker(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = MovieTheme.spacing.primaryPadding),
            count = items.size,
            state = wheelState,
            content = {
                Text(
                    text = items[it],
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 1,
                    textAlign = TextAlign.Center,
                    color = optionTextColor,
                    style = MovieTheme.typography.h5
                )
            },
            onIndexChanged = { selection = it },
            unfocusedCount = 3
        )

        Spacer(modifier = Modifier.height(MovieTheme.spacing.spacerMini))

        DashLine(modifier = Modifier.align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.height(MovieTheme.spacing.spacerMini))
    }
}
