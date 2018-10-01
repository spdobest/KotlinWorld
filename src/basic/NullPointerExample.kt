package basic

internal object NullPointerExample {

    lateinit var name:String
    var name1:String = ""
    var name2:String? = "SIbaprasad"

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
    fun useofQUestionMark(){
        println(name2!!.length)
        name2 = null
        println(name2?.length)
    }
}