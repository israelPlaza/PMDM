fun main() {
    
    val numbers = mutableSetOf(1, 2, 3, 4, 5)

    
    println("Conjunto inicial de números: $numbers")

 
    val newNumber = 6
    numbers.add(newNumber)
    println("Después de agregar $newNumber: $numbers")

    val duplicateNumber = 3
    numbers.add(duplicateNumber)
    println("Después de intentar agregar $duplicateNumber (duplicado): $numbers")
    
    /
    println("Todos los números del conjunto: $numbers")
}
