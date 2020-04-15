package spm.kotlin.world.objectAndClass.dataClss

import kotlin.properties.Delegates

internal object  MyDataClassMain1 {

    lateinit var testInit: String
    var testDelegate by Delegates.notNull<String>()
    @JvmStatic
    fun main(args: Array<String>) {

    }
}