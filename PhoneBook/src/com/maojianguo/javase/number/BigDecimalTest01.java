package com.maojianguo.javase.number;

import java.math.BigDecimal;
/*
* 精度更高的数，用于财务数据
* */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);

    }
}
