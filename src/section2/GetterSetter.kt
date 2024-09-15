package section2

class GetterSetter {
    var i = 0
        get() {
            println("Getter")
            return field
        }
        private set(value) { // Permite apenas a alteração do valor do atributo dentro da classe
            println("Setter")
            field = value
        }

    var j = 0
        get() {
            println("Getter 2")
            return field
        }
        set(value) {
            println("Setter 2")
            field = value
        }
}

fun main() {
    val test = GetterSetter()
    // test.i = 10 -- Erro: Só é possível mudar o valor dentro da classe
    println(test.i)

    test.j = 20
    println(test.j)
}