package section5

import section5.Material.*

enum class Material {
    Ceramic, Plastic, Metal, Unknown
}

// O construtor padrão sempre é chamado pelo Kotlin, quando criamos um objeto.
// Ele pode ser parametrizado ou não. Caso não tenha nenhum parâmetro, os paren-
// teses podem ser omitidos.
class GardenItem(val name: String) {
    var material: Material = Unknown

    constructor(name: String, material: Material) : this(name) {
        this.material = material
    }

    constructor(material: Material) : this("Strange Object") {
        this.material = material
    }

    constructor() : this("Strange Object")

    override fun toString(): String = "Name: $name, Type: $material"
}

fun main() {
    println(GardenItem())
    println(GardenItem("Elfo"))
    println(GardenItem(Plastic))
    println(GardenItem("Elfo", Ceramic))
}