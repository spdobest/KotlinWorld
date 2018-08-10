package opetorExample

import com.sun.org.apache.xerces.internal.dom.DOMMessageFormatter.setLocale
import org.xml.sax.helpers.ParserFactory
import java.util.*

object OperatorMain {


    @JvmStatic
    fun main(args: Array<String>) {
//        operator10()
//        operator11()

        useOfAlso()
        useOfLet()

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
        } else {
            print(obj.length)
        }


        if (obj !is String) return
        print(obj.length) // x is automatically cast to String

        // use of AS

        val x: String

    }

    // in
    fun operator7() {
        var obj: Any = 123
        when (obj) {
            in 1..6 -> {
                print("its between 1 o 6")
            }
            is Int -> print(1 + 1)
            is String -> print("asdasd")
            is IntArray -> print("asdasda")
        }
    }

    // ===
    fun operator8() {
        val a: Int = 10000
        println(a === a) // Prints 'true'
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA === anotherBoxedA) // !!!Prints 'false'!!!
    }

    // ==
    fun operator9() {
        val a: Int = 10000
        println(a == a) // Prints 'true'
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA == anotherBoxedA) // Prints 'true'
    }

    // is
    fun operator10() {
        val a = "sibaprasad"

        println("a is String = ${a is String}") // Prints 'true'
        // println("a is String = ${a is Int}") // Prints false
    }

    // @loop
    fun operator11() {
        loopouter@ for (i in 1..10) {

            innerLoop@ for (j in 1..5) {
                if (i == 8) {
                    break@loopouter
                } else if (j == 3) {
                    break@innerLoop
                }
                if (j == 2) {
                    continue@innerLoop
                }
                println("$i ${j}")
            }

        }
    }

    /**
     * also
    With this function, you say “also do this with the object.”
    I often use it to add debugging to the call chains or to do some additional processing:
     */

    fun useOfAlso() {
        val person = Person("Edmund", 42)
        val result = person.also { person -> person.age = 50 }
        println(person)
        println(result)
    }

    /**
     * let
    let is a non-monadic version of map:
    It accepts objects as parameters and returns the result of the lambda.
    Super-useful for conversions:
     */

    fun useOfLet(){
        val person = Person("Edmund", 42)
        val result = person.let { it.age * 2 }
        println(person)
        println(result)
    }

    /**
     * apply
    apply is used for post-construction configuration.
    It is a function literal with receiver: The object is not passed as a parameter,
    but rather as this.
    An object passed in such way is called the receiver.
     */

    fun useOfApply(){
        val person = Person("Edmund", 42)
        val result = person.apply { age = 50 }
        println(person)
        println(result)
    }

    /**
     * run
    run is another function literal with receiver.
    It is used with lambdas that do not return values,
    but rather just create some side-effects:
     */

    fun useOfRun(){
        val person = Person("Edmund", 42)
        val result = person.run { age * 2 }
        println(person)
        println(result)
    }

    /**
     * with
    According to Kotlin idioms, with should be used to call multiple methods on an object.
     */

    fun useOfWith(){
        val person = Person("Edmund", 42)
        val result = with(person) {
            age * 2
        }
        println(person)
        println(result)
    }

}