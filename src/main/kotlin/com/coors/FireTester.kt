package com.coors

import java.io.File

fun main(args: Array<String>) {
    File("data.txt").bufferedReader().lines().forEach{
        println(it)
    }
    //    fileWriteKt()
}

private fun fileWriteKt() {
    File("outdata.txt").bufferedWriter().use {
        it.write("test kotlin io write1\n")
        it.write("test kotlin io write2\n")
        it.write("test kotlin io write3\n")
    }
}