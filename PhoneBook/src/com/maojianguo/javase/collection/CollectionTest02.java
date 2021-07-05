package com.maojianguo.javase.collection;
import java.util.*;

public class CollectionTest02 {
    public static void main(String[] args) {
        //除Map以外的集合都能使用的迭代器
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add("100");
        c.add(new Object());
        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
