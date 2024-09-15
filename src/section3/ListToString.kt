package section3

fun main() {
    val numbers = listOf(1, 2, 3)

    println(numbers.toString())
    println(numbers.joinToString(separator=".", postfix="]", prefix="{"))
}