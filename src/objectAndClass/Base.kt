package objectAndClass

open class Base {
    open fun v(name:String) {
        print("Super Class ${name}")
    }
    fun parentFunn(name:String) {
        println("Parent Fun ${name}")
    }
}
class Derived() : Base() {
    override fun v(name:String) {
        print("Child Class ${name}")
    }

    fun childFunn(name:String) {
        println("child Fun ${name}")
    }
}