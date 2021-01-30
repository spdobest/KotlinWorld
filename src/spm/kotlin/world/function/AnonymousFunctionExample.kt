package spm.kotlin.world.function

// anonymous function with body as an expression
val anonymous1 = fun(x: Int, y: Int): Int = x + y

// anonymous function with body as a block
val anonymous2 = fun(a: Int, b: Int): Int {
    val mul = a * b
    return mul
}
fun main(args: Array<String>) {
    //invoking funtions
    val sum = anonymous1(3,5)
    val mul = anonymous2(3,5)
    println("The sum of two numbers is: $sum")
    println("The multiply of two numbers is: $mul")
}