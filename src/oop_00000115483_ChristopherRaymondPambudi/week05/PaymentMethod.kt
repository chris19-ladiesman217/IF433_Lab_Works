package oop_00000115483_ChristopherRaymondPambudi.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}
