package objectAndClass.delegate

import kotlin.properties.Delegates

internal object  My7DelegateMain1 {

    lateinit var testInit: String
    var testDelegate by Delegates.notNull<String>()
    @JvmStatic
    fun main(args: Array<String>) {

    }
}