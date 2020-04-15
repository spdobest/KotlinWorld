package spm.kotlin.world.tailrecFunction

import java.math.BigInteger

fun main(args: Array<String>) {

}

tailrec fun printFibonacciSeries(n:Int,a:BigInteger,b:BigInteger):BigInteger{
    if(n==0){
        return b
    }
    else{
        return printFibonacciSeries(n-1,a+b,b)
    }

}