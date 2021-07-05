package com.maojianguo.javase.enum2;

public class EnumTest02 {
    public static void main(String[] args) {
        System.out.println(divide(10,1));
        System.out.println(divide(10,0));
    }

    public static Result divide(int a, int b) {
        try {
            int c = a / b;
            return Result.SUCCESS;
        } catch (Exception e) {
            return Result.FAIL;
        }
    }
}

enum Result {
    SUCCESS, FAIL
}