package section4

data class Product(
    val description: String,
    val price: Double,
)

fun main() {
    // Criado uma lista a partir de um lambda. O argumento é o índice dos elementos, que começa em 0.
    val list1 = List(10) { it }
    println("List1: $list1")

    // Lista de um único valor
    val list2 = List(10) { 1 }
    println("List2: $list2")

    val list3 = List(10) { 'a' + it }
    println("List3: $list3")

    // Também existe o mesmo método para mutable lists
    val list4 = MutableList(10) { it }
    println("List4: $list4")

    //OBS: Apesar desses métodos começarem com letras maiúsculas
    // eles não são construtores.

    // Exemplos para encontrar/filtrar coleções/contar

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val result1 = list.filter { it > 5 }
    println(result1)

    val result2 = list.count { it > 8 }
    println(result2)

    val result3 = list.find { it > 9 } // Procura um elemento maior do que 9
    println(result3)

    val result4 = list.firstOrNull { it > 10 } // Não há elementos maiores do que 10
    println(result4)

    val result5 = list.lastOrNull {  it > 0 } // Retorna o último elemento para o qual a condição é verdadeira
    println(result5)

    val result6 = list.any { it > 5 } // Retorna true caso algum elemento corresponda com a condição
    println(result6)

    val result7 = list.all { it > -1 } // Retorna true caso todos os elementos correspondam a condição
    println(result7)

    val result8 = list.none {  it > 20 } // Retorna true caso nenhum elemento corresponda a condição
    println(result8)

    val testList = listOf(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
    val isPositive = { n: Int -> n > 0 }
    val positiveList = testList.filter(isPositive) // Produz uma lista com todos os elementos positivos.
    val negativeList = testList.filterNot(isPositive) // Produz uma lista com todos os elementos negativos.
    val (posList, negList) = testList.partition(isPositive) // Produz tanto a lista para quais os elementos são verdadeiros como para os elementos que são falsos

    println(positiveList)
    println(negativeList)
    println(posList)
    println(negList)

    // Outros métodos

    val products = listOf(Product("Bread", 2.0), Product("Wine", 5.0))

    // Para objetos personalizados, precisamos fornecer por meio de qual atributo eles devem ser
    // somados ou ordenados, já que o Kotlin não sabe disso.
    println(products.sumOf { it.price })
    println(products.sortedBy { it.description })
    println(products.minByOrNull { it.price })
}