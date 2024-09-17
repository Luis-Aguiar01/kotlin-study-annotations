package section4

data class PersonWithAge(
    val name: String,
    val age: Int,
)

val names = listOf("Alice", "Arthricia", "Bob", "Bill", "Birdperson", "Charlie", "Crocubot", "Franz", "Revolio")
val ages = listOf(21, 15, 25, 25, 42, 21, 42, 21, 33)

fun people(): List<PersonWithAge> =
    names.zip(ages) { name, age ->
        PersonWithAge(name, age)
    }

fun main() {
    val map: Map<Int, List<PersonWithAge>> = people().groupBy(PersonWithAge::age)
    println(map)

    // Essas duas operações fazem o mesmo, no entanto, invertem a ordem.
    // A primeira, usa a idade como valor e a segunda como chave.
    println(people().associateWith(PersonWithAge::age))
    println(people().associateBy((PersonWithAge::age)))

    val mapNums = mapOf(1 to "One", 2 to "Two")
    val mutableMap = mapNums.toMutableMap()

    // Pega o valor em uma chave, e, caso ela não exista, retorna um valor padrão.
    println(mapNums.getOrElse(0) { "Empty" })
    // Tenta pegar um valor de uma chave, caso ela não exista, é colocada com um valor.
    println(mutableMap.getOrPut(0) { "Zero" })

    val even = mapOf(2 to "Two", 4 to "Four")

    println(even.map { "${it.key}=${it.value}" })

    println(even.map { (key, value) -> "$key=$value" })

    println(people().groupBy(PersonWithAge::age).any { (key, _) -> key > 20 })
    println(people().groupBy(PersonWithAge::age).all { (key, _) -> key < 20 })
}