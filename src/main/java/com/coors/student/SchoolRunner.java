package com.coors.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
//        com.coors.Student.printTest();
        GraduateStudent gstu = new GraduateStudent("coors" , 50,30,70);
        gstu.print();
    }

    private static void userInput() {
        System.out.print("請輸入學生姓名:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("請輸入學生姓名英文成績:");
        int english = scanner.nextInt();
        System.out.print("請輸入學生姓名數學成績:");
        int math = scanner.nextInt();


        Student student = new Student(name , english , math);
        student.print();
        System.out.println("最高分 : " + student.getHighest());
    }
}
