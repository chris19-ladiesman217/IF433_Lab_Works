package oop_00000115483_ChristopherRaymondPambudi.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        // Factory untuk senjata pemula
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Lapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        // Factory untuk senjata epic (damage tinggi)
        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Excalibur", 150, ItemRarity.EPIC)
            return Weapon(epicItem, 100)
        }
    }
}