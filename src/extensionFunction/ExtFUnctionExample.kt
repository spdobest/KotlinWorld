package extensionFunction


internal object ExtFUnctionExample{

    fun String.removeFirstLastChar(): String {
        return this.substring(1, this.length - 1)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val myString= "Hello Everyone"
        val result = myString.removeFirstLastChar()
        println("First character is: $result")
    }

    fun Int.disivivibleBy2():Int{
        return this%2
    }

}