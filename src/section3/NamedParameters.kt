package section3

import testing.eq

// É possível definir valores padrão para cada um dos parâmetros
// de uma função.
fun colors(
    red: Int = 0,
    green: Int = 0,
    blue: Int = 0,
) = ("Red: $red, Green: $green, Blue: $blue")

// Parâmetros nomeados servem para esclarecer o código, para que
// quem esteja lendo não precise consultar a documentação para
// saber o que é cada parâmetro.
fun main() {
    var result = colors(red=10, green=20, blue=200)
    println(result)

    result = colors(10, blue=20, green=10)
    println(result)

    result = colors(255, 255, 255)
    println(result)

    result = colors()
    println(result)

    Color(red=100).toString() eq "Red: 100, Green: 0, Blue: 0"
}

class Color(
    private val red: Int = 0,
    private val green: Int = 0,
    private val blue: Int = 0,
) {
    override fun toString(): String = "Red: $red, Green: $green, Blue: $blue"
}