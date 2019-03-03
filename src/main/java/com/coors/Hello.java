package com.coors;

import com.coors.test.java.Tester01;
import com.coors.test.java.TesterJava;

public class Hello {
    public static void main(String[] args) {
        Person p = new Person();
        p.hello();
        p.setWeight(66.5f);
        p.setHeight(1.7f);
        System.out.println("BMI : " + p.bmi());

        Student student = new Student("ro",100,89);


        TesterJava tester01 = new Tester01("coors", 20);
        System.out.printf(tester01.getName() + " , " + tester01.getAge());
        ((Tester01) tester01).setSex();
    }
}
