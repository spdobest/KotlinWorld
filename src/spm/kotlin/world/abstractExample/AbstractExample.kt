package spm.kotlin.world.abstractExample

fun main(args: Array<String>) {

}

abstract class Person {

    abstract fun eat()

    open fun getHeight() {
        println("Inside getHeight of InterfaceA")
    }

    fun gotoSchool() {}
}


class Indian : Person() {
    override fun eat() {

    }

}