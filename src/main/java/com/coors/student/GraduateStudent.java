package com.coors.student;

public class GraduateStudent extends Student {
    int thesis;
    static int pass = 20;

    public GraduateStudent(String name, int english, int math , int thesis) {
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        System.out.println(getName() + "\t" + getEnglish() + "\t" + getMath() + "\t" + getRank());
    }

    @Override
    public String getRank() {
        return getAverage() >= pass ? "Pass" : "FAILED";
    }
}
