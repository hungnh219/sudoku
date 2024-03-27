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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.window.Popup
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sudoku.ui.theme.SudokuTheme
import com.example.sudoku.ui.splash.FakeSplashScreen

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
fun GameScreen(goToHomeScreen: () -> Unit, goToFakeSplashScreen: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val num = remember { mutableStateOf("")}
        val isClicked = remember { mutableStateOf(false) }
        val numList = remember { MutableList(2) { mutableStateOf("") } }
        val isClickedList = remember { MutableList(2) { mutableStateOf(false) } }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                modifier = Modifier
                    .width(88.dp),
                onClick = { goToHomeScreen() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = "Back".uppercase(),
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }

            Box(
                modifier = Modifier
                    .height(48.dp)
                    .width(120.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.LightGray)
                    .border(2.dp, Color.Red, RoundedCornerShape(12.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "xx : xx",
//                    fontFamily = FontFamily.Cursive,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }

            Button(
                modifier = Modifier
                    .width(88.dp),
                onClick = { goToFakeSplashScreen() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = "Pause".uppercase(),
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth()
                .background(Color(0xFFFF6D85))
            ,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp),
                onClick = {
                    for (i in 0..1)
                        if (isClickedList[i].value)
                            numList[i].value = "1"
                          },
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
                onClick = {
                    for (i in 0..1)
                        if (isClickedList[i].value)
                            numList[i].value = "2"
                },
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
                onClick = {
                    for (i in 0..1)
                        if (isClickedList[i].value)
                            numList[i].value = "3"
                },
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

        Row(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth()
                .background(Color.Magenta)
            ,
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .width(60.dp)
                    .background(Color.Cyan)
                    .border(
                        width = if (isClickedList[0].value) 2.dp else 0.dp,
                        color = if (isClickedList[0].value) Color.Red else Color.Transparent
                    )
                    .clickable {
//                        isClickedList[0].value = !isClickedList[0].value
                        if (isClickedList[0].value) {
                            isClickedList[0].value = !isClickedList[0].value

                        } else {
                            for (i in 0..1) {
                                isClickedList[i].value = false
                            }
                            isClickedList[0].value = true
                        }
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "${numList[0].value}",
                )
            }

            Box(
                modifier = Modifier
                    .height(60.dp)
                    .width(60.dp)
                    .background(Color.Cyan)
                    .border(
                        width = if (isClickedList[1].value) 2.dp else 0.dp,
                        color = if (isClickedList[1].value) Color.Red else Color.Transparent
                    )
                    .clickable {
//                        isClickedList[1].value = !isClickedList[1].value
                        if (isClickedList[1].value) {
                            isClickedList[1].value = !isClickedList[1].value
                        } else {
                            for (i in 0..1) {
                                isClickedList[i].value = false
                            }
                            isClickedList[1].value = true
                        }
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "${numList[1].value}",
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .height(360.dp)
                .width(360.dp)
                .background(Color.LightGray)
        ) {
            Column() {
                Row() {
                    Box(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .background(Color(0xFFFCE3E9))
                    ) {}

                    Box(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .background(Color(0xFFFFD5DE))
                    ) {}

                    Box(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .background(Color(0xFFFCE3E9))
                    ) {}
                }

                Row() {
                    Box(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .background(Color(0xFFFFD5DE))
                    ) {}

                    Box(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .background(Color(0xFFFCE3E9))
                    ) {}

                    Box(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .background(Color(0xFFFFD5DE))
                    ) {}
                }

                Row() {
                    Box(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .background(Color(0xFFFCE3E9))
                    ) {}

                    Box(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .background(Color(0xFFFFD5DE))
                    ) {}

                    Box(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .background(Color(0xFFFCE3E9))
                    ) {}
                }
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth()
                .background(Color(0xFFFF6D85))
            ,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .width(32.dp)
                    .height(60.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = "1",
//                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 4.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier
                        .width(32.dp)
                        .padding(all = 0.dp)
                )
            }

            Button(
                modifier = Modifier
                    .width(32.dp)
                    .height(60.dp),
                onClick = {},
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
                    .width(32.dp)
                    .height(60.dp),
                onClick = {},
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

            Button(
                modifier = Modifier
                    .width(32.dp)
                    .height(60.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = "4".uppercase(),
                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }

            Button(
                modifier = Modifier
                    .width(32.dp)
                    .height(60.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = "5".uppercase(),
                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }

            Button(
                modifier = Modifier
                    .width(32.dp)
                    .height(60.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = "6".uppercase(),
                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }

            Button(
                modifier = Modifier
                    .width(32.dp)
                    .height(60.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = "7".uppercase(),
                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }

            Button(
                modifier = Modifier
                    .width(32.dp)
                    .height(60.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = "8".uppercase(),
                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }

            Button(
                modifier = Modifier
                    .width(32.dp)
                    .height(60.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text(
                    text = "9".uppercase(),
                    fontFamily = FontFamily(Font(R.font.algerianregular)),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
            }
        }

        Spacer(modifier = Modifier.height(40.dp))
        Row(
            modifier = Modifier
                .height(80.dp)
                .fillMaxWidth()
                .background(Color.Green),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .height(80.dp)
                    .width(60.dp)
                    .background(Color.DarkGray),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    Icons.Default.Refresh,
                    contentDescription = "undo"
                )

                Text(
                    text = "undo"
                )
            }

            Column(
                modifier = Modifier
                    .height(160.dp)
                    .width(60.dp)
                    .background(Color.DarkGray),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    Icons.Default.Clear,
                    contentDescription = "erase"
                )

                Text(
                    text = "erase"
                )
            }

            Column(
                modifier = Modifier
                    .height(160.dp)
                    .width(60.dp)
                    .background(Color.DarkGray),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    Icons.Default.Edit,
                    contentDescription = "note"
                )

                Text(
                    text = "note"
                )
            }

            Column(
                modifier = Modifier
                    .height(160.dp)
                    .width(60.dp)
                    .background(Color.DarkGray),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    Icons.Default.Notifications,
                    contentDescription = "help"
                )

                Text(
                    text = "help"
                )
            }
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
fun HomeScreen(goToGameScreen: () -> Unit, goToSplashScreen: () -> Unit) {
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
                onClick = { goToSplashScreen() },
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
            
//            AlertDialog(onDismissRequest = { /*TODO*/ }, confirmButton = { /*TODO*/ })
//            Popup(
//                alignment = Alignment.Center,
//                onDismissRequest = {}) {
//                Text("hehe")
//            }
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
        NavHost(navController = navController, startDestination = "splash") {
            // route: home
            composable("home") {
                HomeScreen(
                    goToGameScreen = { navController.navigate("game")},
                    goToSplashScreen = { navController.navigate("splash")}
                    )
            }

            // route: splash
            composable("splash") {
                SplashScreen( moveToHomeScreen = { navController.navigate("home")})
            }

            // route: game
            composable("game") {
                GameScreen(
                    goToHomeScreen = { navController.navigate("home")},
                    goToFakeSplashScreen = { navController.navigate("fakeSplash")}
                    )
            }

            composable("fakeSplash") {
                FakeSplashScreen()
            }
        }
//        SudokuApp()
    }
}