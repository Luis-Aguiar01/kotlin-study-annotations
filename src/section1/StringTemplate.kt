package section1

fun main() {
    val value = 10

    println("The value is: $value")
//    println("Teste: $teste") --> Erro: Não é possível encontrar o identificador.

    println("The value multiply by 30 is: ${value * 30}")
    println("The value is bigger than 20: ${ if (value > 20) "Yes" else "No" }")
}