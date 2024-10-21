fun main() {
    
    val products = mapOf(
        "manzana" to 1.20,
        "naranja" to 0.80,
        "plátano" to 1.00,
        "kiwi" to 1.50,
        "melon" to 2.50
    )

    
    println("Lista de productos y precios:")
    for ((product, price) in products) {
        println("$product: $price")
    }

    
    println("Ingresa el nombre de un producto:")
    val productName = readLine()

    // Verificar si el producto existe en el mapa y mostrar su precio
    if (productName != null && products.containsKey(productName)) {
        println("El precio de $productName es ${products[productName]}")
    } else {
        println("El producto $productName no fue encontrado.")
    }
}
