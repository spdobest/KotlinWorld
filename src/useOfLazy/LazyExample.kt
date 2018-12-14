package useOfLazy

fun main(args: Array<String>) {

    /**
     * the variable pi will not initialize untill unless it will use
     */

    val pi:Float by lazy{
        3.14f
    }

    val radious = 1.4f
    val area = pi*radious*radious

    println("area is $area")




}

fun calculateAreaOfCircle(rad:Float){

}