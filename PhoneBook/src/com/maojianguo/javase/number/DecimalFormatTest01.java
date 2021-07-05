package com.maojianguo.javase.number;

import java.text.DecimalFormat;

public class DecimalFormatTest01 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(1234.56);
        System.out.println(s);
    }
}
