package com.maojianguo.javase.String;

/*
    常用方法
* */

public class StringTest5 {
    public static void main(String[] args) {

        //charAt 返回char指定索引处的值
        char c = "中国人".charAt(1);
        System.out.println(c);//国

        //compareTo 按字典顺序比较两个字符串
        System.out.println("abc".compareTo("abc"));//0 ==
        System.out.println("abc".compareTo("abe"));//-2 <
        System.out.println("abc".compareTo("abb"));//1 >

            

    }
}
