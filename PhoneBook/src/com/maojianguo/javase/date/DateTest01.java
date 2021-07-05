package com.maojianguo.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01  {
    public static void main(String[] args) throws Exception {
        Date nowTime = new Date();
        System.out.println(nowTime);//Mon Jun 28 14:07:37 CST 2021

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss sss");
        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);
        String time = "2008-8-8";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date dateTime = sdf2.parse(time);
        System.out.println(dateTime);
    }
}
