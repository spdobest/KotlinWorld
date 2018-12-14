package hiigherOrderFUnction


fun main(args: Array<String>) {




var pr = Program()
    pr.addNumber(12,23,object : Execute{
        override fun executeSum(num: Int) {
            print("sum is $num")
        }
    })

    val test : String ="hello"

    val myLambda:(Int) -> Unit = {s:Int -> print(s) }

    val myLambda2:(String) -> String = {s:String -> s }

    val myLambda3:(Int,Int) -> Int = {x:Int,y:Int -> x+y }

    // we can remove the datatype from right side
    val myLambda4:(Int,Int) -> Int = {x,y -> x+y }



   //  {s -> println(s)}  // lambda expression [function]

    pr.addNumberUsingLambda(2,3,myLambda)
    pr.addNumberUsingLambda(2,3, {s:Int -> print(s)})
    pr.addNumberUsingLambda(7,3) {s:Int -> print(s)}


    pr.addNumberUsingLambdaReturn(7,3,{x,y ->x+y})

    // use of Closure
    var closureResult = 0
    pr.addNumberUsingLambdaClosure(7,3,{ x,y -> closureResult = x+y })

    println("Closure result is $closureResult")

}

class Program{
    fun addNumber(num1:Int,num2:Int,execute:Execute){
        execute.executeSum(num1+num2)
    }

    fun addNumberUsingLambda(num1:Int,num2:Int,action:(Int) -> Unit){
        action(num1+num2)
    }

    fun addNumberUsingLambdaReturn(num1:Int,num2:Int,action:(Int,Int) -> Int){
       val result = action(num1,num2)
        println("Result is $result")
    }

    fun addNumberUsingLambdaClosure(num1:Int,num2:Int, action:(Int,Int) -> Unit){
        action(num1,num2)
    }
}

interface Execute{
    fun executeSum(num:Int)
}