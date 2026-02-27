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
}
