import objectAndClasses.Derived
import objectAndClasses.InitOrderDemo
import kotlin.properties.Delegates

internal object Basics {

    lateinit var testInit: String
    var testDelegate by Delegates.notNull<String>()
    @JvmStatic
    fun main(args: Array<String>) {

        val nan = Double.NaN
        println("1: " + (nan == nan))
        println("2: " + (nan == (nan as Number)))
        println("3: " + ((nan as Number) == nan))

        var der = Derived("spm mohanty","Moh")

        var name1 = "Sibaprasad"
        val myVar1 = "Hello Mr. Sibaprasad Mohanty".also (::println)
        var myVar2 = "Hello Satya : whats up".also { println("Sibaprasad") }

        println(myVar2)
        println(myVar1)

        printSum(12,13)
        println("sum of ${12} and ${23} is "+returnSum(12,23))
        println("sum of ${15} and ${45} is "+expressionSum(15,45))
        println("Max Of of ${15} and ${45} is "+maxOf(15,45))
        println("Max Of of ${15} and ${45} is "+maxOfExpression(15,45))
        println("Length of ${"Sibaprasad "} is "+getStringLength("Sibaprasad"))
        println("Length of ${12345} is "+getStringLength(12345))

        println("Length of ${"sib"} is "+getStringLength1("sib"))
        forLoopExample()
        forloopWithIndex()
        forExample1()
        forExample2()
        whileExample1()
        forExample3()
        println(whenExample2("Sibaprasad"))
        whenExample1(5)
        filterExample()
        var (a,b)  =  functionWithPair()

        print("Values are $a and $b")
    }
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }
    fun returnSum(a: Int, b: Int): Int {
        return a + b
    }
    // function as expression
    fun expressionSum(a: Int, b: Int) = a + b

    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }
    // if statement as Expression
    fun maxOfExpression(a: Int, b: Int) = if(a>b) a else b

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return obj.length
        }
        return null
    }
    fun getStringLength1(obj: Any): Int? {
        if (obj !is String) return null
// `obj` is automatically cast to `String` in this branch
        return obj.length
    }
    // for loop
    fun forLoopExample(){
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println(item)
        }
    }

    fun forloopWithIndex(){
        val items = listOf("apple", "banana", "kiwifruit")
        for (index in items.indices) {
            println(items[index])
        }
    }

    fun forloopWithIndexAndValue(){
        val items = listOf("apple", "banana", "kiwifruit")

    }
    fun forExample1(){
        for (i in 6 downTo 0 step 2) {
            println(i)
        }
    }

    fun forExample2(){
        for (i in 6 downTo 0 step 2) {
            println(i)
        }
    }

    fun forExample3(){
        println("Forloop with Half Open")
        // half-open range: does not include 100
        for (i in 1 until 10) {
            println(i)
        }
    }

    fun whileExample1(){
        val items = listOf("apple", "banana", "kiwifruit")
        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
    }


    fun whenExample1(obj: Any) {
        when (obj) {
             1 -> "One"
            "Hello" -> "Greeting"
            is Long -> println("Long")
            in 1..10 -> println("between 1 to 10")
            !is String -> println("Not a string")

            10..100 -> {
                println("asdasdada")
            }
            else
            ->  println("Unknown")
        }
    }

    fun whenExample2(obj: Any): String =
            when (obj) {
                1
                -> "One"
                "Hello"
                -> "Greeting"
                is Long
                -> "Long"
                !is String -> "Not a string"
                else
                -> "Unknown"
            }
fun rangeExample1(){
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}
    fun rangeExample2() {
        val list = listOf("a", "b", "c")
        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        if (list.size !in list.indices) {
            println("list size is out of valid list indices range too")
        }
    }
    fun rangeInForLoop(){
        for (x in 1..10 step 2) {
            print(x)
        }
        println()
        for (x in 9 downTo 0 step 3) {
            print(x)
        }
    }

    fun filterExample(){
        var fruits = listOf<String>("Oraange","apple","Abcd")
        fruits
                .filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }
    }


    fun functionWithPair(): Pair<String,Long>{
        return Pair("bar",5)
    }

    fun lazyExample(){
        // Lazy: It’s same as lazy initialization.
        // Your variable will not be initialized unless
        // you use that variable in your code.
        // It will be initialized only once after
        // that we always use the same value.
        val testString = "some value"
        testString
    }

    fun leteINitExample(){
        // lateinit: it means you will be initializing
        // the value for this variable before accessing it.
        testInit = "Some value"
        println("Length of string is "+ testInit.length)
        testInit = "change value"
    }

    fun delegateNotNullExample() {
        testDelegate = "Some value"
        println("Length of string is "+ testDelegate.length)
        testDelegate = "change value"
    }

}