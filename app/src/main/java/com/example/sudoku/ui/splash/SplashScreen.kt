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
import androidx.compose.runtime.LaunchedEffect
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
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController) {

//    use launchedeffect for delay time
    LaunchedEffect(true) {
        delay(5000)
    }
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
                text = "hh".uppercase(),
                fontFamily = FontFamily(Font(R.font.algerianregular)),
                fontSize = 56.sp,
            )
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 280.dp, end = 20.dp, top = 20.dp),
            onClick = {
                      },
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
            modifier = Modifier
                .size(400.dp)
                .offset(y = 240.dp)
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

//    LaunchedEffect(1) {
//        delay(3000)
//        navController.navigate("home")
//    }
    SudokuTheme {
        SplashScreen(navController)
    }
}