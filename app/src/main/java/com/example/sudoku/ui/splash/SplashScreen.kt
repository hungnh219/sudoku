package com.example.sudoku.ui.splash

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.sudoku.R

import com.example.sudoku.ui.theme.SudokuTheme
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun FakeSplashScreen(navController: NavController, goToHomeScreen: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.splash_background),
            contentDescription = "hungnh219",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 220.dp)
        ) {
            Text(
                text = "sudoku".uppercase(),
                fontFamily = FontFamily(Font(R.font.bauhs93)),
                fontSize = 72.sp,
            )
            Text(
                text = "fake splash".uppercase(),
                fontFamily = FontFamily(Font(R.font.algerianregular)),
                fontSize = 56.sp,
            )
        }
        Button(
            modifier = Modifier
//                .width(80.dp)
                .fillMaxWidth()
                .padding(start = 280.dp, end = 20.dp, top = 20.dp),
//                .offset(y = 200.dp)
//                .border(
//                    width = 2.dp,
//                    color = Color.Black,
//                    shape = RoundedCornerShape(12.dp)
//                ),
            onClick = { navController.navigate("home") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(2.dp, Color.Black)
        ) {
            Text(
                text = "Skip".uppercase(),
                fontFamily = FontFamily(Font(R.font.algerianregular)),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )
        }

        Image(
            painter = painterResource(id = R.drawable.splash_sudoku_board),
            contentDescription = "hungnh219",
//            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(400.dp)
                .offset(y = 240.dp)
//                .align(Alignment.Center)
        )
    }
}

@Composable
@Preview(
    showSystemUi = true,
    showBackground = true
)
fun SplashScreenPreview() {
    val navController = rememberNavController()
    SudokuTheme {
        FakeSplashScreen(navController, {})
    }
}