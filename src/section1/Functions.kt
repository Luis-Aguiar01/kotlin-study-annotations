package section1

fun main() {
    val result = multiplyByTwo(10)
    println(result)

    val result2 = multiplyByThree(5)
    println(result2)

    sayHi()
    sayHello()
    sayGoodBye()
}

fun multiplyByTwo(p: Int): Int {
    return p * 2
}

// Quando a função possui apenas uma linha, ela pode ser
// escrita dessa forma simplificada. Além disso, o Kotlin
// infere o tipo de retorno de uma função do tipo de expressão.
fun multiplyByThree(p: Int) = p * 3

fun sayHi() = println("Hi!")

fun sayHello() {
    println("Hello.")
}

// Tipo que representa void - Não é necessário
// o Kotlin infere automaticamente se não for especificado.
fun sayGoodBye(): Unit {
    println("Good bye.")
}