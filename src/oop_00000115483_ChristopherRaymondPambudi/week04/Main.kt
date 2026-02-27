package oop_00000115483_ChristopherRaymondPambudi.week04

class Main fun main() {
    println("--- Testing Vehicle ---")

    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)

    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myEV = ElectricCar("Tesla", 2, 90)
    myEV.accelerate()
    myEV.honk()
    myEV.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")

    val manager = Manager("Budi", 10000000)
    val developer = Developer("Andi", 8000000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}
