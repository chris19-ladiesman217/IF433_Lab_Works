package oop_00000115483_ChristopherRaymondPambudi.week06

class SmartLamp (override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu [$name] menyala dengan terang.")
    }

    override fun turnOff() {
        println("Lampu [$name] dimatikan.")
    }
}