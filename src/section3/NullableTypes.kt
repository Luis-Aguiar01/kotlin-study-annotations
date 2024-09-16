package section3

fun main() {
    // Para definirmos valores que podem ser nulos,
    // devemos acrescentar um "?" depois do tipo.
    // Não podemos atribuir "null" a um tipo não
    // anulável.
    var name: String = "Luis"
    var name2: String? = null

    // name = null Erro de compilação - Não é possível atribuir nulo ao tipo String
    name2 = "Luis"

    name2 = null
    // var teste1: String = name2 Erro: Não é possível associar um valor nulo
    var teste2: String? = name

    println(teste2)
}