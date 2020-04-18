package spm.kotlin.world.extensionFUnction

fun main(args: Array<String>) {

    val s1 = "Siba"
    val s2 = "Prasad"
    val s3 = "Hey"


    println(s3.add(s1, s2))

    val num1 = 10
    val num2 = 20

    println("Greater number is ${num2.greaterNumber(num1)}")


}

fun Int.greaterNumber(num2: Int) = if (this > num2) this else num2

fun String.add(s1: String, s2: String) = this + s1 + s2


fun Student.isSchoolar(marks: Int): Boolean {
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