package section4

fun Int.isEven(): Boolean {
    println(this)
    return this % 2 == 0
}

fun Int.square(): Int {
    println(this)
    return this * this
}

fun Int.lessThanTen(): Boolean {
    println(this)
    return this < 10
}

fun main() {
    // A diferença de usar uma sequência e de criar um fluxo apenas encadeando operações
    // como filter, map e any, é que as sequências realizam operações preguiçosas, ou seja,
    // param de processar quando encontram um resultado. As sequências também possuem
    // operações terminais e intermediárias.
    val list = listOf(1, 2, 3, 4, 5)
    var result = list.filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThanTen)

    println(result)

    result = list.asSequence()
        .filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThanTen)

    println(result)

    // Existem formas de criar sequências infinitas, que são utilizadas
    // por meio do take() e em uma operação terminal, como sum() ou toList()
    val naturalNumbers = generateSequence(1) { it + 1 }
    val numbers = naturalNumbers
        .take(10)
        .toList()

    println(numbers)

    val sum = naturalNumbers
        .take(10)
        .sum()

    println(sum)

    val items = mutableListOf("first", "second", "third", "XXX", "4th")

    val seq = generateSequence {
        items.removeAt(0).takeIf { it != "XXX" }
    }

    println(seq.toList())
}