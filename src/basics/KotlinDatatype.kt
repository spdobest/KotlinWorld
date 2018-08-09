package basics

internal object KotlinDatatype {

//    Double	64
//    Float	32
//    Long	64
//    Int	    32
//    Short	16
//    Byte	8


    @JvmStatic
    fun main(args: Array<String>) {



        var a:Int // if u declare a vatriable with its datatype, then u may or may not be
        // assign value to it
        // var b  -> it will show error, because, u have to assign a value if data type is not defined

        var b = 12

        // we can define number with  underscrore separated for more readability
        // examples are

        val oneMillion = 1_000_000
        val creditCardNumber = 1234_5678_9012_3456L
        val socialSecurityNumber = 999_99_9999L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010


//        On the Java platform, numbers are physically stored as JVM primitive types
//        but in Kotlin everything is Object
        val a1: Int = 10000
        print(a1 == a1) // Prints 'true'
        val boxedA: Int? = a1
        val anotherBoxedA: Int? = a1
        print(boxedA == anotherBoxedA) // !!!Prints 'false'!!!

        var str: String = "1"
        fun String.mymethod(){

            print("hi")
        }
        str.mymethod()



        //Explicit Conversions
        var a2: Int? = 1
        var a3: Long? = 456456

        // implicit type conversion is not allowed in Kotlin
        // only explicit type conversion possible

        var a4:Int = a3!!.toInt()
        var a5:Float = a3!!.toFloat()


        // all the type conversion methods are noted below
//        toByte(): Byte
//        toShort(): Short
//        toInt(): Int
//        toLong(): Long
//        toFloat(): Float
//        toDouble(): Double
//        toChar(): Char

        // Range Operator syntax
//        Range instantiation and range checks: a..b, x in a..b, x !in a..b

//        NaN is considered equal to itself
//        NaN is considered greater than any other element including POSITIVE_INFINITY
//        -0.0 is considered less than 0.0


        var items = listOf("apple", "banana", "kiwifruit")
        items[0]

        var per = Person("siba")
    }
}

class Person(firstName: String) {
    constructor(secondName: String,boolean: Boolean):this(secondName)
}