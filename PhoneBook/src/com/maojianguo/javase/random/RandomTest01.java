package com.maojianguo.javase.random;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        Random r = new Random();
        int i1 = r.nextInt();
        System.out.println(i1);
        // i2 < 101;
        int i2 = r.nextInt(101);
        System.out.println(i2);
    }
}
