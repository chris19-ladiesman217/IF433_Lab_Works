package oop_00000115483_ChristopherRaymondPambudi.week07

fun main () {
        println("--- Simulasi Singleton ---")
        GameManager.startGame()
        GameManager.startGame()

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when(response) {
        is ApiResponse.Loading -> "Tampilkan Spinner"
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
    }

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    val data3 = data1.copy(age = 23)
    val (userName, userAge) = data1
    println("Hasil Copy: $data3")
    println("Destructured: $userName berumur $userAge")
    println(data1)
    println("Sama? ${data1 == data2}")

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}