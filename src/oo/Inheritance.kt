package oo

open class Human(open val name: String, open var age: Int) {

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2024 - age
}

class Student(override val name: String, override var age: Int, val studentID: String): Human(name, age) {

}

class Employee(override val name: String, override var age: Int): Human(name, age) {

}

fun main() {
    val student = Student("John", 22, "20201005")
}