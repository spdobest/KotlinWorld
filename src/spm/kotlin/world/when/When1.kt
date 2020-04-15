package spm.kotlin.world.`when`

/**
 * spm.kotlin.world.when is the replacement of swich case in java
 * spm.kotlin.world.when is more powerfull and
 */
class When1 {



    fun whenFun1(x:Int = 12):Unit{
        when (x) {
            0, 1 -> print("x == 0 or x == 1")
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }
    }
    fun whenFUn2(s:Int){

        when(s) {
            parseInt(s) -> print("s encodes x")
            else -> print("s does not encode x")
        }
    }

    fun parseInt(s:Int):Int{
        var max = 0
        return max
    }

    fun whenFUn3(x:Int){


        val validNumbers = arrayOf(1,2,3,4)

        when (x) {
            in 1..10 -> {

                print("x is in the range")

            }
            in validNumbers -> print("x is valid")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")
        }
    }

}