package oop_00000115483_ChristopherRaymondPambudi.week09

data class TradeTransaction(
    val pair: String,
    val amount: Double,
    val price: Double,
    val type: String,
    val status: String
)