package spm.kotlin.world.returnAndContinue

/**
 * return =  By default returns from the nearest enclosing spm.kotlin.world.function or anonymous spm.kotlin.world.function.
 */
class ReturnExample {
    fun returnFUnction() {

        for (i in 1..100){
            if (i>3)
                return
        }

    }

    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return // non-local return directly to the caller of foo()
            print(it)
        }
        println("this point is unreachable")
    }

    fun foo1() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
            print(it)
        }
        print(" done with explicit label")
    }

    fun foo2() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach // local return to the caller of the lambda, i.e. the forEach loop
            print(it)
        }
        print(" done with implicit label")
    }

    fun foo3() {
        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
            if (value == 3) return  // local return to the caller of the anonymous fun, i.e. the forEach loop
            print(value)
        })
        print(" done with anonymous spm.kotlin.world.function")
    }

    fun foo4() {
        run loop@{
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3) return@loop // non-local return from the lambda passed to run
                print(it)
            }
        }
        print(" done with nested loop")
    }
}