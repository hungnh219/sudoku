package com.example.sudoku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sudoku.ui.theme.SudokuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SudokuTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SudokuApp()
                }
            }
        }
    }
}

//fun Plus2Numbers(firstNum: Int, secondNum: Int) {
//    return firstNum + secondNum;
//}
//
//@Composable
//fun HomeScreen() {
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Spacer(modifier = Modifier.height(60.dp))
//
//        Text(
//            text = "this is the sudoku board!",
//            fontSize = 24.sp,
//            fontWeight = FontWeight.Bold,
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .background(Color.Red)
//                .fillMaxWidth()
//                .padding(horizontal = 20.dp)
//        )
//
//        Spacer(modifier = Modifier.height(40.dp))
//
//        Image(
//            painter = painterResource(id = R.drawable.logo),
//            contentDescription = "hungnh219",
//            modifier = Modifier
//                .clip(RoundedCornerShape(45))
//                .size(height = 300.dp, width = 700.dp)
//        )
//
//        Spacer(modifier = Modifier.height(80.dp))
//
//        Button(
//            onClick = {},
//            colors = ButtonDefaults.buttonColors(
//                contentColor = Color.Green,
//                containerColor = Color.Gray
//            ),
//            modifier = Modifier
//                .width(300.dp)
//        ) {
//            Text("Continue")
//        }
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(
//            onClick = {},
//            modifier = Modifier
//                .width(300.dp)
//        ) {
//            Text("New game")
//        }
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(
//            onClick = {},
//            modifier = Modifier
//                .width(300.dp)
//        ) {
//            Text("About us")
//        }
//    }
//}

@Composable
fun GameScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth()
                .background(Color.Magenta)
        ) {
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth()
                .background(Color.Cyan)
        ) {

        }

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .height(360.dp)
                .width(360.dp)
                .background(Color.LightGray)
        ) {

        }

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth()
                .background(Color.Green)
        ) {

        }

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth()
                .background(Color.Red)
        ) {

        }
    }
}
//
//@Composable
//fun FlashScreen() {
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Spacer(modifier = Modifier.height(40.dp))
//
//        Image(
//            painter = painterResource(id = R.drawable.logo),
//            contentDescription = "hungnh219",
//            modifier = Modifier
//                .fillMaxWidth()
//        )
//
//        Spacer(modifier = Modifier.height(60.dp))
//
//        Text(
//            text = "Welcome to Sudoku Game",
//            fontSize = 32.sp,
//            fontWeight = FontWeight.Bold
//        )
//
//        Spacer(modifier = Modifier.height(60.dp))
//
//        Button(
//            onClick = {},
//            modifier = Modifier
//                .width(200.dp)
//                .height(60.dp)
//        ) {
//            Text("next")
//        }
//    }
//}

@Composable
fun SplashScreen() {
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

        ) {
            Text(
                text = "sudoku".uppercase(),
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "hh".uppercase(),
            )
        }
        Button(
            modifier = Modifier
//                .width(80.dp)
                .fillMaxWidth()
                .padding(start = 288.dp, end = 20.dp, top = 20.dp)
//                .offset(y = 200.dp)
                .border(
                    width = 2.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(10.dp)
                ),
            onClick = {},
        ) {
            Text("next")
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
fun HomeScreen() {
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

        Image(
            painter = painterResource(id = R.drawable.splash_background),
            contentDescription = "hungnh219",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )
    }
}

@Composable
fun SudokuApp(modifier: Modifier = Modifier) {

//    HomeScreen()
//    GameScreen()
    SplashScreen()
}

// su dung navigation tu ham nay
@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun GreetingPreview() {
    val navController = rememberNavController()

    SudokuTheme {
        NavHost(navController = navController, startDestination = "home") {
            composable("home") {
                SudokuApp()
            }
        }
//        SudokuApp()
    }
}