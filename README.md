# Kotlin for Beginners
## features of Kotlin
Following are seven main features of Kotlin:
- Concise code : we can write more code in less lines
- Null safety : by using ? , !! and elvish operator
- Expressive code : Expressive code means the code that can be easily understandable by every programmer.
- Modern features : like lambda, extension function, higher order function
- Interoperability with Java - we can convert java to kotlin code, and java code can also accesed from kotlin and vice versa
- JavaScript transpilation : We can write javascript code in kotlin as well.
- Native conversion (Kotlin Native) : Native conversion like converting to IOS, c language
    Kotlin Native supports the following platforms:
    - iOS (arm32, arm64, emulator x86_64)
    - MacOS (x86_64)
    - Android (arm32, arm64)
    - Windows (mingw x86_64)
    - Linux (x86_64, arm32, MIPS, MIPS little endian)
    - WebAssembly (wasm32)

## Basics
### Data type
- In kotlin everything is object.
- numbers, characters and booleans can be represented as primitive values at runtime - but to the user they look like ordinary classes

**Numbers**
Kotlin provides a set of built-in types that represent numbers.
For integer numbers, there are four types with different sizes and, hence, value ranges.
![alt tag](https://github.com/spdobest/Kotlin-World/blob/Kotlin_Beginners/resources/Kotlin_Numbers.png)
**Floating**
For floating-point numbers, Kotlin provides types Float and Double.
![alt tag](https://github.com/spdobest/Kotlin-World/blob/Kotlin_Beginners/resources/kotlin_float.JPEG)
**NOTE:** For variables initialized with fractional numbers, the compiler infers the Double type. To explicitly specify the Float type for a value, add the suffix f or F

**NOTE:** Note that unlike some other languages, there are no implicit widening conversions for numbers in Kotlin. For example, a function with a Double parameter can be called only on Double values, but not Float, Int, or other numeric values.

## Literal constants
There are the following kinds of literal constants for integral values:
Decimals: 123
Longs are tagged by a capital L: 123L
Hexadecimals: 0x0F
Binaries: 0b00001011
Doubles by default: 123.5, 123.5e10
Floats are tagged by f or F: 123.5f
**NOTE:** Octal literals are not supported.

## Underscores in numeric literals
we can use underscore to make the constants more readable

val oneMillion = 1_000_000  // we can write  like this
val creditCardNumber = 1234_5678_9012_3456L  // we can write  like this
val socialSecurityNumber = 999_99_9999L  // we can write  like this
val hexBytes = 0xFF_EC_DE_5E  // we can write  like this
val bytes = 0b11010010_01101001_10010100_10010010  // we can write  like this

## Type Conversion
**Implicit Conversion**
// Hypothetical code, does not actually compile:
val a: Int? = 1 // A boxed Int (java.lang.Integer)
val b: Long? = a // implicit conversion yields a boxed Long (java.lang.Long)
print(b == a) // Surprise! This prints "false" as Long's equals() checks whether the other is Long as well

**Explicit Conversion**
- toByte(): Byte
- toShort(): Short
- toInt(): Int
- toLong(): Long
- toFloat(): Float
- toDouble(): Double
- toChar(): Char

## var, val, late init , lazy
var - used to define a variable
val - used to define a constant
lateinit var - is used to declare a variable without initializing variable
late init var myname:String
by lazy - used to define a variable when the variable is used

```
    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }
```
**lateinit or lazy**
If variable are mutable (i.e. might change at a later stage) use lateinit
lazy can only be used for val properties, whereas lateinit can only be applied to var because it can’t be compiled to a final field, thus no immutability can be guaranteed.

**Getters and Setters**
In kotlin, the getter and setter are provided internally

## String
To write multiple line string we can use """ """.
```
val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
```
## String templates
We can use $ to use as String literal
var age=30
println("my age is $age")

## Control Flow

**If else**
we can write ef else clause in different ways, here i have explained below
```
// With else
var max: Int
if (a > b) {
    max = a
} else {
    max = b
}
```
this is the simple one like java, we can do the above task with different ways

```
// As expression
val max = if (a > b) a else b
```
we can use if else as expression in Kotlin, here is the example.
```
val max = if (a > b) {
    print("Choose a")
    a
} else {
    print("Choose b")
    b
}
```
In the above statement, make sure that the return statement should be the last statement in the parenthisis

## when clause
Instead of switch in java, in kotlin we use when expression
It is more dynamic as compared to switch.
It can be used as expression in kotlin as well.
```
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
```

```
    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }
```

```
    when (x) {
        parseInt(s) -> print("s encodes x")
        else -> print("s does not encode x")
    }
```

```
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
```

**NOTE: It can be used as return type or expression**
```
    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }
```

**NOTE : when can be used as if-else-if clause. Look at the example below**
```
    when {
        x.isOdd() -> print("x is odd")
        x.isEven() -> print("x is even")
        else -> print("x is funny")
    }
```

**Since Kotlin 1.3, it is possible to capture when subject in a variable using following syntax:**
```
    fun Request.getBody() =
            when (val response = executeRequest()) {
                is Success -> response.body
                is HttpError -> throw HttpException(response.status)
            }
```
## Range
val r1 = 1..5 o/p = 1 2 3 4 5
val r2 = 5 downTo 1 o/p = 5 4 3 2 1
val r3 = 10 downTo 1 step 2 o/p = 10 8 6 4 2
val r4 = "a".."z" o/p: a b c ....z
val r4 = 'a'..'z' o/p: a b c ....z

val res1 = 1 in r1
val res2= 'c' in r4

var countDown1 = 10.downTo(1)  o/p 10 9 8...1
var countDown2 = 1.rangeTo(10)  o/p 1 2 3 4 ...10



## For loops
- We can write for loops in different ways
- for(i in 1..3)           o/p  1 2 3 4
- for (i in 1 until 4)     o/p  1 2 3
- for (i in 1..10 step 2)  o/p  1 3 5 7 9
- for (i in 6 downTo 1)    o/p  6 5 4 3 2 1
- for (i in array.indices) o/p it will print the indices of the array
- for (i in array)         o/p it will print the items in the
- for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
## Return and Jump
- return   ->  By default returns from the nearest enclosing function or anonymous function.
- break    ->  Terminates the nearest enclosing loop.
- continue ->  Proceeds to the next step of the nearest enclosing loop.

**Break**
```
loop@ for (i in 1..100) {
    for (j in 1..100) {
        if (...) break@loop
    }
}
```

**Return**
```
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with explicit label")
}
```

```
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with implicit label")
}
```

```
fun foo() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop // non-local return from the lambda passed to run
            print(it)
        }
    }
    print(" done with nested loop")
}
```

## How Hello World works in kotlin
Kotlin compiler internally creates a class file which is
loaded into memory for execution in runtime.

Kotlin needs JVM in runtime to execute the .class file like java.
After execute the HelloWorld.kt file, a HelloWorldkt.class will be created by Kotlin COmpiler.

## Interoperability
You can call java functions from kotlin and kotlin functions from java
- You can have JAVA and KOTLIN files within the same project.
![alt tag](https://github.com/spdobest/Kotlin-World/blob/Kotlin_Beginners/resources/HowKotlinWorks.JPEG)

@file:JvmName("Utils")  :
@file:JvmMultifileClass :
@JvmField : If you need to expose a Kotlin property as a field in Java, annotate it with the @JvmField annotation.
- You can annotate a property with @JvmField if it has a backing field, is not private, does not have open, override or const modifiers, and is not a delegated property
@JvmStatic : Kotlin can also generate static methods for functions defined in named objects or companion objects if you annotate those functions as @JvmStatic
@JvmDefault : To make a member default, mark it with the @JvmDefault annotation
@JvmName("filterValidInt")
```
@get:JvmName("x")
@set:JvmName("changeX")
var x: Int = 23
```
@JvmOverloads
```
@JvmOverloads
fun findVolume(length:Int,width:Int,height:Int = 10) = length*width*height
```

## Visibility
The Kotlin visibilities are mapped to Java in the following way:

**private** members are compiled to private members;
**private** top-level declarations are compiled to package-local declarations;
**protected** remains protected (note that Java allows accessing protected members from other classes in the same package and Kotlin doesn't, so Java classes will have broader access to the code);
**internal** declarations become public in Java. Members of internal classes go through name mangling, to make it harder to accidentally use them from Java and to allow overloading for members with the same signature that don't see each other according to Kotlin rules;
**public** remains public.

## Infix function
- infix function contains only one parameter
- all infix functions are Extension function
- But all extension function are not infix function
## Taillrec function
- uses recursion in optimized way
- prevents stack overflow exception
- prefix tailrec is used

## Visibility Modifier
- private
- Internal - access inside the same module

- protected
- public


## Classes and Object
- Primary COnstructors
    - Init block
    - primary constructor with property
    - primary constructor with parameters

- Secondary Constructor
    - we can not define var/ val to secondary arguments
    - first init block execute before secondary constructor

## Inheritance
    - All the classes in Kotlin are FInal bydefault.
    - That means, we can not extends this class
    - to extends this class, we need to use the open keyword before define the class




















