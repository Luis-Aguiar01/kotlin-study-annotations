package section5

// Para definir uma classe como herdável, ela deve ser declarada
// como open. Todas as classes em Kotlin, por padrão, são finais, ou seja,
// não podem ser estendidas.
open class GreatApe {
    protected var energy = 0 // Para que as subclasses tenham acesso

    // Os métodos também devem ser declarados como open,
    // caso eles possam ser modificados pelas subclasses.
    open fun call() = "Hoo!"

    open fun eat() {
        energy += 10
    }

    fun climb(x: Int) {
        energy -= x
    }

    fun energyLevel() = "Energy: $energy"
}

class Bonobo : GreatApe() {
    override fun call() = "Eep!"

    override fun eat() {
        energy += 10
        super.eat()
    }

    fun run() = "Bonobo run"
}

class Chimpanzee : GreatApe() {
    val additionalEnergy = 20

    override fun call() = "Yawp!"

    override fun eat() {
        energy += additionalEnergy
        super.eat()
    }

    fun jump() = "Chimp jump"
}

fun talk(ape: GreatApe): String {
    ape.eat()
    ape.climb(10)
    return "${ape.call()} ${ape.energyLevel()}"
}

fun main() {
    println(talk(GreatApe()))
    println(talk(Bonobo()))
    println(talk(Chimpanzee()))
}