package section2

import testing.eq

// É possível definir os valores recebidos no construtor,
// e, então, passá-los para os atributos da classe.
class Badger(id: String, years: Int) {
    private val name = id
    private val age = years

    override fun toString(): String {
        return "Badger: $name, age: $age"
    }
}

// Define os atributos no construtor, dessa forma, não é necessário
// criar os atributos dentro da classe. Os atributos são modificáveis.
class Snake(
    private var type: String,
    private var length: Double
) {
    override fun toString(): String {
        return "Snake: $type, length: $length"
    }
}

// Define os atributos no construtor, dessa forma, não é necessário
// criar os atributos dentro da classe. Os atributos são constantes.
class Moose(
    private val age: Int,
    private val height: Double
) {
    override fun toString(): String {
        return "Moose, age: $age, height: $height"
    }
}

// Não é necessário chamar new para criar um novo objeto.
fun main() {
    Badger("Bob", 11) eq "Badger: Bob, age: 11"
    Snake("Garden", 2.4) eq "Snake: Garden, length: 2.4"
    Moose(16, 7.2) eq "Moose, age: 16, height: 7.2"
}