package com.maojianguo.javase.array;

import java.util.Arrays;

public class ArraysTest02 {
    public static void main(String[] args) {
        int[] arr = {1,23,4124,23,32,13,45,15,66};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //二分法查找
        int index = Arrays.binarySearch(arr,1000);
        System.out.println(index);
        System.out.println((index < 0?"该数不存在":"该数存在"));
    }
}
