package com.example.sudoku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
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
                    GreetingPreview()
                }
            }
        }
    }
}

@Composable
fun GameScreen(goToHomeScreen: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val num = remember { mutableStateOf("")}
        val isClicked = remember { mutableStateOf(false) }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 280.dp, end = 20.dp, top = 20.dp),
            onClick = { goToHomeScreen() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(2.dp, Color.Black)
        ) {
            Text(
                text = "Back".uppercase(),
                fontFamily = FontFamily(Font(R.font.algerianregular)),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )
        }

        Row(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth()
                .background(Color.Magenta)
            ,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp),
                onClick = { if (isClicked.value) num.value = "1" },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = "1".uppercase(),
                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }

            Button(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp),
                onClick = { if (isClicked.value) num.value = "2" },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = "2".uppercase(),
                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }

            Button(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp),
                onClick = { if (isClicked.value) num.value = "3" },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = "3".uppercase(),
                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .height(60.dp)
                .width(60.dp)
                .background(Color.Cyan)
                .border(
                    width = if (isClicked.value) 2.dp else 0.dp,
                    color = if (isClicked.value) Color.Red else Color.Transparent
                )
                .clickable {
                    isClicked.value = !isClicked.value
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "${num.value}",
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .height(360.dp)
                .width(360.dp)
                .background(Color.LightGray)
        ) {
            Text(
                text = "hung",
                modifier = Modifier
                    .matchParentSize()
            )
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

@Composable
fun SplashScreen(moveToHomeScreen: () -> Unit) {
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
//                .width(80.dp)
                .fillMaxWidth()
                .padding(start = 280.dp, end = 20.dp, top = 20.dp),
//                .offset(y = 200.dp)
//                .border(
//                    width = 2.dp,
//                    color = Color.Black,
//                    shape = RoundedCornerShape(12.dp)
//                ),
            onClick = { moveToHomeScreen() },
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
fun HomeScreen(goToGameScreen: () -> Unit) {
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
                onClick = { goToGameScreen() },
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
                onClick = { goToGameScreen() },
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
                onClick = {},
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

@Composable
fun SudokuApp(modifier: Modifier = Modifier) {

//    HomeScreen()
//    GameScreen()
//    SplashScreen()
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
        NavHost(navController = navController, startDestination = "game") {
            // route: home
            composable("home") {
                HomeScreen( goToGameScreen = { navController.navigate("game")})
            }

            // route: splash
            composable("splash") {
                SplashScreen( moveToHomeScreen = { navController.navigate("home")})
            }

            // route: game
            composable("game") {
                GameScreen( goToHomeScreen = { navController.navigate("home")})
            }
        }
//        SudokuApp()
    }
}