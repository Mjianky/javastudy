package com.maojianguo.javase.integer;

public class IntegerTest01 {
    public static void main(String[] args) {
        MyInt myInt = new MyInt(100);
        int i = 100;
        doSome(i);
        doSome(myInt);
    }

    public static void doSome(Object obj) {
        System.out.println(obj);
    }
}
