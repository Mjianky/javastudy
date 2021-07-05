package com.maojianguo.javase.enum2;

public class EnumTest01 {
    public static void main(String[] args) {
        System.out.println(divide(10,2));
        System.out.println(divide(10,0));
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean divide(int a, int b) {
        try {
            int c = a / b;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
