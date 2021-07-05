package com.maojianguo.javase.date;

/*
         System.out
         System.out.println()
         System.gc() 建议启用垃圾回收器
         System.currentTimeMillis()
         System.exit(0) 退出JVM
 */
public class DateTest02 {
    public static void main(String[] args) {
        /*
        当前时间与标准时间1970年1月1日午夜之间的时间差，以毫秒为单位。
        * */

        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);//1624861303629

        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("UseTime:" + (end - begin) + "ms");
    }

    private static void print() {
        for (int i = 0; i < 1000 ; i++) {
            System.out.println("i = " + i);
        }
    }
}
