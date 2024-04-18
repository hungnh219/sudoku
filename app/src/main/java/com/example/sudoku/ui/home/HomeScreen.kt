package com.example.sudoku.ui.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sudoku.R

import com.example.sudoku.ui.theme.SudokuTheme

@Composable
fun HomeScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.home_background),
            contentDescription = "hungnh219",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 160.dp)
        ) {
            Text(
                text = "sudoku".uppercase(),
                fontFamily = FontFamily(Font(R.font.bauhs93)),
                fontSize = 64.sp,
            )
            Text(
                text = "hh".uppercase(),
                fontFamily = FontFamily(Font(R.font.algerianregular)),
                fontSize = 40.sp,
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 480.dp)
        ) {
            Button (
                onClick = { navController.navigate("game") },
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
                    text = "Continue".uppercase(),
                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button (
                onClick = { navController.navigate("game") },
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
                    text = "New".uppercase(),
                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button (
                onClick = { navController.navigate("game") },
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
                    text = "About".uppercase(),
                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomePreview() {
    SudokuTheme {
        HomeScreen(rememberNavController());
    }
}