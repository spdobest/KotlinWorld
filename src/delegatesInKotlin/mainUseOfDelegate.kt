package delegatesInKotlin

fun main(args: Array<String>) {

    var eagle = Eagle(23)
    eagle.flyAndFindFood()

    var cocko = Cockoo(eagle)
    cocko.flyAndFindFood()

}


interface BirdInterface{
    fun flyAndFindFood()
}

class Eagle(val age:Int):BirdInterface{
    override fun flyAndFindFood() {
         println("I am an eagle of age $age i am flying and finding food")
    }
}

class Cockoo(b:BirdInterface):BirdInterface by b{
    /*override fun flyAndFindFood() {
        println("I am an Cockoo and i am flying and finding food")
    }*/
}