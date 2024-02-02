package collections

fun main() {
    /*
    //Fixed length
    val array = arrayOf("Texas", "Iowa", "California")
    val mixed = arrayOf("Kotlin", 17, 3.0, true)
    val number = intArrayOf(1, 2, 3)
    println(mixed[0])
    mixed[1] = 18
    val str = "Udemy"
    println(str[0])

    val states = arrayOf("Nevada", "Florida")
    val allStates = array + states

    println(allStates.size)

    val empty: Boolean = number.isEmpty()

    if (states.contains("Kentucky")) {
        println("In contains Kentucky")
    }

    //Immutable
    val list = listOf("Orange", "Apple", "Bananas")
    */

    //Shares sum, position access, .size, .isempty, .contains functions
    val arrayList = arrayListOf("Patrick", "Michael", "Sarah")

    arrayList.add("Josh")
    //Boolean checks if list changed
    val changed = arrayList.add(1, "Jack")
    arrayList.remove("Michael")

    val sublist = arrayList.subList(1, 3)

    println(arrayList)
    println(sublist)
}