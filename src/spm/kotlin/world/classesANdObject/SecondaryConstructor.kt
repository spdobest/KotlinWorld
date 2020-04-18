package spm.kotlin.world.classesANdObject

fun main(args: Array<String>) {
    var st = Student1("Satya", 12)
}


class Student1(var name: String) {
    var age: Int = 0

    constructor(name: String, age: Int) : this(name) {
        this.age = age
        println("constructor Age ${age}")
    }

    init {
        println("Student has got aname $name")
        println("Student has got Age ${this.age}")
    }
}