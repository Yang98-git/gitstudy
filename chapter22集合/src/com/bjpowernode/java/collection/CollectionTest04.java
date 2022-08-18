package com.bjpowernode.java.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        String s1 = new String("abc");
        c.add(s1);

        String s2 = new String("def");
        c.add(s2);

        System.out.println("元素的个数：" + c.size());

        // 新建对象String
        String x = new String("abc");
        System.out.println(x.equals(s1)); // true

        // contains底层调用equals方法
        System.out.println(c.contains(x)); // true

    }
}
