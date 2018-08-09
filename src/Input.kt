import java.util.*

internal object input{
    fun main(args: Array<String>) {

        // Creates an instance which takes input from standard input (keyboard)
        val reader = Scanner(System.`in`)
        print("Enter a number: ")

        // nextInt() reads the next integer from the keyboard
        var integer:Int = reader.nextInt()

        println("You entered: $integer")
    }
}