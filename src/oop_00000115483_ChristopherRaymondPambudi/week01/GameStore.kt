package oop_00000115483_ChristopherRaymondPambudi.week01

class GameStore

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 600000

    val discountPercent = if (price > 500000) 0.2 else 0.1

    val totalAmount = price * discountPercent
    val finalPrice = price - totalAmount

    println("=== NOTA PEMBAYARAN STEAMKW ===")
    println("Judul Game  : $gameTitle")
    println("Harga Asli  : Rp $price")
    println("Diskon      : ${discountPercent * 100}%")
    println("Harga Akhir : Rp ${finalPrice.toInt()}")
    println("================================")
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()