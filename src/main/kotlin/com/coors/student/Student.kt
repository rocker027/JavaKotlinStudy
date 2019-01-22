package com.coors.student

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("請輸入學生姓名:")
    var name = scanner.next()
    print("請輸入學生英文成績:")
    var english = scanner.nextInt()
    print("請輸入學生數學成績:")
    var math = scanner.nextInt()

    Student(name , english , math ).print()
}

class Student(var name: String, var english: Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math)
    }

}