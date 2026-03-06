package oop_00000115483_ChristopherRaymondPambudi.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)
    println("=== ATIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai DOsen (NIDN: {$pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }
    println("=== TESTING MATHHELPER (OVERLOADING) ===")
    val math = MathHelper()
    println("Luas Persegi (sisi 5): ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang (5x10): ${math.hitungLuas(5, 10)}")
    println("Luas Lingkaran (r 7.0): ${math.hitungLuas(7.0)}")

    println("\n=== TESTING PAYMENT SYSTEM (CHECKPOINT 10 & 11) ===")

    val myWallet = EWallet("Raymond", 50000.0)
    val myCard = CreditCard("Raymond", 100000.0)

    val listPembayaran: List<PaymentMethod> = listOf(myWallet, myCard)

    for (pembayaran in listPembayaran) {
        pembayaran.processPayment(75000.0)

        if (pembayaran is EWallet && pembayaran.balance < 75000.0) {
            println("=> Saldo kurang, mencoba top up otomatis...")
            pembayaran.topUp(50000.0) // Smart cast memungkinkan akses ke topUp()
            pembayaran.processPayment(75000.0)
        }
        println("--------------------------")
    }
}