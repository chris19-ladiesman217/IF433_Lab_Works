package oop_00000115483_ChristopherRaymondPambudi.week09

fun main() {
    // CHECKPOINT 11: Daftar riwayat transaksi awal
    val history = listOf(
        TradeTransaction("BTC/USDT", 0.015, 65000.0, "BUY", "CLOSED"),
        TradeTransaction("ETH/USDT", 0.5, 3500.0, "BUY", "CLOSED"),
        TradeTransaction("SOL/USDT", 10.0, 140.0, "SELL", "OPEN"),
        TradeTransaction("BTC/USDT", 0.015, 68000.0, "SELL", "CLOSED"),
        TradeTransaction("ETH/USDT", 0.5, 3200.0, "SELL", "CLOSED"),
        TradeTransaction("BNB/USDT", 2.0, 500.0, "BUY", "CLOSED")
    )
    val mutableHistory = history.toMutableList()
    mutableHistory.add(TradeTransaction("ADA/USDT", 100.0, 0.5, "BUY", "OPEN"))

    val closedTrades = history.filter { it.status == "CLOSED" }

    val buyOrders = closedTrades.filter { it.type == "BUY" }
    val sellOrders = closedTrades.filter { it.type == "SELL" }

    val sellValues = sellOrders.map { it.amount * it.price }
}