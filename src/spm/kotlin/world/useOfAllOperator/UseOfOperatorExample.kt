package spm.kotlin.world.useOfAllOperator

fun main(args: Array<String>) {

    var persion1 = Person("Siba",29,"Developer")
    var persion2 = Person("Prasad",30,"Manager")

    var people = listOf<Person>(Person("Siba",23,"job1"),
            Person("Prasad",24,"job2"),
            Person("Mohanty",25,"job3"))

    /**
     * Calls the specified spm.kotlin.world.function [block] and returns its result.
     */
    run {
        var  res = if(persion1.age > persion2.age) persion1 else persion2
    }


    with(persion1){
        this.age = 35
        this.job = "abcd"
    }

    println(persion1.name+" "+persion1.job)

    persion1.run{
        this.age = 32
        this.job = "abcd"
    }
    println(persion1.name+" "+persion1.job)

    persion1.let { it.job = "Developer" }
    println("After Let ${persion1.job}")

    persion1.apply {
        age = 32
        name = "Sibaprasad"
    }.printDetails()

    // now print aalll the names in the list
    var names = people.map { it -> it.name }

    for(str in names){
        println(str)
    }


    var namesAbove22 = people.filter { it ->it.age > 22}.map { it -> it.name }

    for(str in namesAbove22){
        println(str)
    }



}


class Person(var name:String,var age:Int,var job:String){
    fun printDetails() = println(this.toString())
}