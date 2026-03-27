package oop_00000115483_ChristopherRaymondPambudi.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}