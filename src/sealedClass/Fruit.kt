package sealedClass


public sealed class Fruit(var name: String, var type: String) {

    fun showDetails() {
        print("Name of  the fruit is $name and type of the fruit is $type ")
        print("\n")
    }

    class Apple(name: String, type: String) : Fruit(name, type) {

    }

    class Orange(name: String, type: String) : Fruit(name, type) {

    }

}

fun main(args: Array<String>) {
    val apple = Fruit.Apple("Apple", "fruit")
    apple.showDetails()

    val orange = Fruit.Orange("Orange", "fruit")
    orange.showDetails()

    var fruitList = listOf<Fruit>(Fruit.Apple("Fruit 1", "type 1"), Fruit.Orange("Fruit 2", "type 2"), Fruit.Apple("Fruit 3", "type 3"), Fruit.Orange("Fruit 4", "type 4"))


    fruitList.forEachIndexed { index, apple ->

        apple.run {
            when (apple) {

                is Fruit.Apple -> {
                    apple.showDetails()
                }

                is Fruit.Orange -> {
                    apple.showDetails()
                }

            }
        }
    }
}