package com.coors.kotlin

import com.coors.Human
import com.coors.Person
import org.junit.Test
import org.junit.jupiter.api.Assertions

class PersonTest {
    @Test
    fun humanBmiTest() {
        val human = Human("coors",66.5f, 1.7f)
        Assertions.assertEquals((66.5f/(1.7f*1.7f)) , human.bmi())
    }

    @Test
    fun personBmiTest() {
        val person = Person()
        person.weight = 66.5f
        person.height = 1.7f

        Assertions.assertEquals((66.5f/(1.7f*1.7f)) , person.bmi())
    }
}