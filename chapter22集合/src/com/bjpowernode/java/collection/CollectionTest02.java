package com.bjpowernode.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("hello");
        c.add("world");
        c.add(new Object());
        c.add(1);

        // 遍历/迭代集合
        // 获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();

        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }


    }
    }

