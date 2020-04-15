package function

object FunctionMain {
    @JvmStatic
    fun main(args: Array<String>) {
        var fun1 = Function1()
        fun1.printName()
        fun1.printName("Sibaprasad")
        fun1.printName1()
        fun1.sum(c = 3,a = 5,b = 5)
    }
}