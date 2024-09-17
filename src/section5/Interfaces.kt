package section5

import section5.SpiceLevel.*

// Uma interface define um contrato, no qual todas as classes
// que implementem essa interface, precisam fornecer implementações
// concretas para os métodos da interface.

interface Computer {
    fun prompt(): String
    fun calculateAnswer(): Int
}

// Cada uma das classes abaixo fornecem a sua implementação da
// interface Computer

class Desktop : Computer {
    override fun prompt(): String = "Hello!"
    override fun calculateAnswer(): Int = 11
}

class Quantum : Computer {
    override fun prompt(): String = "Probably..."
    override fun calculateAnswer(): Int = -1
}

interface Hotness {
    fun feedback(): String
}

// Uma enum pode implementar uma interface, dessa forma
// cada uma das suas constantes precisam fornecer uma implementação
// para o método definido.

enum class SpiceLevel : Hotness {
    Mild {
        override fun feedback() = "It adds flavor!"
    },
    Medium {
        override fun feedback() = "Is it warm in here?"
    },
    High {
        override fun feedback() = "I'm suddenly sweating a lot."
    }
}

// Para criarmos interfaces funcionais, ou seja, interfaces que possuem apenas
// um único método abstrato, devemos inicial a declaração da interface com "fun".

fun interface ZeroArg {
    fun f(): Int
}

fun interface OneArg {
    fun g(n: Int): Int
}

fun interface TwoArg {
    fun h(i: Int, j: Int): Int
}

// Podemos implementar a interface de várias formas,
// usando a implementação padrão de uma interface numa classe,
// ou fornecendo um lambda

class VerboseZero : ZeroArg {
    override fun f() = 10
}

val verboseZero = VerboseZero() // Cria um objeto da classe que implementa o método
val samZero = ZeroArg { 10 } // Fornece uma implementação usando um lambda

class VerboseOne : OneArg {
    override fun g(n: Int): Int = n * 2
}

val verboseOne = VerboseOne() // Cria um objeto da classe que implementa o método
val samOne = OneArg { a -> a * 2 } // Fornece uma implementação usando um lambda

class VerboseTwo : TwoArg {
    override fun h(i: Int, j: Int): Int = i + j
}

val verboseTwo = VerboseTwo() // Cria um objeto da classe que implementa o método
val samTwo = TwoArg { i, j -> i + j } // Fornece uma implementação usando um lambda

fun main() {
    // Classes que implementam uma interface, podem ser referenciadas
    // pelo tipo da mesma.
    val computers = listOf(Desktop(), Quantum())

    for (computer in computers) {
        println(computer.prompt())
        println(computer.calculateAnswer())
    }

    val spiceLevel = listOf(Mild, Medium, High)

    for (level in spiceLevel) {
        println(level.feedback())
    }

    println(verboseZero.f())
    println(samZero.f())

    println(verboseOne.g(2))
    println(samOne.g(2))

    println(verboseTwo.h(1, 2))
    println(samTwo.h(1, 2))
}