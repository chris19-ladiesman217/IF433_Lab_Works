package oop_00000115483_ChristopherRaymondPambudi.week06

class SmartCCTV (override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV [$name] aktif.")
        startRecord() // Otomatis merekam saat dinyalakan
    }

    override fun turnOff() {
        println("CCTV [$name] non-aktif.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV [$name] mulai merekam video ke penyimpanan.")
    }
}