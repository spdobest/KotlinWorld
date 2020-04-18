package spm.kotlin.world

fun main(args: Array<String>) {

    printMynme()

    lebel1@ for (i in 1..5) {
        lebel2@ for (j in 1..5) {
            if (i == 2 && j == 2) {
                break@lebel1
            }
            println("$i $j")
        }
    }

}

fun printMynme() {
    print("SIbaprasad")
}