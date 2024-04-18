package com.example.sudoku.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Cell(bgColor: Color) {
    Box(
        modifier = Modifier
            .height(40.dp)
            .width(40.dp)
            .background(bgColor)
    ) {

    }
}

@Preview(
    showBackground = true,
)
@Composable
fun BoardGame() {
    Column() {
        repeat(2) { it ->
            if (it % 2 == 1) {
                Row() {
                    Cell(Color.Red)
                    Cell(Color.Blue)
                }
            } else {
                Row() {
                    Cell(Color.Blue)
                    Cell(Color.Red)
                }
            }
        }
    }
}