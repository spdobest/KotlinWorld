package returnAndContinue


/**
    break -  Terminates the nearest enclosing loop.
 */
class BreakExample {


    fun breakFUn1(){
        loop@ for (i in 1..10) {
            println("outer $i")
            for (j in 1..10) {
                println("inner $j")
                if (i==7) break@loop
            }
        }
    }
}