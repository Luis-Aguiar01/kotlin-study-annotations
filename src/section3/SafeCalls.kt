package section3

import testing.eq

fun String.echo() {
    println(uppercase())
    println(this)
    println(lowercase())
}

fun checkLength(s: String?, expected: Int?) {
    // Verifica se o valor é nulo, antes de chamar length
    val length1 =
        if (s != null) s.length else null

    val length2 = s?.length // Faz a mesma verificação, porém, de uma forma mais concisa
    length1 eq expected
    length2 eq expected
}

fun checkLength2(s: String?, expected: Int?) {
    val length1 =
        if (s != null) s.length else 0

    val length2 = s?.length ?: 0
    length1 eq expected
    length2 eq expected
}

fun main() {
    val s1: String = "Luis"
    val s2: String? = null

    s1.echo()
    // É uma forma segura de lidar com valores que podem ser nulos.
    // Usando essa notação, a função apenas será chamada caso o valor
    // não seja nulo, evitando o lançamento de uma exceção.
    s2?.echo()

    checkLength("abc", 3)
    checkLength(null, null)

    val s3: String = "Luis"
    val s4: String? = null

    // O operador Elvis permite que seja fornecido um valor padrão
    // caso um valor nulo, seja fornecido.
    println(s3 ?: "nulo")
    println(s4 ?: "nulo")

    checkLength2("abc", 3)
    checkLength2(null, 0)
}