@file:JvmName("KotlinFileName")

package spm.kotlin.world.interoperability

fun main(args: Array<String>) {
    print("Main Method in kotlin")

    var volume = findVolume(1, 2, 4)
    println("Volume is $volume")

}

fun printKotlin() {
    println("printKotlin in kotlin file")
}

@JvmOverloads
fun findVolume(length: Int, width: Int, height: Int = 10) = length * width * height




