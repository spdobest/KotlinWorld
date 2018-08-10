package extensionFuncftions

import opetorExample.OperatorMain



object ExtFunctionMain {


    @JvmStatic
    fun main(args: Array<String>) {
        val myString= "Hello Everyone"
        val result = myString.removeFirstLastChar()
        println("First character is: $result")
    }

    fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

 //   fun Boolean.isDivisibleBy2():Int = this.

}