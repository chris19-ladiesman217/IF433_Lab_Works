package oop_00000115483_ChristopherRaymondPambudi.week04

open class car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
}