package com.coors;

import com.coors.student.Student;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StudentTest {

    @Test
    public void getAverageTest() {
        Student student = new Student("coors", 80 ,96);

        Assertions.assertEquals(88,student.getAverage());
    }

    @Test
    public void getHighestTest() {
        Student student = new Student("coors", 80 ,96);

        Assertions.assertEquals(96,student.getHighest());
    }
}
