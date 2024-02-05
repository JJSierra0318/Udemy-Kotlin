package oo

abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("Learning a $topic course.")
    }
}

interface Learnable {
    fun learn() {
        println("Learning...")
    }
}

open class KotlinCourse() : Course("Kotlin", 999.99), Learnable {
    final override fun learn() {
        super<Course>.learn()
        println("I'm learning kotlin")
    }
}

class SpecialKotlinClass() : KotlinCourse() {
    /*
    //Stopped from overriding by final
    override fun learn() {
        println("Learning especial kotlin course")
    }
     */
}

fun main() {
    val course = KotlinCourse()
    course.learn()
}