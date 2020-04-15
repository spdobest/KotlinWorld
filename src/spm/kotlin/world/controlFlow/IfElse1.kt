package spm.kotlin.world.controlFlow

class IfElse1 {

    fun main(args: Array<String>) {

        val ctl:IfElse1 = IfElse1()

        ctl.ifElseMax1()


    }

    /**
     * kotlin if else condition with default plarameters
     *
     * if we dont lpass any value then the defult value will be assign
     * example - ifElseMax1()
     * ifElseMax1(12,13) - in this case the default value will be replaced
     *
     *
     */
    fun ifElseMax1(a:Int = 12,b:Int = 123){
        if(a>b){
            System.out.println("Bigger is a")
        }
        else{
            System.out.println("Bigger is b")
        }
    }

    /**
     * THis is the single line spm.kotlin.world.function
     * where user can check the greater and lessthan value in the single line
     *
     */
    fun ifELse2(a:Int,b:Int):Int{
        val max = if (a > b) a else b
        return max
    }

    /**
     * This is another example of if else statement
     */

    fun ifELse3(a:Int,b:Int):Int {
        val max = if (a > b) {
            print("Choose a")
            a
        } else {
            print("Choose b")
            b
        }
        return max
    }
}