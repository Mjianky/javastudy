package com.maojianguo.javase.integer;
/*
*   int         Integer
*   char        Character
* Integer.parseInt
* */
public class IntegerTest02 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        /*
        * java中[-128,127]的包装对象提前创建好了，放在方法区的“整数型常量池”当中；
        *
        * */

        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y);//true
    }
}
