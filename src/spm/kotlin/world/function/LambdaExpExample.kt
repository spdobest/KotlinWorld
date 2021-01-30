package spm.kotlin.world.function

val numbers = arrayOf(1,-2,3,-4,5)

fun main(args:Array<String>){
    val result1 = sum1(2,3)
    println("Result of sum1 is $result1")
    val result2 = sum2(3,4)
    println("Result of sum2 is $result2")
    val result3 = sum3(8,9)
    println("Result of sum3 is $result3")

    val result4 = sumAsString(4,5)

    val resultClassExtension = "Geeks".lambda4(50)
    print(resultClassExtension)

    // Kotlin program using shorthand form of lambda function –
    println(numbers.filter {  it > 0 })
    // Kotlin program using longhand form of lambda function –
    println(numbers.filter {item -> item > 0 })

    // Koltin program to return String value by lambda function –
    val resultStringValueByLambda = find(112)
    println(resultStringValueByLambda)
}

val sum1 = { a:Int,b:Int -> a+b }
val sum2 = { a:Int,b:Int -> print("Sub of $a and $b is ${a+b}") }
val sum3 : (Int,Int) -> Int = {a,b -> a+b}
val sum4 = { a:Int,b:Int -> a+b }

val sumAsString = { a: Int, b: Int ->
    val num = a + b
    num.toString()     //convert Integer to String
}

val lambda4: String.(Int) -> String = {this + it}

// Koltin program to return String value by lambda function –
val find =fun(num: Int): String{
    if(num % 2==0 && num < 0) {
        return "Number is even and negative"
    }
    else if (num %2 ==0 && num >0){
        return "Number is even and positive"
    }
    else if(num %2 !=0 && num < 0){
        return "Number is odd and negative"
    }
    else {
        return "Number is odd and positive"
    }
}