package com.maojianguo.javase.collection;

import java.util.*;
/*
* boolean add(Object) 往集合中添加元素
* int size()
* void clear()
* boolean contains()
* boolean remove();
* */
public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(100);
        System.out.println(c.size());
        c.clear();
        System.out.println(c.size());
        c.add("hello");
        System.out.println(c.contains("hello"));
        System.out.println(c.contains("world"));
        c.add(1);
        c.add(1);
        c.remove(1);
        Object[] arr = c.toArray();
        System.out.println(c);
        System.out.println(c.isEmpty());
        c.clear();
        System.out.println(c.isEmpty());
        for (Object i:arr) {
            System.out.println(i);
        }
    }
}
