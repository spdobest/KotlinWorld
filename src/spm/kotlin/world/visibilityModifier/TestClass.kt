package spm.kotlin.world.visibilityModifier

class TestClass {

    // person.a, person.b are not visible here
    // person.c person.d are visible

    fun testing() {
        val person = Person()
        println("Internal ${person.c}")
        println("default or public ${person.d}")
    }

}

open class Person {

    private val a = 1
    protected val b = 2 // accessible
    internal val c = 3  // accessibe inside the same module
    val d = 10 // public by default

}

class Indian : Person() {
    fun test() {
        print(b)
    }
}