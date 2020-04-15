package basic

import returnAndContinue.BreakExample

internal object MyBasic1 {

    const val MAX_LEN = 20



    val s1 by lazy { 123 }

    val s: String?

    init {
        s = "value"
    }


    @JvmStatic
    fun main(args: Array<String>) {

        val items = listOf("banana", "avocado", "apple", "kiwifruit")
        when {
            "apple" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
        }

        var breakObj = BreakExample()


        breakObj.checkGrayCode(1100,1011)


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

        var a: String? = "abc"

        a = null

    }

    fun checkGrayCode( val1:Int, val2:Int){
        var num1 = val1
        var num2 = val2
        if(val1>0 && val2>0){
            var sum = 0
            while (num1>0 && num2>0){

                if(val1%10==val2%10){
                    num1 = num1/10
                    num2 = num2/10
                    sum++
                    if(sum>1){
                        print("Both are not gray Code")
                        break
                    }
                }


            }
            if(sum == 1){
                print("Both are not gray Code")
            }
        }
        else{
            print("Both are not gray Code")
        }
    }

}