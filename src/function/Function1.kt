package function

open class Function1 {

    fun printName(name:String){
        println("FUnction with Parameters ${name}")


    }

    fun printName():Unit{
        println("FUnction without Parameters ")
    }

    fun printName1(name:String = "Sibaprasad"):Unit{
        println("FUnction without Parameters ${name}")
    }

}