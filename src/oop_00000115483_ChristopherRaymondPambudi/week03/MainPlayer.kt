package oop_00000115483_ChristopherRaymondPambudi.week03

class MainPlayer

fun main() {
    println("--- PENGUJIAN TUGAS 2: PLAYER ---")

    val p1 = Player("JohnThor")

    println("Menambah 50 XP...")
    p1.addXp(50)
    println("Status saat ini - Level: ${p1.level}")

    println("--------------------------------")

    println("Menambah 60 XP lagi...")
    p1.addXp(60)
    println("Status akhir - Level: ${p1.level}")

    println("--------------------------------")

    println("Mencoba tambah -100 XP...")
    p1.addXp(-100)
}