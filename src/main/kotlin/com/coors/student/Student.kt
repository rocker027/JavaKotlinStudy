package com.coors

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    val stu = Student("rocker", 99, 100)
    println("最高分為 : ${stu.getHighest()}")
    stu.print()
    Student.printTest()
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

class GraduateStudent(name: String, english: Int, math: Int , thesis : Int ) : Student(name, english, math) {
    companion object {
        var pass = 70
    }

    override fun print() {
            println(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" +
                    if (getAverage() > pass) {
                        "PASS"
                    }else{
                        "FAILED"
                    }
            )
        }
}

// open 代表可以開放給繼承使用
/*
   存取修飾子
   預設不寫為 public
   private 此類別
   protected 此類別 + 子類別
   internal module  (1. intelliJ 模組 2. Maven專案 3. Gradle的srcSet )
 */
open class Student(var name: String, var english: Int, var math: Int) {
    // 等同於Java static 屬性與方法
    companion object {
        // static 屬性
        // 無增加@JvmStatic >> Java code調用此屬性時 com.coors.Student.Companion.getPass();
        // 增加@JvmStatic >> com.coors.Student.getPass();
        @JvmStatic
        var pass = 60

        @JvmStatic
        fun printTest() {
            println("我是static 方法喔")
        }
    }

    open fun print() {
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