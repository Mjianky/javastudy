package com.maojianguo.javase.random;

import java.util.Arrays;
import java.util.Random;

/*

    生成五个不重复的随机数，放到数组中；
* */
public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrays = new int[5];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = -1;
        }
        int index = 0;
        while (index < arrays.length) {
            int num = random.nextInt(101);
            if (!contains(arrays,num)) {
                arrays[0] = num;
                index++;
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    /**
     * 
     * @param arrays
     * @param key
     * @return
     */
    public static boolean contains(int[] arrays,int key) {
        Arrays.sort(arrays);
        return Arrays.binarySearch(arrays,key) >= 0;
    }
}
