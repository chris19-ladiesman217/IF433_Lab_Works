package oop_00000115483_ChristopherRaymondPambudi.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String)
    : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

}
