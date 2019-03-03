package com.coors.kotlin

import java.util.*

data class Ticket(val origin: Int, val destination: Int, val price: Int)

fun main(args: Array<String>) {
    var ticket = Ticket(20, 50, 420)
    var s = "dadfjijid"
    println(s.validate())
    println((1..10).random())
    println(1..10)
}

fun String.validate(): Boolean {
    return this.length >= 6
}

fun IntRange.random(): Int {
    // 1 .. 10
    return Random().nextInt(endInclusive - start) + start
}