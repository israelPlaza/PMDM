package com.egomezdj.pruebaskotlin

fun calcularIMC(peso: Double, altura: Double): Double {
    val imc = peso / (altura * altura)
    println("El IMC calculado es: %.2f".format(imc))
    return imc
}

fun main() {

    print("Introduce tu peso en kg: ")
    val peso = readLine()?.toDoubleOrNull() ?: 0.0 //


    print("Introduce tu altura en metros: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0 //

    // verifica si es correcto
    if (peso > 0 && altura > 0) {
        calcularIMC(peso, altura)
    } else {
        println("Por favor, introduce valores válidos para el peso y la altura.")
    }
}
