package oo

//Abstract inherit but cant use father class
abstract class Human(open val name: String, open var age: Int) {

    abstract fun speak()

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2024 - age
}

class Student(override val name: String, override var age: Int, val studentID: String): Human(name, age) {
    override fun speak() {
        println("Hi there, I'm a student")
    }
}

class Employee(override val name: String, override var age: Int): Human(name, age) {
    override fun speak() {
        println("Hi I'm an employee")
    }
}

fun main() {
    val student = Student("John", 22, "20201005")
}