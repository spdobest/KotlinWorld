import com.sun.org.apache.bcel.internal.generic.FLOAD
import sun.net.www.content.text.Generic

internal object Hello {

    @JvmStatic
    fun main(args: Array<String>) {

        println("Hello, Sibaprasad , welcome to Kotlin")

        useOfINkeyWOrd()
        datatypeTtesting()
        checkIfUseses()
        ifWIthMultipleExpression()
        ifELseIf()
        ifWIthNestedIfStatement()
    }


    fun datatypeTtesting(){
        var byte1:Byte = 123
        var short1:Short = 12312
        var int1:Int = 1231231231
        var long1:Long = 123123123123
        var double1:Double = 123334.4
        var float1:Float = 12.5f

        println("Maximum value of Integer Datatype is : "+Int.MAX_VALUE )
        println("Minimum Value of Integer Datatype is : "+Int.MIN_VALUE)

        println("Minimum Value of FLoat Datatype is : "+Float.MIN_VALUE)
        println("Minimum Value of Float Datatype is : "+Float.MIN_VALUE)

        println("Minimum Value of Long Datatype is : "+Long.MIN_VALUE)
        println("Minimum Value of Long Datatype is : "+Long.MIN_VALUE)

        println("Minimum Value of Double Datatype is : "+Double.MIN_VALUE)
        println("Minimum Value of Double Datatype is : "+Double.MIN_VALUE)

        println("Minimum Value of Short Datatype is : "+Short.MIN_VALUE)
        println("Minimum Value of Short Datatype is : "+Short.MIN_VALUE)

        println("Minimum Value of Byte Datatype is : "+Byte.MIN_VALUE)
        println("Minimum Value of Byte Datatype is : "+Byte.MIN_VALUE)

        println("Type cast from Int $int1 to Long = "+ int1.toLong())
        println("Type cast from Long $long1 to Int = "+ long1.toInt())
        println("Type cast from Short $short1 to Int = "+ short1.toInt())

        println("Type cast from Int $int1 to FLoat = "+ int1.toFloat())
        println("Type cast from FLoat ${float1} to Int = "+ float1.toInt())

        println("Type cast from Float $float1 to Double = "+ float1.toDouble())
        println("Type cast from DOuble $double1 to Float = "+ double1.toFloat())

        println("Type cast from Int $int1 to Char = "+ int1.toChar())
    }

    fun useOfINkeyWOrd(){
        val numbers = intArrayOf(1, 4, 42, -3)
        if(4 in numbers)
            println("$4 is exists in the number array")
    }
    fun checkExp(){
        val a = 12
        val b = 13
        val max: Int

        max = if (a > b)
                     a
              else b
        println("$max")
    }

    fun checkIfUseses(){
        // The else branch is mandatory when using if as an expression.
        val number = -10

        val result = if (number > 0) {
            "Positive number"
        } else {
            "Negative number"
        }

        println(result)
    }

    fun ifWIthMultipleExpression(){
        val a = -9
        val b = -11

        val max = if (a > b) {
            println("$a is larger than $b.")
            println("max variable holds value of a.")
            a
        } else {
            println("$b is larger than $a.")
            println("max variable holds value of b.")
            b
        }
        println("max = $max")
    }

    fun ifELseIf(){
        val number = 0

        val result = if (number > 0)
            "positive number"
        else if (number < 0)
            "negative number"
        else
            "zero"

        println("number is $result")
    }

    fun ifWIthNestedIfStatement(){
        val n1 = 3
        val n2 = 5
        val n3 = -2

        val max = if (n1 > n2) {
            if (n1 > n3)
                n1
            else
                n3
        } else {
            if (n2 > n3)
                n2
            else
                n3
        }

        println("max = $max")
    }
}