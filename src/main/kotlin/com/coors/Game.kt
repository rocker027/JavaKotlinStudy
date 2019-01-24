package com.coors

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val secretNumber = getRandomNumber()
    var userInputNumber = 0
    while (userInputNumber != secretNumber) {
        print("請輸入1~10的數字 : ")
        userInputNumber = readLine()!!.toInt()
        if (userInputNumber > secretNumber) {
            println("再低一點")
        } else if (userInputNumber < secretNumber) {
            println("再高一點")
        } else {
            println("恭喜答對!!! $userInputNumber")
        }
    }
}

fun getRandomNumber() : Int {
    return Random().nextInt(10)+1
}