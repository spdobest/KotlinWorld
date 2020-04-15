package spm.kotlin.world.collections

object MapOperationMain {

    @JvmStatic
    fun main(args: Array<String>) {
        mutableMapType1()
        mutableMapType2()
        immutableMap()
    }

    fun immutableMap(){
        var map = mapOf<Int,String>(1 to "Raju",2 to "Bangali", 3 to "Namita",
                4 to "Sabita",5 to "satya", 6 to "Siba")
    }

    fun mutableMapType1(){
        var map = hashMapOf<Int,String>(1 to "Raju",2 to "Bangali", 3 to "Namita",
                4 to "Sabita",5 to "satya", 6 to "Siba")

        map.put(7,"Mitu")
        map.put(8,"Babu")
        map.put(9,"Pooja")
        map.put(10,"Sonali")
        map.put(11,"noone")


        map.remove(11)


    }

    fun mutableMapType2(){
        var map = mutableMapOf<Int,Int>(1 to 2,2 to 3, 3 to 4,
                4 to 5,5 to 6, 6 to 7)

        map.put(7,9)
        map.put(11,12)


        map.remove(11)

        for(item in map ){
            println("value at ${item.key} is ${map.values}")
        }


    }

}