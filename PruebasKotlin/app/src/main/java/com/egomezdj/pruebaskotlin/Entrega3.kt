package com.egomezdj.pruebaskotlin

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Verificar si la edad está fuera del rango válido
    if (age < 0 || age > 100) {
        return -1
    }

    // Precio infantil (12 años o menos)
    if (age <= 12) {
        return 15
    }

    // Precio para adultos mayores (61 años o más)
    if (age >= 61) {
        return 20
    }

    // Precio estándar (13 a 60 años)
    return if (isMonday) {
        25 // Precio con descuento si es lunes
    } else {
        30 // Precio estándar cualquier otro día
    }
}
