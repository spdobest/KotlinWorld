package spm.kotlin.world


fun main(args: Array<String>) {
    println("Hello World!")

    val a: Int = 10000
    println(a == a) // Prints 'true'
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA == anotherBoxedA)

    println(boxedA?.hashCode())
    println(anotherBoxedA?.hashCode())


    for (i in 6 downTo 1) {
        println(i)
    }

}