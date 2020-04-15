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

Type   Size(bits)  Min_value	        Max_value
Byte	 8	        -128	                127
Short	16	        -32768	                32767
Int	    32	     -2,147,483,648(-231)      2,147,483,647 (231 - 1)
Long	64	-9,223,372,036,854,775,808 (-263)	9,223,372,036,854,775,807 (263 - 1)



