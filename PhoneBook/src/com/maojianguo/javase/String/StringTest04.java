package com.maojianguo.javase.String;
/*
    String类中的构造方法
 */

public class StringTest04 {
    public static void main(String[] args) {

        //最常用
        String s1 = "hello world!";
        System.out.println(s1);


        //byte[] bytes
        byte[] bytes = {97,98,99};
        String s2 = new String(bytes);
        System.out.println(s2);

        String s3 = new String(bytes,1,2);
        System.out.println(s3);

        char[] chars = {'a','b','c'};
        String s4 = new String(chars);
        System.out.println(s4);

        String s5 = new String(chars,1,2);
        System.out.println(s5);
    }
}
