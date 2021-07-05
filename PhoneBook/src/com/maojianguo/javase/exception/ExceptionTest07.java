package com.maojianguo.javase.exception;

public class ExceptionTest07 {
    public static void main(String[] args) {
        MyException e = new MyException("用户名不能为空");
        String s = e.getMessage();
        System.out.println(s);
        e.printStackTrace();
    }
}
