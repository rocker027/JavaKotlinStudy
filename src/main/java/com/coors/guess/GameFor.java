package com.coors.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10) + 1;
        System.out.println("請輸入一個數字 : ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            int number = scanner.nextInt();
            System.out.println("第 " + i + " 次");
            if (number > secret) {
                System.out.println("低一點");
            } else if (number < secret) {
                System.out.printf("高一點");
            } else {
                System.out.printf("恭喜猜對!!");
            }
        }
        System.out.printf("結束");
    }
}
