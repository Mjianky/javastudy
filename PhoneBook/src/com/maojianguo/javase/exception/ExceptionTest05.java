package com.maojianguo.javase.exception;

public class ExceptionTest05 {
    public static void main(String[] args) {
        try {
            System.out.println(" hello");
            String s = null;
            s.toString();
            System.out.println("hello3");
            System.exit(0);
        }finally {
            System.out.println("hello2");
        }
//        System.out.println(); 无法执行
        System.out.println("m");
    }
}
