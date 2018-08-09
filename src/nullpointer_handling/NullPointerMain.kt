package nullpointer_handling

object NullPointerMain {
    @JvmStatic
    fun main(args: Array<String>) {

        nullPointerCheck1()

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
}