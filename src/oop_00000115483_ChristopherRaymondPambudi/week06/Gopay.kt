package oop_00000115483_ChristopherRaymondPambudi.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) { println("Processing Rp$amount via Gopay Server") }
}