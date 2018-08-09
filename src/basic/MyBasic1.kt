package basic

import objectAndClasses.ClassAndObj
import returnAndContinue.BreakExample

internal object MyBasic1 {

    @JvmStatic
    fun main(args: Array<String>) {

        var classObj = ClassAndObj("spm")

        var breakObj = BreakExample()

        breakObj.breakFUn1()

      //  git remote set-url origin
       /* ClassAndObj.printName()

        functionWithDefaultParameterValues()

        val fruitList = listOf("Orange","aam", "Mengo", "Grapes","Apple")
        when {
            "Orange" in fruitList -> println("juicy")
            "apple" in fruitList -> println("apple is fine too")
        }

        fruitList
                .filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it+" , ") }

        var list = listOf(123,23,45,75,12,155)
        val positives = list.filter { x -> x > 0 }

        list.forEach{print(it)}

        var abc:String = "a"
        println(abc?.length)

        val listWithNulls: List<String?> = listOf("A", null)
        for (item in listWithNulls) {
            item?.let { println(it) } // prints A and ignores null
        }*/
    }

    fun sum(a:Int,b:Int):Int {
        return a+b
    }

    fun sum1(a:Int,b:Int) = a+b

    fun sum2(a:Int,b:Int):Unit{

    }


    fun functionWithDefaultParameterValues(a: Int = 0, b: String = "") {
        println("Values are $a and $b")
    }

}