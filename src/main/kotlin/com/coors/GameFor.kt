package com.coors

import java.util.*

fun main(args: Array<String>) {
//    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10)+1
    for (i in 1..10 step 3) {
        println("請輸入數字 : ")
        var number = readLine()!!.toInt()
        println("第${i}次 $number")
        if (number > secret) {
            println("低一點")
        } else if (number < secret) {
            println("高一點")
        } else {
            println("恭喜猜對!!!")
            break
        }
    }
    print("結束")
    /**
    // 從n（最小值）到m（最大值）
    變數名稱 in <n>..<m>
    // 從n（最小值）到m（最大值），每次增加x
    變數名稱 in <n>..<m> step <x>

    // 從n（最小值）到m-1（最大值）
    變數名稱 in <n> until <m>
    // 從n（最小值）到m-1（最大值），每次增加x
    變數名稱 in <n> until <m> step <x>

    // 從n（最大值）到m（最小值）
    變數名稱 in <n> downTo <m>
    // 從n（最大值）到m（最小值），每次減少x
    變數名稱 in <n> downTo <m> step <x>
     */
}

fun forTest() {
    for (i in 1..5) {
        print(i)    // 顯示：12345
    }

    println()

    for (i in 1..5 step 2) {
        print(i)    // 顯示：135
    }

    println()

    for (i in 1 until 5) {
        print(i)    // 顯示：1234
    }

    println()

    for (i in 5..1) {   // 迴圈不會執行
        print(i)
    }

    println()

    for (i in 5 downTo 1) {
        print(i)    // 顯示：54321
    }

    println()

    for (i in 5 downTo 1 step 2) {
        print(i)    // 顯示：531
    }
}