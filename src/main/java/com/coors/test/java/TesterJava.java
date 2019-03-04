package com.coors.test.java;

public abstract class TesterJava {
    private String name;
    private int age;

    public TesterJava(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //    public abstract String getName();
//    public abstract int getAge();
}
