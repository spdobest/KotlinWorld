package spm.kotlin.world.basic

/**
 *
 */
class ConstsVsVal {

    val myValue = getValue() // this is valid, because it will generate the value at runtime
//    const val myName = "Sibaprasad" this will show error

    companion object {
        const val myName = "Sibaprasad" // this is allowed
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello World!")
        }
    }

    fun getValue() = 12*23

}