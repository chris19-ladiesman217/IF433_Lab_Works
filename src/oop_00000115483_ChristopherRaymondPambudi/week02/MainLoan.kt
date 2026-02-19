package oop_00000115483_ChristopherRaymondPambudi.week02

class MainLoan fun main() {
    val scanner = java.util.Scanner(System.`in`)

    println("--- SISTEM PEMINJAMAN BUKU ---")
    print("Judul Buku: ")
    val title = scanner.nextLine()
    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()
    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()


    if (duration < 0) {
        duration = 1
    }


    val loan = Loan(title, borrower, duration)

    // Cetak detail dan total denda [cite: 117]
    println("\n--- Detail Peminjaman ---")
    println("Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}