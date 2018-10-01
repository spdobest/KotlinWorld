package hiigherOrderFUnction

internal object HigherOrderFunExample{

    @JvmStatic
    fun main(args: Array<String>) {


        var list = arrayListOf<Int>()
        for (number in 1..10){
            list.add(number)
        }
var resultList = list.filterOnCondition { isMultipleOf(it, 5) }

        print(resultList)

    }

    fun <T> ArrayList<T>.filterOnCondition(condition: (T) -> Boolean): ArrayList<T>{
        val result = arrayListOf<T>()
        for (item in this){
            if (condition(item)){
                result.add(item)
            }
        }

        return result
    }

    fun isMultipleOf (number: Int, multipleOf : Int): Boolean{
        return number % multipleOf == 0
    }

   // fun splitSctringBySpace(str: String?,getLenthOfString(str))


    fun getLenthOfString(str:String?):Int{
        return str?.length as Int
    }

}