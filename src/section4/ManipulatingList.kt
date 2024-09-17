package section4

data class PersonWithId(
    val name: String,
    val id: Int,
)

fun main() {
    // Junta duas listas, imitando o comportamento de um zíper.
    // Quando uma das sequências é maior, o processo termina quando
    // uma das duas acaba.
    val left = listOf("a", "b", "c", "d")
    val right = listOf("q", "r", "s", "t")

    println(left.zip(right))

    val names = listOf("Bob", "Jill", "Jim")
    val ids = listOf(1731, 9274, 8378)

    val result = names.zip(ids) { name, id -> PersonWithId(name, id) }
    println(result)

    println(left.zipWithNext { a, b -> "$a$b" })

    // Flattening (Achatamento) - Serve para transformar uma lista que
    // contém outras listas em apenas uma lista simples.

    val list = listOf(
        listOf(1, 2),
        listOf(3, 4),
        listOf(5, 6),
        listOf(7, 8),
    )

    val listResult = list.flatten()
    println(listResult)

    val intRange = 1..3

    val pairsInterval = intRange.map { a ->
        intRange.map { b -> a to b }
    }.flatten()

    println(pairsInterval)

    val pairsInterval2 = intRange.flatMap { a ->
        intRange.map { b -> a to b }
    }

    println(pairsInterval2)
}