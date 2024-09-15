package section3

// As funções de extensão servem para adicionar funcionalidades
// em classes já existentes, as quais não temos acesso ao
// código-fonte.

fun String.addSingleQuote() = "'$this'" // Irá retornar o próprio chamador da função
fun String.addDoubleQuote() = "\"$this\""

fun main() {
    val nameSingleQuote = "Luis".addSingleQuote()
    println(nameSingleQuote)

    val nameDoubleQuote = "Luis".addDoubleQuote()
    println(nameDoubleQuote)

    val book = Book("O Senhor dos Anéis")
    val result = book.categorize("Fantasia")
    val result2 = book.ageRequirement(15)

    println(result)
    println(result2)
}

class Book(val title: String)

fun Book.categorize(category: String) = """Título: $title, Category: $category"""
fun Book.ageRequirement(ageMin: Int) = """Title: ${title}, Age: $ageMin"""