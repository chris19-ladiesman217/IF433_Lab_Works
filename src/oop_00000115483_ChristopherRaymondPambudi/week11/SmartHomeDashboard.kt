package oop_00000115483_ChristopherRaymondPambudi.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
    val acUnit = run {
        val device = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        device // return objek
    }
    homeDevices.add(acUnit)
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println("\n=== HASIL PENCARIAN ===")
        println(it.diagnose())
    }
}