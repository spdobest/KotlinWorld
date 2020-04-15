package spm.kotlin.world.basic

internal object NullPointerExample {

    lateinit var name:String
    var name1:String = "" // we cant assign null here, as it is non null variable, it will show compile time error
    var name2:String? = "SIbaprasad" // we can assign null value to the variable, as it is null variable

    @JvmStatic
    fun main(args: Array<String>) {
        // useOflateinit()
        useofQUestionMark()
    }

    fun useOflateinit(){
        println(name.length) // it will show runtime error lateinit property name1 has not been initialized
        name = "Sibaprasad"
        print(name.length) // it will successfully execute
    }
    fun useOfVar(){
        //  name1 = null , it will show compile time error, showing that the non null variable cant hold null value
        name1 = "sdfsdf"
    }

    fun exampleofNullpointerHandleing(){
        val a = "Kotlin"
        val b: String? = null
        println(b?.length)
        println(a?.length)
    }

    fun useOfElvisOperator(){
        val b = "Sibaprasad"
        val l: Int = if (b != null) b.length else -1
        val l1 = b?.length ?: -1 // this one is elvish operator
        print("Length of $b is l")
    }

    // we use as for non safe casting and as? for safe casting
    fun useOfAsForSafeCasting(){
        val a = 123123132
        val aInt: Int? = a as? Int
    }

    fun String?.isNotNull(): Boolean = this != null

    fun useofQUestionMark(){
        println(name2!!.length)
        name2 = null
        println(name2?.length)
    }
}