package udemy1

 fun main(arg:Array<String>){
     val array1 = arrayOf("12",12,12.5)
     print("Length of array 1 ${array1.size}")
     val array2 = intArrayOf(12,12,13,13,14)

     val list1 = listOf("12",12,"Siba",12.5)
     println("Value of list1 a 0 position is ${list1[2]}")

     val arraylist = arrayListOf("asd",12)

     println("Value of arraylist at 1 position is ${arraylist[1]}")

     val arrayConcat1 = arrayOf<String>("satya","Siba")
     val arrayConcat2 = arrayOf<String>("Mohanty","all")

     val concatArray = arrayConcat1+arrayConcat2
     print(concatArray)

 }

