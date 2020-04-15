package spm.kotlin.world.nullpointer_handling


/**
 * In Kotlin, the type system distinguishes between references that can hold null (nullable references)
 * and those that can not (non-null references).
 *  For example, a normal property can’t hold a null value and will show a compile error.
 *
 * var variable : CustomClass = CustomClass()
 * variable = null //compilation error
 *
 * Instead, we can add a ? after the data type of that property which declares that variable as a nullable property
 * var nullableVariable : CustomClass? = CustomClass()
 * nullableVariable = null //works fine
 *
 * In any case, the nullable property requires a null check every time before utilizing that property or
 * requires a confirmation from the developer that the estimation of that property won’t be null
 * while utilizing it
 *
 * variable.someMethodCall() //works fine as the compiler is sure that
    //the variable can’t be null nullableVariable.someMethodCall()
   //will highlight compilation error
   //as compiler is not sure as nullVariable can be null.
 *
 *
 *
 *
 *
 *
 *
 */

object NullPointerMain {
    @JvmStatic
    fun main(args: Array<String>) {

        nullPointerCheck1()

        var a: String = "abc"
       // a = null // compilation error : Null can not be a value of a non-null type String
        // To allow null, we can declare a variable as nullable string, written String?:
        var b: String? = "abc"
        b = null // ok
        print(b)

        var length:Int = a.length // it will not show any compile time error as a is not non null type
      //  length = b.length// here we will get compile time error , as we defined the variable as null type
        // that measns you have to handle the null check

        length = b?.length!! // this is right
        b = null
        val l = b?.length // error: variable 'b' can be null

        //==============
        val a1 = "Kotlin"
        val b1: String? = null
        println(b1?.length)
        println(a1?.length) // Unnecessary safe call
    }


    fun nullPointerCheck1(){
        val a = "Kotlin"
        val b: String? = null
        println(b?.length)
        println(a?.length)

        val listWithNulls: List<String?> = listOf("Kotlin", null)
        for (item in listWithNulls) {
            item?.let { println(it) } // prints A and ignores null
        }
    }

    fun nullPointerCheck2(){
        val a = "Kotlin"
        val b: String? = null
        println(b?.length)
        println(a?.length)

        val l = b?.length ?: -1
        print(l)
    }

    // ELVIS OPERATOR
    //When we have a nullable reference r, we can say "if r is not null, use it, otherwise use some non-null value x":

    fun elvisOperatorExample1(){
        var b:String? = "abcd"
        val l1: Int = if (b != null) b.length else -1
        b = null
        val l2: Int = if (b != null) b.length else -1

        print("Length of b When null value $l2")
        print("Length of b When not null value $l2")

    }

    /**
     * Elvis Operator (?:)
    This one is similar to safe calls except the fact that it can return a non-null value if the calling
    property is null even
    val result = nullableVariable?.someMethodCall()?: fallbackIfNullMethodCall()
     */
    fun elvishOperatorExample2(){
        var b:String? = "abcd"
        // if b is not null it the value is the length of the string
//        if b is null the value of l is -1 below
        val l = b?.length ?: -1
    }

    // !! Operator
    /**
     * The !! Operator
    This operator is used to explicitly tell the compiler that the property is not null
    and if it’s null, please throw a null pointer exception (NPE)

    nullableVariable!!.someMethodCall()

     */
    fun doubleExclametoryExample(){
        var b:String? = "sibaprasad"
        b = null

        try {
            val l = b!!.length
        }
        catch (e:Exception){
            print("Null pointer exception")
        }
    }

    fun filterOutNullValue(){
        val nullableList: List<Int?> = listOf(1, 2, null, 4)
        val intList: List<Int> = nullableList.filterNotNull()
    }

    fun foo(node: String): String? {
        val parent = node.plus("Sibaprasad") ?: return null
        val name = node.plus("asvav") ?: throw IllegalArgumentException("name expected")

        return name;
    }

}