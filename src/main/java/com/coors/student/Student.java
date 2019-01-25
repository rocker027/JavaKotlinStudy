package com.coors.student;

public class Student {
    private String id;
    private String name;
    private int english;
    private int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int getHighest() {
        // verison 1
//        int max = 0;
//        if (english > math) {
//            max = english;
//        } else {
//            max = math;
//        }
//        return max;

        // version 2
        return (english > math) ? english : math;
    }


    public int getAverage() {
        return (english + math) / 2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void print() {
        System.out.println(name + "\t" + english + "\t" + math);
    }
}
