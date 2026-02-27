package oop_00000115483_ChristopherRaymondPambudi.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    // Mengubah perilaku kerja spesifik Manager [cite: 223]
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    // Mengambil bonus standar dari Parent dan ditambah 500.000 [cite: 224, 225]
    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}
