package com.egomezdj.pruebaskotlin

fun main() {
    // Llamadas a printFinalTemperature para realizar las conversiones

    // Celsius a Fahrenheit
    printFinalTemperature(
        initialMeasurement = 27.0,
        initialUnit = "Celsius",
        finalUnit = "Fahrenheit",
        conversionFormula = { celsius -> celsiusToFahrenheit(celsius) }
    )

    // Kelvin a Celsius
    printFinalTemperature(
        initialMeasurement = 350.0,
        initialUnit = "Kelvin",
        finalUnit = "Celsius",
        conversionFormula = { kelvin -> kelvinToCelsius(kelvin) }
    )

    // Fahrenheit a Kelvin
    printFinalTemperature(
        initialMeasurement = 10.0,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin",
        conversionFormula = { fahrenheit -> fahrenheitToKelvin(fahrenheit) }
    )
}

// Función para Celsius a Fahrenheit
fun celsiusToFahrenheit(celsius: Double): Double {
    return (9.0 / 5.0) * celsius + 32
}

// Función para Kelvin a Celsius
fun kelvinToCelsius(kelvin: Double): Double {
    return kelvin - 273.15
}

// Función para Fahrenheit a Kelvin
fun fahrenheitToKelvin(fahrenheit: Double): Double {
    return (5.0 / 9.0) * (fahrenheit - 32) + 273.15
}

// Función para imprimir la temperatura convertida
fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // Formato con 2 decimales
    println("$initialMeasurement grados $initialUnit son $finalMeasurement grados $finalUnit.")
}
