package com.bjpowernode.java.collection;

import java.util.*;

/**
 *
 */
public class ArrayListTest01 {
    public static void main(String[] args) {

        // 底层先创建了一个长度为0的数组，当添加第一个元素时，默认初始化容量为10
        List list1 = new ArrayList();

        // 指定初始化容量
        List list2 = new ArrayList(20);

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        System.out.println(list1.size());

        list1.add(11);

        /*int newCapacity = ArraysSupport.newLength(oldCapacity,
                minCapacity - oldCapacity, *//* minimum growth *//*
                oldCapacity >> 1           *//* preferred growth *//*);*/

        // 100 二进制转十进制是 4， 右移一位，010二进制转十进制是 2
        // 原来是4，增长值是2，增长了1.5倍

        // 二进制右移一位，就是除以二
        System.out.println(10 >> 1);

        System.out.println("==================");

        Collection c = new HashSet();
        c.add(100);
        c.add(10);
        c.add(20);
        c.add(500);

        // ArrayList构造方法可以直接传一个集合
        List list3 = new ArrayList(c);
        Iterator it = list3.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
