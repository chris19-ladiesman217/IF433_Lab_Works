package oop_00000115483_ChristopherRaymondPambudi.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat [${device.name}] berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Seluruh Perangkat ---")
        for (device in devices) {
            // Menggunakan 'is' untuk mengecek apakah perangkat mendukung Switchable
            if (device is Switchable) {
                device.turnOff() // Smart cast terjadi di sini
            }
        }
    }
}