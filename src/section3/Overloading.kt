package section3

class Calculator {
    fun add(n1: Int, n2: Int) = n1 + n2
}

// Nesse caso, a função nunca é chamada, pois já está
// definida dentro da classe, e o Kotlin dá preferência
// para as funções membros.
fun Calculator.add(n1: Int, n2:Int) = n1 + n2

// Essa variação é aceita, pois possui uma assinatura diferente
fun Calculator.add(vararg args: Int) = args.sum()

fun main() {
    var result = Calculator().add(1, 2)
    println(result)

    result = Calculator().add(1, 2, 3, 4, 5)
    println(result)

    // O Kotlin sempre busca a função que está mais próxima da especificação,
    // ou seja, nesse caso, ele dá preferencia para a função com a assinatura
    // vazia, e não para a função com parâmetro padrão.
    result = f()
    println(result)
}

fun f(n: Int = 99) = n
fun f() = 10