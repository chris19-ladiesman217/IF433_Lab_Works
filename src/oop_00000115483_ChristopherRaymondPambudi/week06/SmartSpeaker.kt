package oop_00000115483_ChristopherRaymondPambudi.week06

class SmartSpeaker (override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Smart Speaker [$name] sekarang aktif dan menunggu perintah suara.")
    }

    override fun turnOff() {
        println("Smart Speaker [$name] masuk ke mode standby.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify di [$name].")
    }
}