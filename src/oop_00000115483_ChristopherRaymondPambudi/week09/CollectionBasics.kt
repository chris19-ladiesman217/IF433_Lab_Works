package oop_00000115483_ChristopherRaymondPambudi.week09

fun main () {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("kotlin", "java", "C++")
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserB")
    println("ActiveUsers: $activeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "ALice" to "A",
        "Bob" to "B",
        "Charlie" to "A",
    )

    println("Nila Bob: ${studentGrades["Bob"]}")
    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20
    inventory["Apples"] = 45
    println("Inventory: $inventory")
}