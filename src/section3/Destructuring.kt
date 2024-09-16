package section3

fun compute(input: Int): Pair<Int, String> {
    return if (input > 5)
        Pair(input * 2, "High")
    else
        Pair(input * 2, "Low")
}

// Data classes podem ser desestruturadas, e é útil fornecer
// um tipo de retorno com base em uma classe bem nomeada,
// para facilitar a legibilidade do código e entender a sua intenção.
data class Computation(
    val date: Int,
    val info: String,
)

fun evaluate(input: Int): Computation {
    return if (input > 5)
        Computation(input * 2, "High")
    else
        Computation(input * 2, "Low")
}

fun main() {
    // Podemos criar variáveis a partir das propriedades de um objeto,
    // usando a notação de destructuring. As propriedades são recebidas
    // pela ordem, e não pelo nome. É possível pular as propriedades
    // usando um "_" ou apenas omitindo, caso seja a última.
    val (a, b) = compute(5)

    println(a)
    println(b)

    val (_, d) = evaluate(10)

    println(d)

    // Podemos desestruturar um map, pegando a sua chave e valor
    val map = mapOf(1 to "One", 2 to "Two")
    for ((key, value) in map) {
        println("$key:$value")
    }

    // Podemos desestruturar pairs numa list.
    val listOfPairs = listOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))
    for ((first, second) in listOfPairs) {
        println("$first:$second")
    }

    // Podemos desestruturar uma list, pegando tanto o seu valor quanto o seu index.
    val list = listOf(1, 2 , 3)
    for ((index, value) in list.withIndex()) {
        println("[$index]=$value")
    }
}