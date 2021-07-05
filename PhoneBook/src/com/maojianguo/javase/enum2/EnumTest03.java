package com.maojianguo.javase.enum2;

import java.util.Scanner;

public class EnumTest03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(seasonDetermine(s.nextInt()));
    }

    private static Season seasonDetermine(int month) {
        if (month <= 0 || month >= 13)
            return Season.ERROR_ENTER;
        else if (month <= 2 || month == 12)
            return Season.WINTER;
        else if (month <= 5)
            return Season.SPRING;
        else if (month <= 8)
            return Season.SUMMER;
        else
            return Season.AUTUMN;
    }
}
