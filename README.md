# Kotlin-Demo  
# Libraries  
https://github.com/square/moshi  
https://insert-koin.io/ (A dependency injection library for Kotlin written in kotlin)  
https://github.com/Kotlin/anko  
Kbinding (https://github.com/BennyWang/KBinding)  
KAndroid (https://github.com/pawegio/KAndroid)  
Klint  
KLAXON -https://github.com/cbeust/klaxon - json to kotlin library  
RXKotlin 
https://github.com/mcxiaoke/awesome-kotlin  

# [Click here for Corotines](https://github.com/spdobest/Hello-Kotlin/blob/master/COROUTINES.md)


## **Advantage of Kotlin Over Java**  
- Kotlin is more flexible than java  
- Kotlin is concise - means we can perform more task with less code  
- Its More safety than Java -  Because its Immutablility of class and its Nullablity Check
we will not get null pointer exception  
- Ensure More performance
- Supports high order spm.kotlin.world.function, we can pass spm.kotlin.world.function as method parameter
- Kotlin and java are interpoble
- Kotlin is similar to Scripting language, its the next generation language 
 
## How Hello World Program Works
- in kotlin
```
fun main(args:Array<String>){
 println("Hello")
 }
``` 
- It dont have class define, but it executes perfectly. The Kotlin Compiler creates a class  file which is loaded intomemory at runtime.  
 During compile time, Kotlin compiler convert the Myclass.kt file to MyClasskt  
 Once we run the class , MyClasskt.class file will be generate by java runtime  
 ```
 print(10/9)  output = 1
 print(10.0/9)  output is 1.1223
 ```
## Basic Syntax
- **var** keyword used for variable declaration  
- ```var a``` // it will show error  
- because if u declare a variable without any datatytpe, then you have to assign some value to the variable  
- var a = 123 // it will not show any error    
- var is only to declare not null type variables, we cant assign any null value to the variable declared as var
- it will show error - null cant be the value of a non null type  
  
## val
- keyword used to define any constants value  
- its nothing but the **final** keyword in java
- the value cant be changed
```
let a = 123
let variable:Int = 123434
```

## **? and !! operator**  
- We can declare any variable using **?** and **!!** operator or without using any operator at all.   
- **var a:String? ="abc"**, when we declare any variable with ? operator, this means , the variable can be null anytime. We use ? operator for null safety. We have to assign value to the variable we declare with ? and also have to define the datatype of the variable. Otherwise it will show compile time error.
- ```print(a?.length())``` - if a is null , it will print nothing  
- Else it will print the length of the string  
- At the compile time, the compiler force us to handle the null pointer while doing any operation on the null values like 
- when we declare any variable like , question mark after the Datatype. that means you are saying that the value may be null some time.
```var a:String? ="abc"```
- here we are saying the compiler that the variable a can hold null.When we will do any operation on the variable a, the compiler will show compilertime error to handle null pointer exception.  
```
println(a.length)  // it will show compile time error that the value can be null  
println(a!!.length) // it will not show any error now, because we handle Null pointer exceptin  
```
- In the above case if a is null, it will through null pointer exception. If we handle using try cache, it will be okay else it will crash.  
```  
fun parseInt(str: String): Int? {  
    // ...  
}  
```
- This function explains that the return type can be null, so you have to handle
## variable without ? operator 
```
var a:String = "SIba"
a = null// it will show compile time error saying that the variable can be null.  
```  
## Use of !! - null assertion operator (!!)**  
- The third option is for NPE-lovers: the not-null assertion operator (!!) converts any value to a non-null type and throws an exception if the value is null. 
- We can write b!!, and this will return a non-null value of b (e.g., a String in our example) or throw an NPE if b is null:  
 - ```val l = b!!.length```  
- Thus, if you want an NPE, you can have it, but you have to ask for it explicitly, and it does not appear out of the blue.   
## late init
- when we declare any variable as lateinit, this means the variable will be initialize later. 
- If the variable is not assigned any value and we trying to use the variable, it will show runtime error. that is lateinit property variableName has not been initialized
- Here is how to declare lateinit variable
```
lateinit var name1:String
```
- here is the example how to use it
```
println(name1.length) // it will show runtime error , that the variable is not initialized or assigned any value
name1 = "Sibaprasad"  
println(name1.length)  // it will print the length of the variable without any error. because this variable is assigned value later with "Sibaprasad"  
```
## Here are the DataType List and their Range  
**Type**	     **Bit width*  
 Double       64(Bit)  
 Float        32(Bit)    
 Long         64(Bit)    
 Int          32(Bit)    
 Short        16(Bit)    
 Byte          8(Bit)    

**NOTE:Underscores in numeric literals (since 1.1)**  
- You can use underscores to make number constants more readable:  
- *ForExample*  
```
val oneMillion = 1_000_000  
val creditCardNumber = 1234_5678_9012_3456L  
val socialSecurityNumber = 999_99_9999L  
val hexBytes = 0xFF_EC_DE_5E  
val bytes = 0b11010010_01101001_10010100_10010010    
```
**NOTE :** Kotlin doesnot support implicit type coversion, It supports only explicit data conversion 
- For example  
```
var a:Int = 123
var b:Long = a // it will show error
var b:Long = a.ToLong() // it will execute successfully  
```  
## Every number type supports the following conversions:  
**toByte(): Byte    
toShort(): Short  
toInt(): Int  
toLong(): Long  
toFloat(): Float  
toDouble(): Double  
toChar(): Char**  
## Type Checks and Casts: 'is' and 'as'
- is and !is Operators
- We can check whether an object conforms to a given type at runtime by using the is operator or its negated form !is:
```
if (obj is String) {
    print(obj.length)
}
​
if (obj !is String) { // same as !(obj is String)
    print("Not a String")
}
else {
    print(obj.length)
}
```
- **Unsafe cast operator as**
- val x: String = y as String
- **Safe Cast operator as?**
- val x: String? = y as String?
- **Nullable cast Operator as**
- val x: String? = y as? String
## Operators
- Here is the complete list of bitwise operations (available for Int and Long only):  
- **shl(bits)** – signed shift left (Java's <<)  
- **shr(bits)** – signed shift right (Java's >>)  
- **ushr(bits)** – unsigned shift right (Java's >>>)  
- **and(bits)** – bitwise and  
- **or(bits)** – bitwise or  
- **xor(bits)** – bitwise xor  
- **inv()** – bitwise inversion  
 
Here is a short overview of what each function accepts and returns:
  
**SAME PARAMETER	DIFFERENT RESULT**
**it 	     also      	let
**this	    apply	    run, with**  
- I was not particularly happy with the decision of standard library designers putting so many similar functions in, as they represent cognitive overload spm.kotlin.world.when analyzing the code. However, if you strictly use them for their intended purpose, they will state your intent and make the code more readable:

## Scope Functions
- For more details follow **https://kotlinlang.org/docs/reference/scope-functions.html**
## also
- additional processing on an object in a call chain  

## apply
- post-construction configuration  

## let 
- conversion of value  

## run
- execute lambdas with side-effects and no result  

## with 
- configure objects created somewhere else  

## takeIf and takeUnless
- When called on an object with a predicate provided, takeIf returns this object if it matches the predicate. Otherwise, it returns null. So, takeIf is a filtering function for a single object. 
- In turn, takeUnless returns the object if it doesn't match the predicate and null if it does. The object is available as a lambda argument (it).

- Be careful when using these functions to avoid potential problems. Do not use with on nullable variables. 
- Avoid nesting apply, run, and with, as you will not know the current this. For nested also and let, use a named parameter instead of it for the same reason. 
- Avoid it in long call chains, as it is not clear what it represents.
- For examples, please follow the link below  
**https://dzone.com/articles/examining-kotlins-also-apply-let-run-and-with-intentions**

**The operations on floating point numbers discussed in this section are:**    

Equality checks: a == b and a != b  
Comparison operators: a < b, a > b, a <= b, a >= b  
Range instantiation and range checks: a..b, x in a..b, x !in a..b  

**Arrays**  
Arrays in Kotlin are represented by the Array class, that has get and set functions (that turn into [] by operator overloading conventions), and size property, along with a few other useful member functions:  
// Creates an Array<String> with values ["0", "1", "4", "9", "16"]  
val asc = Array(5, { i -> (i * i).toString() })  
    
**String**    
Now we can use """ for below  
val text = """  
    for (c in "foo")  
        print(c)  
"""  
Or
this type of String also  
val text = """  
    |Tell me and I forget.  
    |Teach me and I remember.  
    |Involve me and I learn.  
    |(Benjamin Franklin)  
    """.trimMargin()  
**Note** By default | is used as margin prefix, but you can choose another character and pass it as a parameter, like trimMargin(">").  
  
## Control Flow: if, spm.kotlin.world.when, for, while
  
## If Expression  
- In Kotlin, if is an expression, i.e. it returns a value. Therefore there is no ternary operator (condition ? then : else), because ordinary if works fine in this role.  
- For Example  
// Traditional usage   
```
var max = a   
if (a < b) max = b  
  
// With else   
var max: Int  
if (a > b) {  
    max = a  
} else {  
    max = b  
}  
```   
- As expression   
```val max = if (a > b) a else b```
- if branches can be blocks, and the last expression is the value of a block:  
```
val max = if (a > b) {  
    print("Choose a")  
    a  
} else {  
    print("Choose b")  
    b  
}  
```
- **NOTE - If you're using if as an expression rather than a statement (for example, returning its value or assigning it to a variable), the expression is required to have an else branch. **  
  
## WHEN  
- When replace the switch statement of java. Now spm.kotlin.world.when is more flexible and more powerful as compared to Switch.
- Using **when** we can also compare more than one condition in one case
- Instead of switch case we use spm.kotlin.world.when clause in kotlin. When is more powerful and dynamic in nature as compared to switch. We can declare multiple conditions in one case. The syntax is as follows
```  
when(value){
case 1 ->{
}
case 2->{
}
else{
// this is nothing but the default condition in switch case
}} 
```
- Example  
```
when(a){
in 1..10 ->{
print(" $a is in the range 1 to 10")
}

a is String ->{
print(" $a is a string")
}
else {
print(" none of the above condition")
}
}  
```  
- One more example with return type.  
```
fun describe(obj: Any): String =  
    when (obj) {
        1          -> "One"  
        "Hello"    -> "Greeting"  
        is Long    -> "Long"  
        !is String -> "Not a string"  
        else       -> "Unknown"  
    }  
```      
- this spm.kotlin.world.when clause will return a string.
  
## For Example 
- 
```
when (x) {
    1 -> print("x == 1")  
    2 -> print("x == 2")  
    else -> { // Note the block  
        print("x is neither 1 nor 2")  
    }  
}
   when (x) {
    0, 1 -> print("x == 0 or x == 1")  
    else -> print("otherwise")  
}    
```  
- We can use arbitrary expressions (not only constants) as branch conditions  
```
when (x) {
    parseInt(s) -> print("s encodes x")  
    else -> print("s does not encode x")  
}    
```  
- We can also check a value for being in or !in a range or a collection:  
```
when (x) {
    in 1..10 -> print("x is in the range")
    in validNumbers -> print("x is valid")
    !in 10..20 -> print("x is outside the range")
    else -> print("none of the above")
}
```   
## For Loops 
- for loop iterates through anything that provides an iterator. This is equivalent to the foreach loop in languages like C#. The syntax is as follows:    
- ```for (item in collection) print(item)``` 
- The body can be a block. 
```
for (item: Int in ints) {  
    // ...  
}  
```  
- You can use range operator    
```
for (i in 1..3) {  
    println(i)  
} 
```
- You can use reverse and step as well
```
for (i in 6 downTo 0 step 2) {  
    println(i)  
}   
  
//sampleStart  
for (i in array.indices) {  
    println(array[i])  
} 
```
- You can iterate index and value of a array
```
val array = arrayOf("a", "b", "c")  
//sampleStart  
for ((index, value) in array.withIndex()) {  
    println("the element at $index is $value")  
}  
```  
## Return And Jumps
- **return** By default returns from the nearest enclosing spm.kotlin.world.function or anonymous function.
- **break** Terminates the nearest enclosing loop.  
- **continue** Proceeds to the next step of the nearest enclosing loop.  

## Break and Continue Labels
```  
loop@ for (i in 1..100) {  
    for (j in 1..100) {  
        if (...) break@loop  
    }  
}    
```  
- Labeled break 
```
fun foo() {  
    listOf(1, 2, 3, 4, 5).forEach lit@{  
        if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop  
        print(it)  
    }  
    print(" done with explicit label")  
} 
```   
  
## Classes and Objects
A class in Kotlin can have a primary constructor and one or more secondary constructors. The primary constructor is part of the class header: it goes after the class name (and optional type parameters).  
  
class Person constructor(firstName: String) {  
}  

**NOTE**  
**If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted:

class Person(firstName: String) {  
} 
**NOTE-** The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.  
  
**Secondary Constructors**  
The class can also declare secondary constructors, which are prefixed with constructor:  
  
class Person {  
    constructor(parent: Person) {  
        parent.children.add(this)  
    }  
}    

**NOTE** If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor, either directly or indirectly through another secondary constructor(s). Delegation to another constructor of the same class is done using the this keyword:  
  
class Person(val name: String) {   
    constructor(name: String, parent: Person) : this(name) {  
        parent.children.add(this)  
    }  
}  
  
**NOTE:Note that code in initializer blocks effectively becomes part of the primary constructor**  
**NOTE-** If you want to declare a constructor as private , then u can declare as below  
class DontCreateMe private constructor () {  
}  
**NOTE:** you can declare constructor with defalut parameters,  
class Customer(val customerName: String = "SIbaprasad"){  
  init{  
    println(customerName)
    }
  }
in the above case, if we will not pass any value to the constructor, it will assign the default value  
var cons = Customer()// it will print SIbaprasad  
var cons = Customer("Mohanty")// it will print Mohanty  
  
**Class Members**  
Classes can contain:  
  
1) Constructors and initializer blocks  
2) Functions  
3) Properties  
4) Nested and Inner Classes  
5) Object Declarations  
  
## Inheritance  
All classes in Kotlin have a common superclass Any, that is the default superclass for a class with no supertypes declared:   
class Example // Implicitly inherits from Any   
  
**Note:** Any is not java.lang.Object; in particular, it does not have any members other than equals(), hashCode() and toString(). Please consult the Java interoperability section for more details.  
  
**NOTE : The open annotation on a class is the opposite of Java's final:**
open class Base(p: Int)  
  
class Derived(p: Int) : Base(p)  
  
**NOTE:** If the derived class has a primary constructor, the base class can (and must) be initialized right there, using the parameters of the primary constructor.  
  
If the class has no primary constructor, then each secondary constructor has to initialize the base type using the super keyword, or to delegate to another constructor which does that. Note that in this case different secondary constructors can call different constructors of the base type:    
  
class MyView : View {  
    constructor(ctx: Context) : super(ctx)  
  
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)  
}    
    
  
**Overriding Methods**  
  
As we mentioned before, we stick to making things explicit in Kotlin. And unlike Java, Kotlin requires explicit annotations for overridable members (we call them open) and for overrides:  
  
open class Base {  
    open fun v() {}  
    fun nv() {}  
}  
class Derived() : Base() {  
    override fun v() {}  
}    
  
## **Collections**    
Array is Mutable and fixed size
Note : There are 2 types of spm.kotlin.world.collections in Kotlin
1. imMutable Collection - Read Only Operation
    i.Immutable List - listOf
    ii.Immutable map - mapOf
    iii.immutable set - setOf  
    
2. Mutable Collection - read and Write Operation
    i. Mutable List  : ArrayList,arrayListOf,mutableListOf
    ii.Mutable Map   : HashMap,HashmapOf,MutableMapOf
    iii. Mutable Set : HashsetOf,mutableSetOf
    
How to define Array
var myArray:Array<Int>(5){0}  - all elements are zero
 
 myArray[0] = 123
 for(element in myArray){
 print(element)
 }
 
 ## Define List  
 var list:listOf<String>("Siba","Prasad","mohanty")   
 // this is immutable list,fixed in size. cant perform add or remove  
 list(1) = "asdas" // it will show error, we cant change   
 
 var mutableList:mutableListOf<String>("a","b","c")    
 // this is mutable list,can change sizee. can perform add or remove  
 mutableList.add("d")  
 mutableList.remove(0)  
 
 var listExample:arrayListOf<String>("india","Canada","uk")  
 // we can also declare mutable list like this  
 listExample.add("asdsad")  
 listExample.add("def")  
 
 we can perform all the operation in the mutable list  
 
 var mutableArrayList:Arraylist<String>("a","b","c")  
 
  ## **Define Map**  
  
  **immutable Map** 
  - cant change size of the map    
  - cant perform operation    
  - Fixed in size    
  **Example**  
    
  var immutableMap:mapOf<Integer,String>(2 to "two",3 to "three", 1 to "one")    
  immutableMap.put(1 to "12321") / it will show error   
    
   **Mmutable Map**  
  
  var mutableMapType1:HashMap<Integer,String>(2 to "two",3 to "three", 1 to "one")  
  mutableMapType1.put(3 to "sibaprasad")  
  mutableMapType1.replace(2 to "aaa")  
    
  var mutableMapType2:HashmapOf<Float,Integer>(2.2f to 2,3.5f to 7)    
    
  var mutableMapType3:MutableMapOf<String,String>("siba" to "prasad","prasad" to "mohanty", "abc" to "def")  
    
 **Now retrieve the map values**
 for(key in mutableMapType1.keys){  
  println("Element at $key is ${mutableMapType1[key]}")  
 }  
   
## **Define SET**  
set contains Unique Element
Hashset contains unique element  but cant gurrent of the sequence of element
 
 **Mutable Set**  
 var mutableSet:setOf<String>("a","b","c","dsadasdas")  // its can be read and write both
  var mutableSet:setOf<Integer>(1,2,3,12,3,4,5)
 mutableSet.remove(5)
 mutableSet.add(100)
 
 for(value i mutableSet){
 print("Value is $value")
 }  
   
 ## **Extension Function**  
 
 Kotlin extension functions will let us add new functions to existing classes that wouldn´t be able to be modified otherwise. We can, for instance, add a new method to an activity that let us show a toast in a much more simple nomenclature:  
 
 fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT){  
    Toast.makeText(this, message, duration) .show()  
 }  
 
 Explanation : To create a toast message, everytime we need to write the show method at the end of the spm.kotlin.world.function.
 But in the extension spm.kotlin.world.function we just write the spm.kotlin.world.function with extra default parameters like, duration and aded show method at the end
   
 Here it is another interesting example that will let me explain another interesting concept: reified types.  
   
inline fun <reified T : Activity> Activity.navigate(id: String) {  
    val intent = Intent(this, T::class.java)  
    intent.putExtra("id", id)  
    startActivity(intent)  
}  
 
Inline functions can use reified types, what means that we can recover the class from a type inside the spm.kotlin.world.function instead of having to pass the class type as an argument.
Inline functions are a bit different from regular functions. Inline functions will be substituted with its code during compilation, instead of really calling to a spm.kotlin.world.function. It will simplify some situations. For instance, if we have a spm.kotlin.world.function as an argument, a regular spm.kotlin.world.function will internally create an object that contains that spm.kotlin.world.function. On the other hand, inline functions will substitute the code of the spm.kotlin.world.function in the place where its called, so it won´t require an internal object for that.
 
  
 
 
 
 
 
