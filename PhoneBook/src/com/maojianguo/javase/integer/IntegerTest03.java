package com.maojianguo.javase.integer;
/*
* String ,int ,Integer互相转换
* */


public class IntegerTest03 {
    public static void main(String[] args) {

        //String --> int
        int i1 = Integer.parseInt("100");
        System.out.println(i1 + 1);

        //int --> String
        String s2 = i1 + "";
        System.out.println(s2 + 1);

        //String --> Integer;
        Integer i3 = Integer.valueOf("100");
        System.out.println(i3);

        //Integer --> String;
        System.out.println(String.valueOf(i3) + 1);

    }
}
