package com.maojianguo.javase.String;

public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = s1 + "xy";
        System.out.println(s1);
        System.out.println(s2);
        String s3 = "abcdef";
        System.out.println(s1 == s3);
        String x = new String("abc");
        String y = new String("abc");
        System.out.println(x.equals(y));
        String k = new String("StringTest");
        System.out.println("StringTest".equals(k));
    }
}
