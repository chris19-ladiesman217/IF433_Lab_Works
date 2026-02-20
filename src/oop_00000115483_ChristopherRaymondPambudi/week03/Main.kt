package oop_00000115483_ChristopherRaymondPambudi.week03

class Main
fun main() {
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    e.increasePerformance()
    println("Gaji: ${e.salary}, Pajak: \${e.tax}")
}