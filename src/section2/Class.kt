package section2

import testing.eq

fun main() {
    val grid = Grid()
    grid.play('X', 0, 0) eq "Jogada bem-sucedida."
    grid.play('O', 0, 0) eq "Jogada inválida."
    grid.play('X', 1, 1) eq "Jogada bem-sucedida."
    grid.play('X', 1, 1) eq "Jogada inválida."
}

class Cell {
    private var entry = ' '

    fun setValue(c: Char): String {
        return if (entry == ' ' && (c == 'X' || c == 'O')) {
            entry = c
            "Jogada bem-sucedida."
        } else {
            "Jogada inválida."
        }
    }
}

class Grid {
    private val cells = listOf(
        listOf(Cell(), Cell(), Cell()),
        listOf(Cell(), Cell(), Cell()),
        listOf(Cell(), Cell(), Cell())
    )

    fun play(c: Char, i: Int, j: Int): String {
        return if (i in 0..2 && j in 0..2)
            cells[i][j].setValue(c)
        else
            "Jogada inválida"
    }
}

