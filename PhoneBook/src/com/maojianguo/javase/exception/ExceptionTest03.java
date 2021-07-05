package com.maojianguo.javase.exception;

public class ExceptionTest03 {
    public static void main(String[] args) {

        NullPointerException e = new NullPointerException("空指针异常");
        String str = e.getMessage();
        System.out.println(str);
        //异步线程
        e.printStackTrace();
        System.out.println("hello world");
    }
}
