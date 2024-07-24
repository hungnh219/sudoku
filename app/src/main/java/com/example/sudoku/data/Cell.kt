package com.example.sudoku.data

data class Cell(
    val value: Int,
    val fixed: Boolean
)

class BoardGame{
    private val cells = Array(9) { Array(9) { Cell(0,true)} }
    init {
        for (x in 0..8) {
            for (y in 0..8){
                cells[x][y] = Cell(0, true)
            }
        }
    }

    fun getCell(row: Int, col: Int): Cell {
        return cells[row][col]
    }

    fun setCell(row: Int, col: Int, value: Int) {
        if (cells[row][col].fixed)
            cells[row][col] = Cell(value, false)
    }
}