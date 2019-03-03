package com.coors.test.java;

public abstract class TesterJava {
    String name;
    int age;

    public TesterJava(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getName();
    public abstract int getAge();
}
