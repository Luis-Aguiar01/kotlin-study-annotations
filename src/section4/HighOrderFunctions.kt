package section4

// Lambdas podem ser armazenadas em variáveis.
// Essa é a forma padrão para a criação de um lambda.
val isPlus: (Int) -> Boolean = { it > 0 }

// Implementação da função any
fun <T> List<T>.any(
    predicate: (T) -> Boolean
): Boolean {
   for (v in this) {
       if (predicate(v))
           return true
   }
    return false
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.any { it > 3 }
    println(result)

    println(isPlus(10))
}