package objectAndClass.abstractClass

import kotlin.properties.Delegates

internal object  MyAbstractClassMain1 {

    lateinit var testInit: String
    var testDelegate by Delegates.notNull<String>()
    @JvmStatic
    fun main(args: Array<String>) {

    }
}