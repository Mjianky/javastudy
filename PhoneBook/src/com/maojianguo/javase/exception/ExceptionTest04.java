package com.maojianguo.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\BaiduNetdiskDownload\\004-异常作业\\day27作业.txt");
            String s = null;
            s.toString();
            System.out.println("111111");
            return;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("ni hao");
        }
        System.out.println("hello world");
    }
}
