package com.maojianguo.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }

    private static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3(){
        System.out.println("m3 begin");
        try {
            new FileInputStream("D:\\BaiduNetdiskDownload\\004-异常作业\\day27作业.txt");
        }catch (FileNotFoundException e) {
            System.out.println("文件无法查找");
        }
        System.out.println("m3 over");

    }
}
