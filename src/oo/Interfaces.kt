package oo

interface Drivable {
    fun drive()
}

interface Buildable {
    fun build()
}

class Car(val color: String): Drivable, Buildable {
    override fun drive() {
        println("Driving")
    }

    override fun build() {
        println("built")
    }
}