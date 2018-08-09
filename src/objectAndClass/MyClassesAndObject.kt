package objectAndClass


object MyClassesAndObject {

    @JvmStatic
    fun main(args: Array<String>) {

     //   var person = Person("Sibaprasad")
     //   var  initOrderDemo = InitOrderDemo()

        var super1 = Base()
        var child = Derived()

        var child1 = Base()
        var base1 = Derived()

        child1.v("SPM")
        super1.v("SPM")



        super1.v("Siba")
        child.v("Mohanty")
    }

}