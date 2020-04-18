package spm.kotlin.world.tailrec

import java.math.BigInteger


fun main(args: Array<String>) {

//    val fib = getFibonacciNumber(10000, BigInteger("1"),BigInteger("0"))
//    the above code will show error, as it can not contain the result
    val fib = getFibonacciNumber(10000, BigInteger("1"), BigInteger("0"))
    println(fib)
}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0) {
        return b
    } else {
        return getFibonacciNumber(n - 1, a + b, a)
    }
}
// 0 1 1 2 3 5 8 ...
