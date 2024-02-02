package loops

fun main() {
    /*
    for (i in 1..10) {
        println(i)
    }

    val list = listOf("Java", "Kotlin", "Python")
    for (element in list) {
        println(element)
    }

    for ((index, value) in list.withIndex()) {
        println("Element at $index is $value")
    }


    var x = 9
    //Can use break and continue
    while (x >= 0) {
        println(x)
        x -= 1
    }

    //Named loops
    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                break@outer
            }
            println("$i - $j")
        }
    }
     */

    //Challenge
    var sum = 0L
    for (i in 100..100000L) {
        sum += i
    }
    println(sum)
}