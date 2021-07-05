package com.maojianguo.javase.exception;

public class MyStackTest {
    public static void main(String[] args) {

        MyStack ms = new MyStack(10);
        try {
            for (int i = 0; i <= 11; i++) {
                ms.push(new Object());
            }
        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }
        try {
            for (int i = 0; i < 11 ; i++) {
                ms.pop();
            }
        }catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
