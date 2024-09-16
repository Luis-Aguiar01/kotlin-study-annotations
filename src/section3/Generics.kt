package section3

data class Automobile(val brand: String)

data class GenericHolder<T>(
    private val brand: T
) {
    fun getValue(): T = brand
}

// Define uma função que trabalha com um tipo genérico
fun <T> identity(arg: T): T = arg

// Define duas funções de extensão
// as quais trabalham com tipos genéricos

fun <T> List<T>.first(): T {
    if (isEmpty())
        throw NoSuchElementException()
    return this[0]
}

fun <T> List<T>.firstOrNull(): T? =
    if (isEmpty()) null else this[0]


fun main() {
    // Qualquer tipo pode ser passado para a classe.
    // O valor recuperado possui o tipo certo.
    val h1 = GenericHolder(Automobile("Ford"))
    println(h1.getValue())

    val h2 = GenericHolder(1)
    println(h2.getValue())

    val result = identity(10)
    println(result)

    val result2 = identity("Hello!")
    println(result2)
}
