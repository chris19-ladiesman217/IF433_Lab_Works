package oop_00000115483_ChristopherRaymondPambudi.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun find(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }
}