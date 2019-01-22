package com.coors;

public class Hello {
    public static void main(String[] args) {
        Person p = new Person();
        p.hello();
        p.setWeight(66.5f);
        p.setHeight(1.7f);
        System.out.println("BMI : " + p.bmi());
    }
}
