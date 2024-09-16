package section4

data class Message(
    val sender: String,
    val text: String,
    val isRead: Boolean,
    val attachments: List<Attachment>,
)

data class Attachment(
    val type: String,
    val name: String,
)

data class Student(
    val id: Int,
    val name: String,
)

// Cria uma função que funciona como predicado.
// Contém toda a lógica para definir o que seria uma mensagem importante
fun Message.isImportant(): Boolean =
    text.contains("Salary increase") ||
    attachments.any {
        it.type == "image" &&
        it.name.contains("cat")
    }

fun ignore(message: Message): Boolean =
    !message.isImportant() || message.sender in setOf("Boss", "Mom")

fun main() {
    val messages = listOf(
        Message("Kitty", "Hey!", true, listOf(Attachment("image", "cute cats"))),
        Message("Kitty", "Where are you?", false, listOf(Attachment("text", "salary"))),
        Message("Boss", "Meeting today", false, listOf(Attachment("text", "salary")))
    )

    // Retorna as mensagens não lidas, filtrando por atributo da classe
    val unread = messages.filterNot(Message::isRead)
    println(unread)

    // As referências de membros também podem ser usadas para filtrar, sem que seja necessário
    // passar um lambda para isso.
    val messagesFiltered = messages.sortedWith(
        compareBy(Message::sender, Message::isRead)
    )

    println(messagesFiltered)

    val importanteMessages = messages.filter(Message::isImportant)
    println(importanteMessages)

    // No caso de funções que não estão numa classe, a sua referência é passada dessa forma:
    val ignoreMessages = messages.filter(::ignore)
    println(ignoreMessages)

    // Usando o construtor como referência
    val names = listOf("Alice", "Bob")
    val students = names.mapIndexed(::Student)
    println(students)
}