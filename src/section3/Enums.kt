package section3

// É possível realizar o import de todas as constantes, mesmo antes da
// criação da enum.
import section3.Level.*
import section3.Test.*
import section3.Direction.*

enum class Level {
    Overflow, High, Medium, Low, Empty
}

enum class Test {
    Overflow
}

enum class Direction(val notation: String) {
    North("N"), South("S"),
    West("W"), East("E");

    val opposite: Direction
        get() = when (this) {
            North -> South
            South -> North
            West -> East
            East -> West
        }
}

fun main() {
    println(High) // Usa apenas o nome da constante
    println(Level.Overflow) // Usa o nome da enum + nome da constante
    // println(Overflow) Gera ambiguidade

    // Itera sobre cada uma das constantes
    for (value in Level.entries) {
        println(value)
    }

    println(North.notation)
    println(North.opposite)
}