import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
//import androidx.compose.material.Text
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SudokuBoard(board: List<List<Int>>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .border(BorderStroke(1.dp, Color.Black))
    ) {
        itemsIndexed(board) { rowIndex, row ->
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                row.forEachIndexed { columnIndex, cellValue ->
                    SudokuCell(cellValue)
                    if (columnIndex < row.size - 1) {
                        Spacer(modifier = Modifier.width(1.dp))
                    }
                }
            }
            if (rowIndex < board.size - 1) {
                Spacer(modifier = Modifier.height(1.dp))
            }
        }
    }
}

@Composable
fun SudokuCell(value: Int) {
    Box(
        modifier = Modifier
            .aspectRatio(1f)
            .border(BorderStroke(1.dp, Color.Black))
    ) {
        Text(
            text = if (value != 0) value.toString() else "",
            modifier = Modifier.fillMaxSize(),
            color = Color.Black
        )
    }
}