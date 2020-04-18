package spm.kotlin.world.infixFunction


fun main(args: Array<String>) {

    val num1 = 10
    val num2 = 20

    println("Greater number is ${num2 greaterNumber num1}")


    val res = Student() isSchoolar 123

    println(res)

}

infix fun Int.greaterNumber(num2: Int) = if (this > num2) this else num2


infix fun Student.isSchoolar(marks: Int): Boolean {
    if (marks > 90)
        return true
    else
        return false

}


class Student {

    fun hasPassed(marks: Int): Boolean {
        if (marks > 50)
            return true
        else
            return false
    }

}