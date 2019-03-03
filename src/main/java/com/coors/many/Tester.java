package com.coors.many;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Tester {
    public static void main(String[] args) {
        // mapTest();
        // setTest();
        // stackList();
        // arrayListTest();
        // arrayTest();
    }

    private static void mapTest() {
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        stocks.put("2330", "TSMC");
        System.out.println(stocks);
        for (String key : stocks.keySet()) {
            System.out.println(stocks.get(key));
        }
    }

    private static void setTest() {
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(8);
        set.add(7);
        System.out.println(set);

        for (int n : set) {
            System.out.println(n);
        }
    }

    /**
     * 堆疊
     */
    private static void stackList() {
        Stack<Integer> stacks = new Stack<>();
        stacks.push(0);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);

//        System.out.println(stacks.size());
        int times = stacks.size();
        for (int i = 0; i < times; i++) {
            System.out.println(stacks.pop());
        }
    }

    private static void arrayListTest() {
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add("");
        list.add(5);
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] =5;
        numbers[4] =3;

        int[] scores = {68, 88, 77, 99, 50};
        for (int i = 0; i < scores.length; i++) {
            System.out.println("index " + i + " : " + scores[i]);
        }
    }
}
