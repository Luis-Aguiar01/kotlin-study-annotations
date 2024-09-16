package section4

fun main() {
    val list = listOf(1, 2, 3, 4)
    // Há várias maneiras diferentes de criar uma implementação para uma função lamba.
    val method1 = list.map() { n: Int -> "[$n]" } // Fornece todas as informações.
    val method2 = list.map { n: Int -> "[$n]" } // Omite os parenteses na chamada da função.
    val method3 = list.map { n -> "[$n]" } // Omite a tipagem e os parênteses (o Kotlin consegue inferir o tipo)
    val method4 = list.map { "[$it]" } // Caso haja apenas um parâmetro, o Kotlin gera ela para nós.

    // Caso o argumento da lambda seja o último ou o único, ela pode ser chamada fora dos parenteses.
    // Caso haja mais argumentos, a lambda deve ser colocada dentro dos parenteses do método.
    val method5 = list.joinToString(separator=" ") { "[$it]" }
    val method6 = list.joinToString(separator=" ", transform={ "[$it]" })

    // Lambda com mais de um argumento
    val method7 = list.mapIndexed { index, value -> "[ $index:$value ]" }

    // Podemos usar o "_" para ignorar um argumento.
    val method8 = list.mapIndexed { _, value -> "[ $value ]" }
}