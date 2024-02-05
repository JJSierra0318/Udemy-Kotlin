package oo

class Person(val name: String, val age: Int) {

    /*
    val name: String
    val age: Int

    init {
        this.name = name
        this.age = age
    }
    */

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2024 - age

}

fun main() {
    val person = Person("John", 22)
    person.greet("World")
    println(person.name)
}