package spm.kotlin.world.collections

object SetOperationMain {
    @JvmStatic
    fun main(args: Array<String>) {

        immutableSet()
        mutableSetType1()
        mutableSetType2()
    }

    fun immutableSet(){

        // this is immutable
        var set:Set<String> = setOf("Siba","satya","Siba","satya")
        for(item in set){
            println(item)
        }

        var iter:Iterator<String> = set.iterator()
        while (iter.hasNext()){
            println(iter.next())
        }

    }

    fun mutableSetType1(){
        var set:Set<String> = hashSetOf<String>("Siba","Prasad","Mohanty","Siba")
        for(item in set){
            println(item)
        }
    }

    fun mutableSetType2(){
        var set:Set<String> = mutableSetOf("Siba","Prasad","Mohanty","Siba")
        for(item in set){
            println(item)
        }
    }

}