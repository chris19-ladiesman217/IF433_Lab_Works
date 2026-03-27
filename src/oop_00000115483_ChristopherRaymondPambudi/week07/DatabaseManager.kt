package oop_00000115483_ChristopherRaymondPambudi.week07

object DatabseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Databse is ready.")
    }
}