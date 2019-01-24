package com.coors.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secret = getRandomNumber();
        System.out.println(secret);
        int number = 0;
        while (number != secret) {
            System.out.printf("請輸入一個數字： ");
            number = scanner.nextInt();
            if (number > secret) {
                System.out.println("要再低一點");
            } else if (number < secret) {
                System.out.println("要再高一點");
            } else {
                System.out.println("恭喜答對啦!!!");
            }
        }
    }

    private static int getRandomNumber() {
        return new Random().nextInt(10)+1;
    }
}
