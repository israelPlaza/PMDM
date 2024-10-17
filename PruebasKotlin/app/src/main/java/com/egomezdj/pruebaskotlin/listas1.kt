package com.egomezdj.pruebaskotlin

fun main() {
    val numbers = listOf(1, 2, 5, 7, 8, 11)

    println("Suma de los elementos: ${sumOfElements(numbers)}")
    println("Números pares: ${evenNumbers(numbers)}")
    println("Máximo de la lista: ${maxOfList(numbers)}")
    println("Lista con el doble de los elementos: ${doubleOfElements(numbers)}")
}

fun sumOfElements(list: List<Int>): Int {
    return list.sum()
}

fun evenNumbers(list: List<Int>): List<Int> {
    return list.filter { it % 2 == 0 }
}

fun maxOfList(list: List<Int>): Int {
    return list.maxOrNull() ?: throw NoSuchElementException("La lista está vacía")
}

fun doubleOfElements(list: List<Int>): List<Int> {
    return list.map { it * 2 }
}