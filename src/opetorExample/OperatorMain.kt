package opetorExample

object OperatorMain {



    @JvmStatic
    fun main(args: Array<String>) {
        operator10()
        operator11()
        // we will get to know different type of operator

    }

    // ::
    fun operator1() {


    }

    // ?
    fun operator2() {


    }

    // !!
    fun operator3() {


    }

    // !
    fun operator4() {


    }

    // let
    fun operator5() {


    }


    // as
    fun funUseof_is_as() {

        var obj = "siba"

        if (obj is String) {
            print(obj.length)
        }

        if (obj !is String) { // same as !(obj is String)
            print("Not a String")
        }
        else {
            print(obj.length)
        }


        if (obj !is String) return
        print(obj.length) // x is automatically cast to String

        // use of AS

        val x: String

    }

    // in
    fun operator7() {
        var obj:Any = 123
        when(obj){
            in 1..6 ->{
                print("its between 1 o 6")
            }
            is Int -> print(1 + 1)
            is String -> print("asdasd")
            is IntArray -> print("asdasda")
        }
    }

    // ===
    fun operator8(){
        val a: Int = 10000
        println(a === a) // Prints 'true'
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA === anotherBoxedA) // !!!Prints 'false'!!!
    }

    // ==
    fun operator9(){
        val a: Int = 10000
        println(a == a) // Prints 'true'
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA == anotherBoxedA) // Prints 'true'
    }

    // is
       fun operator10(){
        val a = "sibaprasad"

        println("a is String = ${a is String}") // Prints 'true'
       // println("a is String = ${a is Int}") // Prints false
    }

    // @loop
    fun operator11(){
        loopouter@ for(i in 1..10){

            innerLoop@ for(j in 1..5){
                if(i == 8){
                    break@loopouter
                }
                else if(j==3){
                    break@innerLoop
                }
                if(j==2){
                    continue@innerLoop
                }
                println("$i ${j}")
            }

        }
    }
}