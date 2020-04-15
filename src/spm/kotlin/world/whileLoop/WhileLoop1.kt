package spm.kotlin.world.whileLoop

class WhileLoop1 {


    fun whileLoop1(){
        var array = arrayOf(1,2,3,4,4,5,6,6,7,7)
        var position = 0
        while (position < array.size) {
            print(array[position])
            position++
        }
    }
}