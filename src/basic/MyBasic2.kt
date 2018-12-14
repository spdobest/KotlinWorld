package basic

internal object MyBasic2{

    val myName ="Sibaprasad" as String
    var myAge = 29

    // is !is  - used to check the type
    // 123 is Integer - it will return true


    // as - unsafe cast operator i.e var a :String" = y as String
    // if the above casting not possible , it will through cast exception

    // as? -  safe cast Operator i.e a:String? = y as? String

    val b = 123
   // var a : String = b as String // here it will through exception

    var x:Int? = 123
    var y:String? = x as? String

    // we can use @Suppress("UNCHECKED_CAST") before any statement like below
    /*
    if (all { it is T })
        @Suppress("UNCHECKED_CAST")
        this as List<T> else
        null
     */



    @JvmStatic
    fun main(args: Array<String>) {
        comparisonBetweenEqualAndDoubleEqual()


        val text = """
    for (c in "foo")
        print(c)
"""
        println(text)

    }


    fun comparisonBetweenEqualAndDoubleEqual():Unit {
        // for Reference equality we use ===
        val a = Integer(10)
        val b = Integer(10)
        // for structural equality, we use the == symbol that evaluates if both values are the same

        println(a===b) // false
        println(a==b)  // true

        var c = a
        println(a===c) // true

        val hobbies = arrayOf("Hiking, Chess")
        val hobbies2 = arrayOf("Hiking, Chess")

        println(hobbies == hobbies2)
        println(hobbies === hobbies2)


        var user1 = User("Siba",29)
        var user2 = User("Siba",29)

        println(user1 == user2)
        println(user1 === user2)


    }
    data class User(val name: String, val age: Int)

    fun arrayFunctionality(){
        // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
        val asc = Array(5, { i -> (i * i).toString() })
        asc.forEach { println(it) }
    }

    fun useofIfElse(){
        // if can be use as expression
        val maxNumber = if(5>6){
            5
        }
        else{
            6
        }

        var a = 123
        val b = 234

        var max = if (a > b) a else b

        max = if (a > b) {
            print("Choose a")
            a
        } else {
            print("Choose b")
            b
        }
    }

    fun useOfWhen(){

        val x = 123

        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }

        // when as expression
        val a = 12
        val b = 5

        println("Enter operator either +, -, * or /")
        val operator = readLine()

        val result = when (operator) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            else -> "$operator operator is invalid operator."
        }
    }

    fun useOfForloop(){
        for(i in 1..10){ // it will print 1 to 10 including 10
         print(i)
        }
        for(i in 1 until 10){ // it will print 1 to 10 excluding 10
            print(i)
        }

        for(i in 1..10 step 2){ // it will print 2,4,6,8,10
            print(i)
        }

        for(i in 6 downTo  2){ // it will print 6 to 2
            print(i)
        }

        for(i in 6 downTo  2 step 2){ // it will print 6 to 2
            print(i)
        }

        var array = arrayOf(1,2,3,4,5)

        for ((index, value) in array.withIndex()) {
            println("the element at $index is $value")
        }

        // how to break a loop
        loop@ for (i in 1..100) {
            for (j in 1..100) {
                if (i==5) break@loop
            }
        }

        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return // non-local return directly to the caller of foo()
            print(it)
        }

        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
            print(it)
        }

    }

    fun useOfWHileLoop(){
        var a =  10
        while (a>0){
            a = a/2
        }
    }


}