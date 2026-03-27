package oop_00000115483_ChristopherRaymondPambudi.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Databse is ready.")
    }
}