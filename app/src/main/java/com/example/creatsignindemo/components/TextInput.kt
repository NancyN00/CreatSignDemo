package com.example.creatsignindemo.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange : (String) ->Unit,
    placeholder: String
){
    val borderColor = MaterialTheme.colorScheme.onBackground.copy(.5f)

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(
                text = placeholder,
                color = borderColor)
        },
        shape = RoundedCornerShape(8.dp),
        modifier = modifier.fillMaxWidth(),
        colors = TextFieldDefaults.textFieldColors(
            unfocusedIndicatorColor = borderColor,
            placeholderColor = borderColor,
            containerColor = Color.Transparent
        )

        )
}