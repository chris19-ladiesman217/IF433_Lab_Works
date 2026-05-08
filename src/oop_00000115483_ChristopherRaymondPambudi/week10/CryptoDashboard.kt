package oop_00000115483_ChristopherRaymondPambudi.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.523))
    coinRepo.add(Coin("ETH", 4.12))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Status: ${response.status}")
    response.data.forEach {
        println("Asset: ${it.name} | Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-9921", 100.5))
    txRepo.add(Transaction("TX-9922", 50.0))

    println("\n=== RECENT TRANSACTIONS ===")
    txRepo.getAll().forEach { println("ID: ${it.id} | Amount: ${it.amount}") }

    println("\n--- All Generic Systems Verified ---")
}