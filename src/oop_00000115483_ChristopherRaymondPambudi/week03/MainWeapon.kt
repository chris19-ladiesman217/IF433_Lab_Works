package oop_00000115483_ChristopherRaymondPambudi.week03

class MainWeapon
fun main() {
    println("--- PENGUJIAN TUGAS 1: WEAPON ---")

    val w1 = Weapon("Aurelius Sword")

    println("Mencoba set damage ke -50...")
    w1.damage = -50
    println("Damage saat ini: ${w1.damage} (Tier: ${w1.tier})")

    println("--------------------------------")

    println("Mencoba set damage ke 9999...")
    w1.damage = 9999
    println("Damage saat ini: ${w1.damage} (Tier: ${w1.tier})")

    println("--------------------------------")

    println("Mencoba set damage ke 600...")
    w1.damage = 600
    println("Damage saat ini: ${w1.damage} (Tier: ${w1.tier})")
}