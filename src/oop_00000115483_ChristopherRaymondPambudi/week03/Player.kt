package oop_00000115483_ChristopherRaymondPambudi.week03

class Player(val username: String) {
    // Properti xp bersifat private, dimulai dari 0 [cite: 117]
    private var xp: Int = 0

    // Computed Property untuk Level dengan rumus: (xp/100) + 1 [cite: 119, 120]
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) { // Hanya menerima angka positif [cite: 122]
            val oldLevel = level
            xp += amount

            // Cek apakah naik level [cite: 124]
            if (level > oldLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}