package oop_00000115483_ChristopherRaymondPambudi.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak ID dan Name dengan requireNotNull
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                // Gunakan as? Int dengan fallback 12
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                // Gunakan as? String dengan fallback "All Size"
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        // Gunakan !! untuk hasil dari Java Service
        val transactionId = JavaPaymentService.processPayment(id)!!
        println("Transaction Successful: $transactionId")
    }
}