package oop_00000115483_ChristopherRaymondPambudi.week12

fun dispenseKibble(
    requestedGram: Int,
    availableGram: Int,
    isJammed: Boolean
): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }
    return availableGram

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram

}

fun main() {
    var currentKibbleStock = 50
    println("Stok awal kibble: $currentKibbleStock gr")

    println("=== JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(80, currentKibbleStock, false)
    }
    catch (e: DispenserJamException) {
        println("Caught: ${e.message}")
    }
    catch (e: FoodEmptyException) {
        println("Caught: ${e.message}")
    }
    catch (e: Exception) {
        println("Caught General Error: ${e.message}")
    }
    finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
    println("\n=== JADWAL MAKAN SORE ===")
    val refilledStock = 1000

    val result = runCatching {
        dispenseKibble(30, refilledStock, false)
    }

    result.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }

        .onFailure { error ->
            // Jika terjadi error, tampilkan pesan peringatan
            println("Peringatan ke Pemilik: ${error.message}")

            // Logika tambahan sebagai fallback (cadangan)
            println("(Opsional: Berikan chicken jerky secara manual)")
        }
    println("\n--- Smart Feeder Robustness Verified ---")
}