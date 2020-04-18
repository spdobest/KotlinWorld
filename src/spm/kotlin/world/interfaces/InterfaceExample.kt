package spm.kotlin.world.interfaces

fun main(args: Array<String>) {

}

interface InterfaceA {
    var name: String
    fun eat()
    fun getHeight() {
        println("Inside getHeight of InterfaceA")
        fun gotoSchool() {}
    }
}


class MyImplementationClass(override var name: String) : InterfaceA {
    override fun eat() {
        println("eat  in implemenatation class")
    }

    fun gotoSchool() {
        println("gotoSchool in implemenatation class")
    }
}