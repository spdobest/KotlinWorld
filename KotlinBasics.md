# Kotlin Basics
- Example from **https://www.youtube.com/watch?v=VEqhzCFmEQI&list=PLlxmoA0rQ-LwgK1JsnMsakYNACYGa1cjR&index=1**
## What is kotlin
- Its a statically typed language
- It is a JVM language
- It needs java virtual machine to execute its bytecode.
- Its fully interoperable with java
- Support to avoid NullPointer exception
- Supports immutability
- Object oriented Language
- Functional
  - You can pass a function as parameter to another function
  - Or, a function can return another function
- Less ceremony
  - No more boilerplates
  - Less code, more reslt
  - COde looks clean

## Evolution of Kotlin
- Started in july 2011
- Stable version Febuary 2016
## Types od apps that can be built using Kotlin
- Serverside apps ( Springboot, Vert.x, JFX, ktor )
- Android Development
- Web development(Kotlin JS)
- Desktop Application ( Java FX, TornadoTX )
- Native Development  ( Kotlin/Native Library )
## Installation and setup
- Install Jdk
- download intelJ idea, and start using kotlin in the IDE

## Hello World
- Create a kotlin file 
- Write
```
fun main(args: Array<String>){
  print("Hello World")
}
```
- Java deemands class files
- Kotlin needs JVM in runtime similar to java
- Does Kotlin creates a class internally
  - Yes, The kotlin compiler internally creates a class file which is loaded into memory for execution in runtime
- Once you will execute the kotlin file, it will create a .class file internally
- It will saved inside out/production/projectname/ filenamekt.class
- Its a compile code which is auto generated

## Quick Overview Of Basic Syntax
- Functions
- Variables
- Class
- Constructors
- Comments

## Variable
- var - Itmeans variable, the value can be change
- val - This is immutable, the value can not be change
- late init var - When you want to initialize the value later at the time of getting value
- const val - is used when the value is fixed, its not depend of compiler to execute, 
```
const val AGE = 31;
val ageOfPeron = getAge(1988)

fun getAge(year:Int) : Int {
  return 2020-year
}
```
- IN the above example the value of ageOfPerson depends at runtime and the value is constant.
- But the value of AGE is always similar before compilation
- **Lazy**
- **lazy()** is a function that takes a lambda and returns an instance of Lazy<T> which can serve as a delegate for implementing a lazy property: the first call to get() executes the lambda passed to lazy() and remembers the result, subsequent calls to get() simply return the remembered result.
```
  val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

fun main() {
    println(lazyValue)
    println(lazyValue)
}
```  

## Loop and control structure
- 
