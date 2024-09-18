package section5

// Quando estendemos uma classe, precisamos inicializar as propriedades da
// superclasse. Fazemos isso invocando o seu construtor. Caso o construtor
// seja vazio, apenas chamar o construtor vazio na declaração da herança já
// é o suficiente, no entanto, caso o construtor possua algum parâmetro, precisamos
// passar os valores quando estendermos a classe.
open class House(
    private val address: String,
    private val state: String,
    private val zip: String
) {
    // Construtor secundário que chama o primeiro.
    constructor(fullAddress: String) : this(
            fullAddress.substringBefore(", "),
            fullAddress.substringAfter(", ").substringBefore(" "),
            fullAddress.substringAfterLast(" ")
    )

    // Propriedade compartilhada entre as subclasses
    protected val fullAddress: String
        get() = "$address, $state $zip"
}

// Inicializa as propriedades da classe base invocando o seu construtor.
class VacationHouse(
    address: String,
    state: String,
    zip: String,
    private val startMonth: String,
    private val endMonth: String
) : House(address, state, zip) {

    override fun toString() = "Vacation house at $fullAddress" +
            "from $startMonth to $endMonth"
}

// Inicializa as propriedades da classe base invocando o seu construtor secundário.
class TreeHouse(
    val name: String
) : House("Tree Street, TR 00000") {
    override fun toString(): String =
        "$name tree house at $fullAddress"
}

fun main() {
    val vacationHouse = VacationHouse(
        address = "8 Target St.",
        state = "KS",
        zip = "66632",
        startMonth = "May",
        endMonth = "September"
    )

    println(vacationHouse)
}