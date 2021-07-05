package com.maojianguo.javase.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {

        Collection c = new HashSet();
        c.add("100");
        c.add(100);
        c.contains()
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
