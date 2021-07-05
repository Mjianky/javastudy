package com.maojianguo.javase.String;

public class StringTest03 {
    public static void main(String[] args) {
        /*
        * 创建了三个对象：
        * 字符串常量池中一个"hello"
        * 堆内存中两个String对象
        * */
        String s1 = new String("hello");
        String s2 = new String("hello");
    }
}
