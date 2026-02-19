package oop_00000115483_ChristopherRaymondPambudi.week02

import java.util.Scanner

class MainRPG

fun main() {
    val scanner = Scanner(System.`in`)
    print("Nama Hero: ")
    val name = scanner.nextLine()
    print("Base Damage: ")
    val damage = scanner.nextInt()

    val myHero = Hero(name, damage)
    var enemyHp = 100

    println("\n--- BATTLE START: $name VS SLIME ---")

    while (myHero.isAlive() && enemyHp > 0) {
        println("\nHP Kamu: ${myHero.hp} | HP Musuh: $enemyHp")
        print("Menu: 1. Serang, 2. Kabur -> ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            myHero.attack("Slime")
            enemyHp -= myHero.baseDamage
            println("HP Musuh tersisa: $enemyHp")

            if (enemyHp > 0) {
                val dmgTaken = (10..20).random()
                myHero.takeDamage(dmgTaken)
                println("Musuh membalas! Kamu terkena $dmgTaken damage.")
            }
        } else if (choice == 2) {
            println("Kamu melarikan diri dari pertempuran!")
            break
        }
    }


    println("\n--- PERMAINAN BERAKHIR ---")
    if (myHero.isAlive() && enemyHp <= 0) {
        println("Selamat! ${myHero.name} Menang!")
    } else if (!myHero.isAlive()) {
        println("Yah, ${myHero.name} telah gugur...")
    }
}
