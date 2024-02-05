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

//Challenge classes
class Book(val title: String, val author: String, val publicationYear: Int, var borrowed: Boolean) {

    fun borrow() {
        borrowed = true
    }

    fun returned() {
        borrowed = false
    }

    fun bookInfo() {
        println(title)
        println("by $author")
        println(publicationYear)
    }
}

fun main() {
    val person = Person("John", 22)
    person.greet("World")
    println(person.name)
}