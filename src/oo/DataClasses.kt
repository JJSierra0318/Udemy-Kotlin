package oo

//Can print and copy, can have methods but cant be inherited
data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {

}

//Singletons
object Cache {
    val name = "HyperChache"
    val color = Color.RED

    fun retrieveDate(): Int {
        return 0
    }
}

enum class Color {
    RED, GREEN, BLUE
}