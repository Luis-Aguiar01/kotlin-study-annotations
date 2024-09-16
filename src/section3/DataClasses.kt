package section3

// As classes de dados servem quando precisamos de uma classe
// que apenas armazene dados. Essas classes especiais fornecem
// um conjunto de operações úteis que facilitam a manipulação
// dessas classes.

class Person(name: String)

data class Contact(
    val name: String,
    val number: String,
)

fun main() {
    val person = Person("Luis")
    val contact = Contact("Luis", "1111111")

    // As data classes já possuem uma implementação do toString()
    // que exibe todos os atributos da classe.
    println(person)
    println(contact)

    // As data classes já possuem uma implementação do equals e hashCode,
    // dessa forma, dois objetos com os mesmo atributos são considerados
    // iguais.
    val person2 = Person("Luis")
    val contact2 = Contact("Luis", "1111111")

    println("Person is equal person2: " + (person == person2))
    println("Contact is equal contact2: " + (contact == contact2))

    // As data classes também fornecem o método copy, que nos permite
    // copiar um objeto, e alterar apenas os dados que queremos, como
    // no exemplo abaixo, que copia o numero, mas modifica o nome.
    val newContact = contact.copy(name="Henrique")
    println(newContact)
}