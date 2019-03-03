package com.coors.io;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
        File file = new File("data.txt");
        // 檔案是否存在
        System.out.println(file.exists());
        // 絕對路徑
        System.out.println(file.getAbsolutePath());
        // 是否為資料夾
        System.out.println(file.isDirectory());

        try {
            FileInputStream fis = new FileInputStream(file);
//            BufferedInputStream bis = new BufferedInputStream(fis);
            int n = fis.read();
            System.out.println(n);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("message");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File open success");
    }
}
