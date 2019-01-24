package com.coors

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    val stu = Student("rocker", 99, 100)
    println("最高分為 : ${stu.getHighest()}")
    stu.print()

}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("請輸入學生姓名:")
    var name = scanner.next()
    print("請輸入學生英文成績:")
    var english = scanner.nextInt()
    print("請輸入學生數學成績:")
    var math = scanner.nextInt()

    Student(name, english, math).print()
}

class Student(var name: String, var english: Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" +
                if (getAverage() > 60) {
                    "PASS"
                }else{
                    "FAILED"
                }
        )
    }

    fun grading() = when(getAverage()){
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
             else -> 'F'
        }

    fun getAverage(): Int {
        return (english + math) / 2
    }

    fun getHighest(): Int {
        // version 1
//        var max = 0;
//        if (english > math) {
//            max = english
//        } else {
//            max = math
//        }
//        return max


        // version 2
//        var max = if (english > math) {
//            english
//        } else {
//            math
//        }
//        return max

        return if (english > math) {
            english
        } else {
            math
        }
    }
}