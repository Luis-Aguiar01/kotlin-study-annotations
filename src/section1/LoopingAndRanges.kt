package section1

fun main() {
    // Range inclusivo
    printRange(1..10)

    // Range exclusivo
    printRange(1 until 10)
    printRange(1..<10)

    // Progressão inversa
    printRange(10 downTo 1)

    // Progressão definindo o valor de iteração
    printRange(1..10 step 2)
    printRange(10 downTo 1 step 2)

    // Progressão de caracteres
    printRange('a'..'z')
    printRange('z' downTo 'a' step 2)
    printRange('a'..'z' step 3)

    printString("Hello")
}

fun printRange(values: IntProgression) {
    for (v in values) {
        print("$v ")
    }
    print("// $values")
    println()
}

fun printRange(values: CharProgression) {
    for (v in values) {
        print("$v ")
    }
    print("// $values")
    println()
}

fun printString(s: String) {
    for (i in 0..s.lastIndex) {
        print(s[i])
    }
}