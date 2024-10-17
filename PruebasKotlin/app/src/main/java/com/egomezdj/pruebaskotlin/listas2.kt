package com.egomezdj.pruebaskotlin

fun main() {
    val fruits = listOf("manzana", "naranja", "plátano", "kiwi", "melon", "naranja")

    println("Número de ocurrencias: ${countOccurrences(fruits)}")
    println("Lista sin elementos repetidos: ${removeDuplicates(fruits)}")
    println("Lista sin repetidos y ordenada: ${removeDuplicatesAndSort(fruits)}")
}

fun countOccurrences(list: List<String>): Map<String, Int> {
    return list.groupingBy { it }.eachCount()
}

fun removeDuplicates(list: List<String>): List<String> {
    return list.distinct()
}

fun removeDuplicatesAndSort(list: List<String>): List<String> {
    return list.distinct().sorted()
}
