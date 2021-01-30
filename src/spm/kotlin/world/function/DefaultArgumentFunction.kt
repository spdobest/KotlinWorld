package spm.kotlin.world.function

fun main(args: Array<String>) {
    defaultArgumentFUnction()
    defaultArgumentFUnction("Prasad",30)
}

fun defaultArgumentFUnction(name:String = "Sibaprasad", age:Int = 31){
    print("My Name is $name and my age is $age")
}