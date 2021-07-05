package com.maojianguo.javase.exception;

public class ExceptionTest01 {
    public static void main(String[] args) throws ClassNotFoundException  {
        doSome();
    }

    public static void doSome() throws ClassNotFoundException {
        System.out.println("Do some!!");
    }
}
