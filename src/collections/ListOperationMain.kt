package collections

internal object  ListOperationMain{

    @JvmStatic
    fun main(args: Array<String>) {
//        createMutableList()
        createmutableList()

    }



    fun createMutableListType1(){
        var list:ArrayList<String> = ArrayList<String>()
        list.add("Raju")
        list.add("Bangali")
        list.add("Namita")
        list.add("Sabita")
        list.add("Satya")
        list.add("Sibaprasad")

        for((index,value) in list.withIndex()){
            println("Value at $index th position is $value")
        }

    }

    fun createMutableListType2(){
        var list:List<String> = arrayListOf<String>("Raju","Bangali","Namita","Sabita","Satya","Siba")


    }
    fun createMutableListType3(){
        var myList: MutableList<String> = mutableListOf<String>()
        myList.add("raju")
        myList.add("bangali")
        myList.add("namita")
        myList.add("sabita")
        myList.add("satya")
        myList.add("Sibaprasad")

        for(item in myList){
            print(item)
        }

        for((indecex,value) in myList.withIndex()){
            println("value at ${indecex} is $value")
        }
    }

    fun createmutableList(){
        var myList = listOf<String>("Raju","Bangali","Namita","Sabita","satya","Sibaprasad")
        for(abc in 0..myList.size-1 ){
            println(myList.get(abc))
        }
    }

}