package com.example.creatsignindemo.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InputLabel(
    modifier: Modifier = Modifier,
    label: String
){
    Text(text = label, modifier = modifier.padding(bottom = 8.dp))
}