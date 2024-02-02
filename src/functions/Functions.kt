package functions

import java.util.*

fun helloWorld() {
    println("Hello World!")
}

fun printWithSpaces(text: String) {
    for (char in text) {
        print("$char ")
    }
    println()
}

fun getCurrentDate(): Date {
    return Date()
}

fun max(a: Int, b: Int): Int {
    if (a >= b) {
        return a
    }
    return b
}

fun main() {
    helloWorld()
    printWithSpaces("Kotlin is awesome!")
    println(getCurrentDate())
    println(max(13, 76))
}