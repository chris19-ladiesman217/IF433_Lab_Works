package oop_00000115483_ChristopherRaymondPambudi.week07

class GameExecutor
fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("Awas! Kamu bertemu dengan monster: ${event.monsterName}")
        }
        is LootDropped -> {
            val item = event.item
            println("Selamat! Kamu mendapat loot: ${item.name} (Rarity: ${item.rarity}, Damage: ${item.damage})")
        }
        is GameOver -> {
            println("Permainan Berakhir! Alasan: ${event.reason}")
        }
        SafeZone -> {
            println("Kamu berada di zona aman. Tidak ada musuh di sini.")
        }
    }
}