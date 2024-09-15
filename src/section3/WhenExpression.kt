package section3

class Coordinates {
    var x: Int = 0
        set (value) {
            field = value
            println("x value: $x")
        }
    var y: Int = 0
        set (value) {
            field = value
            println("y value: $y")
        }

    override fun toString() = "(x: $x, y: $y)"
}

fun processInputs(inputs: List<String>) {
    val coordinates = Coordinates()
    for (input in inputs) {
        when (input) {
            "up", "u" -> coordinates.y++
            "down", "d" -> coordinates.y--
            "left", "l" -> coordinates.x--
            "right", "r" -> coordinates.x++
            "nowhere" -> {}
            "exit" -> return
            else -> println("Invalid input.")
        }
    }
}

fun mixColors(first: String, second: String) =
    when (setOf(first, second)) {
        setOf("red", "blue") -> "purple"
        setOf("red", "yellow") -> "orange"
        setOf("blue", "yellow") -> "green"
        else -> "unknown"
    }

fun main() {
    val inputs = listOf("up", "u", "down", "left", "right", "r", "exit")
    processInputs(inputs)

    var result = mixColors("red", "blue")
    println(result)

    result = mixColors("black", "white")
    println(result)
}