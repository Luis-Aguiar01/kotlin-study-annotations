package section4

// Retorna uma função anônima, armazenada numa variável
fun first(): (Int) -> Int {
    val func = fun(i: Int) = i + 1
    return func
}

// Armazena um lambda numa variável e retorna.
fun second(): (String) -> String {
    val func = { s: String -> "$s!" }
    return func
}

// Retorna uma função convensional
fun third(): () -> String {
    fun greet() = "Hi!"
    return ::greet
}

// O endereço da função recebe outra função.
fun fourth() = fun() = "Hi!"

// Recebe um lambda
fun fifth() = { "Hi!" }

fun main() {
    val first = first()
    println(first(10))

    val second = second()
    println(second("Olá"))

    val third = third()
    println(third())

    val fourth = fourth()
    println(fourth())

    val fifth = fifth()
    println(fifth())
}