package spm.kotlin.world.objectAndClass.interfc

import kotlin.properties.Delegates

internal object  MyInterfaceMain1 {

    lateinit var testInit: String
    var testDelegate by Delegates.notNull<String>()
    @JvmStatic
    fun main(args: Array<String>) {

    }
}