package com.maojianguo.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        Date time = new Date(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
        System.out.println(sdf.format(time));
        Date time2 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        System.out.println(sdf.format(time2));
    }
}
