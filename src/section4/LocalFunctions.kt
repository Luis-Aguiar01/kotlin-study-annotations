package section4

class Session(
    val title: String,
    val speaker: String,
)

val sessions = listOf(Session("Kotlin Coroutines", "Roman Elizarov"))
val favoriteSpeakers = setOf("Roman Elizarov")

fun main() {
    val logMsg = StringBuilder()

    // É possível criar funções dentro de outra função. Isso limita
    // o seu escopo para ser usado apenas dentro da função. Além disso,
    // as funções podem consumir as variáveis do escopo da função externa.
    fun log(message: String) =
        logMsg.appendLine(message)

    log("Starting computation")
    val x = 42
    log("Computation result: $x")

    println(logMsg)

    // Funções de extensão também podem ser criadas dentro de outra função,
    // e, também, só podem ser utilizadas dentro da função em que foi criada.
    fun String.exclaim() = "$this!"

    println("Hello".exclaim())
    println("Bonjour".exclaim())

    fun interesting(session: Session): Boolean {
        return session.title.contains("Kotlin") &&
                session.speaker in favoriteSpeakers
    }

    println(sessions.any(::interesting))

    // Função anônima: É definida da mesma forma que as funções convencionais, no entanto,
    // elas não possuem um nome.
    val result = sessions.any(
        fun (session: Session): Boolean {
            return session.title.contains("Kotlin") &&
                   session.speaker in favoriteSpeakers
        })
}