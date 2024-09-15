package section1

fun main() {
    val result = bmiMetric(60.0, 1.70)
    println(result)
}

fun bmiMetric(weight: Double, height: Double): String {
    val bmi = weight / (height * height)
    return if (bmi < 18.5) "Abaixo do peso"
    else if (bmi < 25) "Peso Normal"
    else "Sobrepeso"
}