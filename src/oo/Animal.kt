package oo

class Animal {
    private var age: Int = 0
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    //Private but can be accessed from child classes
    protected var name = "Sam"
    //Accessible while on the same module
    internal val isDangerous = true
}

fun main() {
    val animal = Animal()
}