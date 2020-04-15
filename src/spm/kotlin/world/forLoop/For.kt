package spm.kotlin.world.forLoop

class For {


    fun for1(){
        var collection = arrayOf("Siba","satya","narayan","Mohanty")
        for (item in collection) print(item)

        var collectionInt = arrayOf(1,2,3,4)
        for (item: Int in collectionInt) {
            print(item)
        }
    }

    /**
     * In this case it will print from 1 to 10 , include 10
     */
    fun for2(){
        for (i in 1..10){
            print(i)
        }
    }


    /**
     * use of until keyword
     * in the below code, it will print 1 to 9
     */
    fun for3(){
        for (i in 1 until 10){
            print(i)
        }
    }

    /**
     * it will print 2,4,6,8,10
     */
    fun for4(){
        for (i in 1 .. 10 step 2) {
            print(i)
        }
    }

    /**
     * it will print  10,8,6,4,2
     */
    fun for5(){
        for (i in 10 downTo 1 step 2) {
            print(i)
        }
    }
    /**
     * A for loop over a range or an array is compiled to an
     * index-based loop that does not create an iterator object.

    If you want to iterate through an array or a list with an index,
    you can do it this way:
     */
    fun for6(){
        var array = arrayOf(1,2,3,4,5,5)
        for (i in array.indices) {
            println(array[i])
        }
    }
    /**
     * there is another spm.kotlin.world.function where we can use withIndex spm.kotlin.world.function
     * where user can print the kay and value of an array like below
     */
    fun for7(){
        var array = arrayOf(1,2,3,4,5,5)
        for((index,value) in array.withIndex()){
            print("The value in $index position is $value")
        }
    }
}