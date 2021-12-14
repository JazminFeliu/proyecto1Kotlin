fun main(args: Array<String>) {
    //trabajo con variables mutables (VAR) e inmutables (VAL)
    val valor1: Int
    val valor2: Int
    valor1 = 100
    valor2 = 400
    var resultado: Int
    resultado = valor1 + valor2
    println("La suma de $valor1 + $valor2 es $resultado")
    resultado = valor1 * valor2
    println("El producto de $valor1 * $valor2 es $resultado ")

    // definir una variable inmutable con el valor 50 que representa el lado de un cuadrado,
    // en otras dos variables inmutables almacenar la superficie y el perimetro del cuadrado.

    val lado = 50
    val superficie = lado*lado
    val perimtro = lado*4

    println("La superficie de un cuadrado de lado $lado es $superficie y su perimetro $perimtro")

    // definir tres variables inmutables y cargar los pesos de tres personas con valores Float.
    // calcular el promedio de pesos y mostrarlo

    val peso1 = 50.8
    val peso2 = 75.4
    val peso3 = 62.5
    val promedioPesos = (peso1 + peso2 + peso3) / 3
    println("El promedio entre los pesos $peso1, $peso2 y $peso3 es $promedioPesos")
}