package com.maojianguo.javase.exception;

public class ExceptionTest06 {
    public static void main(String[] args) {
        int i = m();
        System.out.println(i);
    }

    private static int m() {
        int i = 100;
        try {
            return i;
        }finally {
            i = 300;
        }
    }
}
