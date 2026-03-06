package oop_00000115483_ChristopherRaymondPambudi.week05

class EWallet (accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar $amount sukses. Sisa saldo: $balance")
        } else {
            println("[$accountName] Saldo E-Wallet tidak cukup untuk membayar $amount")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top up sukses. Saldo sekarang: $balance")
    }
}