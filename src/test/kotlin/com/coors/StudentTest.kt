package com.coors.kotlin

import com.coors.student.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {

    @Test
    fun highestTest() {
        val student = Student("coors" , 80 , 96)
        Assertions.assertEquals(96,student.highest)
    }

    @Test
    fun averageTest() {
        val student = Student("coors" , 80 , 96)
        Assertions.assertEquals(88,student.average)
    }
}
