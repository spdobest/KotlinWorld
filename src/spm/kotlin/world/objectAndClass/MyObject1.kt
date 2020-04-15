package spm.kotlin.world.objectAndClass

import kotlin.properties.Delegates

internal object  MyObject1 {

    lateinit var testInit: String
    var testDelegate by Delegates.notNull<String>()
    @JvmStatic
    fun main(args: Array<String>) {

    }
}