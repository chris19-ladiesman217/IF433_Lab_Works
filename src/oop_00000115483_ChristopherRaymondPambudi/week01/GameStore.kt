package oop_00000115483_ChristopherRaymondPambudi.week01

class GameStore

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 600000

    val discountPercent = if (price > 500000) 0.2 else 0.1

    val totalDiscount = price * discountPercent
    val finalPrice = price - totalDiscount

    println("=== NOTA PEMBAYARAN STEAMKW ===")
    println("Judul Game  : $gameTitle")
    println("Harga Asli  : Rp $price")
    println("Diskon      : ${discountPercent * 100}%")
    println("Harga Akhir : Rp ${finalPrice.toInt()}")
    println("================================")
}