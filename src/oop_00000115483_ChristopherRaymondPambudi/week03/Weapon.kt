package oop_00000115483_ChristopherRaymondPambudi.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("WARNING: Damage tidak boleh negatif! Nilai tetap: $field")
            } else if (value > 1000) {
                println("WARNING: Damage terlalu OP! Dipaksa menjadi 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    // Computed Property untuk Tier [cite: 104]
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
            else -> "Common"
        }
}