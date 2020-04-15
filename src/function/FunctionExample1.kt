package function

import java.lang.Integer.parseInt

class FunctionExample1{

    fun add(a:Int,b:Int) = a+b

    fun add1(a:Int,b:Int):Int{
        return a+b
    }

    fun printResult(a:Int,b:Int){
        print("Sum of $a and $b is ${a+b}")
    }

    fun printResult1(a:Int,b:Int):Unit{
        print("Sum of $a and $b is ${a+b}")
    }

    fun maxOf(a: Int, b: Int):Int{
        if (a > b)
            return a
        else
            return b
    }

    fun maxOf1(a: Int, b: Int) = if (a > b) a else b

    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        // Using `x * y` yields error because they may hold nulls.
        if (x != null && y != null) {
            // x and y are automatically cast to non-nullable after null check
            println(x * y)
        }
        else {
            println("either '$arg1' or '$arg2' is not a number")
        }
    }

    fun printProduct1(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        if(x == null){
            print("value of $arg1 is null")
            return
        }

        if(y == null){
            print("value of $arg2 is null")
            return
        }
        println(x * y)
    }

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // `obj` is automatically cast to `String` in this branch
            return obj.length
        }

        // `obj` is still of type `Any` outside of the type-checked branch
        return null
    }

    fun getStringLength1(obj: Any): Int? {
        if (obj is String)  return obj.length

        return null
    }

    fun getStringLength2(obj: Any): Int? {
        if (obj is String && obj.length > 0) {
            return obj.length
        }
        return null
    }

}