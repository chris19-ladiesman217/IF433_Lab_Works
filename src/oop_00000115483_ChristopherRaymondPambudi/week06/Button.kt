package oop_00000115483_ChristopherRaymondPambudi.week06

class Button(override val name: String) :Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}