package com.android.moviesapp.presentation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.android.moviesapp.R
import com.android.moviesapp.presentation.theme.MovieTheme
import com.android.moviesapp.presentation.theme.Shapes_MediumX

@Composable
fun TextInputField(
    text: String,
    label: String,
    placeholder: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier.fillMaxWidth(),
    keyboardType: KeyboardType = KeyboardType.Text,
    imeAction: ImeAction = ImeAction.Done,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    textColor: Color = MovieTheme.colors.secondaryText,
    disabledTextColor: Color = textColor.copy(ContentAlpha.disabled),
    backgroundColor: Color = Color.Transparent,
    strokeColor: Color = MovieTheme.colors.borderColor,
    placeholderColor: Color = MovieTheme.colors.placeholder,
    labelColor: Color = textColor,
    cursorColor: Color = textColor,
    trailingIcon: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    singleLine: Boolean = true,
    isEnabled: Boolean = true,
    isReadOnly: Boolean = false,
) {

    Column {
        DescriptionBody(text = label, color = labelColor)

        Spacer(modifier = Modifier.height(MovieTheme.spacing.xs))

        OutlinedTextField(
            value = text,
            placeholder = {
                MessageBody(
                    placeholder,
                    style = MovieTheme.typography.subtitle1,
                    color = placeholderColor
                )
            },
            onValueChange = onValueChange,
            modifier = modifier,
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType, imeAction = imeAction),
            keyboardActions = keyboardActions,
            singleLine = singleLine,
            isError = isError,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = textColor,
                disabledTextColor = disabledTextColor,
                focusedBorderColor = strokeColor,
                unfocusedBorderColor = strokeColor,
                backgroundColor = backgroundColor,
                placeholderColor = placeholderColor,
                unfocusedLabelColor = placeholderColor,
                cursorColor = cursorColor
            ),
            shape = Shapes_MediumX,
            readOnly = isReadOnly,
            enabled = isEnabled,
            trailingIcon = trailingIcon
        )
    }
}

@Composable
fun PickerTextField(
    modifier: Modifier = Modifier.fillMaxWidth(),
    text: String,
    label: String,
    placeholder: String,
    onPick: () -> Unit,
    trailingIcon: ImageVector = Icons.Filled.ArrowDropDown,
    trailingIconTint: Color = MovieTheme.colors.gold,
) {
    TextInputField(
        text = text,
        label = label,
        onValueChange = {},
        placeholder = placeholder,
        isReadOnly = true,
        disabledTextColor = MovieTheme.colors.secondaryText,
        isEnabled = false,
        trailingIcon = {
            Icon(imageVector = trailingIcon, contentDescription = "Pick", tint = trailingIconTint)
        },
        modifier = modifier.clickable { onPick() }
    )
}

@Composable
fun <T> PickerTextInputField(
    text: String,
    label: String,
    placeholder: String,
    onValueChange: (String) -> Unit,
    selectedItem: T,
    items: List<T>,
    previewItem: @Composable RowScope.(item: T) -> Unit,
    pickerItem: @Composable ColumnScope.(item: T, onClick: () -> Unit) -> Unit,
    onItemSelection: (item: T) -> Unit,
    itemSpacer: Dp = MovieTheme.spacing.xxs,
    modifier: Modifier = Modifier.fillMaxWidth(),
    keyboardType: KeyboardType = KeyboardType.Text,
    imeAction: ImeAction = ImeAction.Done,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    textColor: Color = Color.White,
    backgroundColor: Color = Color.Black,
    strokeColor: Color = Color.Black,
    placeholderColor: Color = MovieTheme.colors.placeholder,
    labelColor: Color = textColor,
    cursorColor: Color = textColor,
    isError: Boolean = false,
    singleLine: Boolean = true,
) {

    var isDropdownExpanded by remember { mutableStateOf(false) }

    fun collapse() {
        isDropdownExpanded = isDropdownExpanded.not()
    }

    Column(modifier = modifier) {
        DescriptionBody(text = label, color = labelColor)

        Spacer(modifier = Modifier.height(MovieTheme.spacing.xs))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(backgroundColor, shape = Shapes_MediumX)
                .padding(horizontal = MovieTheme.spacing.s),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Row(
                modifier = Modifier.clickable { collapse() },
                verticalAlignment = Alignment.CenterVertically
            ) {
                previewItem(selectedItem)

                Spacer(modifier = Modifier.width(MovieTheme.spacing.xs))

                Image(
                    imageVector = if (isDropdownExpanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(textColor)
                )
            }

            DropdownMenu(
                modifier = Modifier
                    .padding(horizontal = MovieTheme.spacing.xs)
                    .wrapContentWidth(),
                expanded = isDropdownExpanded,
                onDismissRequest = { collapse() },
                content = {
                    items.forEachIndexed { index, item ->
                        pickerItem(item) { onItemSelection(item); collapse() }
                        if (index != items.lastIndex) Spacer(modifier = Modifier.height(itemSpacer))
                    }
                }
            )

            OutlinedTextField(
                value = text,
                placeholder = {
                    MessageBody(
                        placeholder,
                        style = MovieTheme.typography.body1,
                        color = placeholderColor
                    )
                },
                onValueChange = onValueChange,
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = keyboardType,
                    imeAction = imeAction
                ),
                keyboardActions = keyboardActions,
                singleLine = singleLine,
                isError = isError,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = textColor,
                    focusedBorderColor = strokeColor,
                    unfocusedBorderColor = strokeColor,
                    backgroundColor = backgroundColor,
                    placeholderColor = placeholderColor,
                    unfocusedLabelColor = placeholderColor,
                    cursorColor = cursorColor
                ),
                shape = Shapes_MediumX
            )
        }
    }
}

@Composable
fun SearchTextInput(
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
    value: String,
    textColor: Color = Color.Black,
    onValueChange: (String) -> Unit,
    hint: String = stringResource(id = R.string.search),
    fontSize: TextUnit = MovieTheme.typography.subtitle1.fontSize,
    backgroundColor: Color = MovieTheme.colors.black,
) {
    BasicTextField(
        modifier = modifier
            .background(
                backgroundColor,
                MaterialTheme.shapes.small,
            )
            .fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        cursorBrush = SolidColor(Color.White),
        textStyle = LocalTextStyle.current.copy(
            color = textColor,
            fontSize = fontSize
        ),
        decorationBox = { innerTextField ->
            Row(
                modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (leadingIcon != null) leadingIcon()
                Box(Modifier.weight(1f)) {
                    if (value.isEmpty()) Text(
                        hint,
                        style = LocalTextStyle.current.copy(
                            color = textColor,
                            fontSize = fontSize
                        )
                    )
                    innerTextField()
                }
                if (trailingIcon != null) trailingIcon()
            }
        }
    )
}
