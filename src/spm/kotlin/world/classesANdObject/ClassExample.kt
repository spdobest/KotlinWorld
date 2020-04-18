package spm.kotlin.world.classesANdObject

fun main(args: Array<String>) {

    var student = Student("Sibaprasad")

}


class Student(val name: String) {

    var lastName: String = ""

    init {
        println("Students has got a name $name")
    }

}