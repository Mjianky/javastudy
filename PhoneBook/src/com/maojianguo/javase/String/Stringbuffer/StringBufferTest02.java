package com.maojianguo.javase.String.Stringbuffer;

/*
*   频繁使用字符串拼接
*   使用StringBuffer,StringBuilder
* */
public class StringBufferTest02 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append(true);
        System.out.println(stringBuffer);
    }
}
