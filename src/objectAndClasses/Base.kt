package objectAndClasses

 open class Base(val name: String) {
    init { println("Initializing Base") }
    open val size: Int =
            name.length.also { println("Initializing size in Base: $it") }
}