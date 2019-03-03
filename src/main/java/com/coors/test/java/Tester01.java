package com.coors.test.java;

public class Tester01 extends TesterJava {
    private String sex;

    public Tester01(String name, int age) {
        super(name, age);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
