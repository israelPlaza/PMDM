package com.egomezdj.pruebaskotlin

fun calcularPrecioFinal(nombreProducto: String, precio: Double, iva: Double): Double {
    val precioConIva = precio + (precio * (iva / 100))
    println("El precio final de $nombreProducto con IVA es: $precioConIva €")
    return precioConIva
}

fun main() {
    // Productos
    calcularPrecioFinal("Pan", 0.6, 0.0)
    calcularPrecioFinal("Leche", 1.0, 10.0)
    calcularPrecioFinal("Gasoil", 1.4, 15.0)
}
