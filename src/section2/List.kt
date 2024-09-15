package section2

fun main() {
    val namesMutable = mutableListOf("Luis", "Henrique", "Aguiar") // Cria uma lista mutável
    val namesUnmodified: List<String> = namesMutable // Atribui a referência da lista mutável a uma imutável

    namesMutable.add("Santos")
    namesMutable += "João"

    for (v in namesMutable) {
        println("$v ")
    }

    val firstTwoNames = namesMutable.take(2)

    println(firstTwoNames)

    val lastTwoNames = namesMutable.takeLast(2)

    println(lastTwoNames)
}