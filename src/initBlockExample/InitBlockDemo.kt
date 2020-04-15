package initBlockExample

import kotlin.properties.Delegates

class InitBlockDemo {

    constructor(name:String="Siba"){
        println("Inside constructor $name")
    }

    init {
        println("Inside Init BLOCK{}")
    }

    lateinit var testInit: String
    var testDelegate by Delegates.notNull<String>()

    companion object{
        fun print(){
            println("Inside Print inside companion object")
        }
    }

    fun printInstanceMethod(){
        println("Inside printInstanceMethod")
    }

}