package com.maojianguo.javase.String.Stringbuffer;
/*
* 字符串拼接产生新的字符串，频繁使用回占用大量内存，
* 造成空间的浪费
* */
public class StringBuffer01 {
    public static void main(String[] args) {

        String s = "";
        for (int i = 0; i < 100; i++) {
            s += i;
            System.out.println(s);
        }
    }
}
