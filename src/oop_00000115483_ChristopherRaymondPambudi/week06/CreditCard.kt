package oop_00000115483_ChristopherRaymondPambudi.week06

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) { println("Contacting Bank for Rp$amount") }
}