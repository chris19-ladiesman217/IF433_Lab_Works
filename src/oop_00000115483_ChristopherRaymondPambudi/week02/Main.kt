package oop_00000115483_ChristopherRaymondPambudi.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APlIKASI PMB UMN ---")

    print("Masukan Nama: ")
    val name = scanner.nextLine()

    print("Masukan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai")
    }
}
