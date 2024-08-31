package com.example.jetpackcompose.data.models

import androidx.compose.ui.graphics.Color
import com.example.jetpackcompose.ui.theme.HighPriorityColor
import com.example.jetpackcompose.ui.theme.LowPriorityColor
import com.example.jetpackcompose.ui.theme.MediumPriorityColor
import com.example.jetpackcompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}