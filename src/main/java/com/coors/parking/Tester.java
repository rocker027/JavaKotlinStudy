package com.coors.parking;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(2019, 1, 28, 13, 0);
//        LocalDateTime leave = LocalDateTime.of(2019, 1, 28, 15, 0);
        Car car = new Car("AAA-1234",enter);
//        car.setLeave(leave);
        car.leave();
        System.out.printf("Car Leave Time " + car.getLeave());
        System.out.printf("Car 總停留分鐘數 Time " + car.getDuration());


        // java8
//        java8();

//        dateTimeTest();
    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println("格林威治時間 : " + instant);
        // 本地時間
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other = LocalDateTime.of(2019, 1, 25, 8, 0);
        System.out.println(other);
    }

    private static void dateTimeTest() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s = "2019/01/25 08:00:00";
        Date other = null;
        try {
            other = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            other = new Date();
        }
        System.out.println(other);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 9);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }
}
