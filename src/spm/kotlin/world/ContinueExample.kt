package spm.kotlin.world

fun main(args: Array<String>) {

    outer@ for (i in 1..5) {
        inner@ for (j in 1..5) {
            if (i == 2 && j == 2) {
                continue@outer
            }
            println("$i $j")
        }
    }

}