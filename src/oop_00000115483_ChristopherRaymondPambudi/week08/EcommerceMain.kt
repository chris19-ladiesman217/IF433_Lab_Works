package oop_00000115483_ChristopherRaymondPambudi.week08

class EcommerceMain
fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            // Gunakan try-catch untuk menangkap IllegalArgumentException dari requireNotNull
            parser.parseProduct(raw)?.let { product ->
                parser.checkout(product)
            }
        } catch (e: IllegalArgumentException) {
            println("LOG ERROR: ${e.message}")
        }
    }
}