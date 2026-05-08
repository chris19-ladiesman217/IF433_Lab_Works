package oop_00000115483_ChristopherRaymondPambudi.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.523))
    coinRepo.add(Coin("ETH", 4.12))
    coinRepo.add(Coin("USDT", 1500.0))
}