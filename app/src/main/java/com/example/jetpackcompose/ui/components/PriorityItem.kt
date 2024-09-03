package com.example.jetpackcompose.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.data.models.Priority
import com.example.jetpackcompose.ui.theme.LARGE_PADDING
import com.example.jetpackcompose.ui.theme.Typography

@Composable
fun PriorityIem(priority: Priority) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Canvas(modifier = Modifier.size(16.dp)) {
            drawCircle(color = priority.color)
        }
        Text(
            modifier = Modifier
                .padding(LARGE_PADDING),
            text = priority.name,
            style = Typography.subtitle1,
            color = MaterialTheme.colors.onSurface
        )
    }
}


@Composable
@Preview
fun PriorityItemPreview() {
    PriorityIem(priority = Priority.LOW)
}