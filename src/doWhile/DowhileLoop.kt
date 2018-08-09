package doWhile

class DowhileLoop {

    fun dowhileLoop1(){
        var sum: Int = 0
        var input: String

        do {
            print("Enter an integer: ")
            input = readLine()!!
            sum += input.toInt()

        } while (input != "0")

        println("sum = $sum")
    }

}