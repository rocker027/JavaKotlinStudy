package com.coors

fun main(args: Array<String>) {
    // Kotlin String不為null
    // ?允許為null !!允許nullPointExcetion
    var s : String? = null
    if (s == null) {
        println("我是null")
        println(s!!.length)
    } else {
        println(s?.length)
    }

    println(s?.get(3))
    println(s?.substring(3))
}