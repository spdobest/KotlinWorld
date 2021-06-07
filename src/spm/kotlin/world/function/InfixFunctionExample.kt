package spm.kotlin.world.function

/**
 *
 */
fun main(args: Array<String>) {
    val x = 10
    val y = 20
    val greaterValue = x.greaterValue(y)
    print("Greater number between $x and $y is $greaterValue")
}


infix fun Int.greaterValue(other:Int):Int{
    if(this > other){
        return this
    }
    else
        return other
}