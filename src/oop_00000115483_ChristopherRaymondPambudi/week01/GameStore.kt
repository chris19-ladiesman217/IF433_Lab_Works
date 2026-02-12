package oop_00000115483_ChristopherRaymondPambudi.week01

class GameStore

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 600000


    val discountAmount = calculateDiscount(price)
    val finalPrice = price - discountAmount

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, finalPrice: Int) {
    println("=== NOTA PEMBAYARAN STEAMKW ===")
    println("Game        : $title")
    println("Total Bayar : Rp $finalPrice")
    println("================================")
}