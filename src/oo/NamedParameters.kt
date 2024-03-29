package oo

class House(val height: Double, val color: String, val price: Int = 50000) {

    fun print() {
        println("House [height=$height, color=$color, price=$price]")
    }
}

fun main() {
    val house = House(height = 4.5, color = "blue", price = 150000)
    val yellowHouse = House(color = "yellow", height = 2.5)
}