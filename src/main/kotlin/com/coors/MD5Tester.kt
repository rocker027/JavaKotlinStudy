package com.coors

import md5
import java.math.BigInteger
import java.security.MessageDigest

fun main(args: Array<String>) {
    val password = "123456"
    val md5 = MessageDigest.getInstance("MD5")
    // 16位元組
    println(md5.digest(password.toByteArray()))
    var bigi = BigInteger(md5.digest(password.toByteArray()))
    // 有正負號
    println(bigi)
    // 整數 1 , -1 負數
    bigi = BigInteger(1,md5.digest(password.toByteArray()))
    println(bigi)
    // 長度16
    println(bigi.toString(16))
    // 長度不足32，從頭補0
    println(bigi.toString(16).padStart(32,'0'))
    // 反之 長度不足32從尾巴補0
    println(password.padEnd(32,'0'))
    // 使用KT擴充String
    println(password.md5())
}