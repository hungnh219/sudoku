package com.example.sudoku.ui.home.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sudoku.R

@Composable
fun HomeButton(onClick: () -> Unit, title: String) {
    Button (
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(
            Color.White
        ),
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(2.dp, Color.Black),
        modifier = Modifier
            .width(260.dp)
            .height(48.dp)
    ) {
        Text(
            text = title.uppercase(),
            fontFamily = FontFamily(Font(R.font.algerianregular)),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
        )
    }

    Spacer(modifier = Modifier.height(20.dp))
}