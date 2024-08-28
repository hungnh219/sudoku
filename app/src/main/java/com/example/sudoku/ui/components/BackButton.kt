import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
//import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.sudoku.R

@Composable
fun BackButton(onClick: () -> Unit) {
    Image(
        painter = painterResource(id = R.drawable.home_background), // Replace with your back button icon
        contentDescription = "Back Button",
        modifier = Modifier
            .clickable { onClick() }
            .padding(8.dp)
    )
}