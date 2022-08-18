package com.bjpowernode.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * 1.Vector底层也是一个数组
 * 2.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(1);


        List myList = new ArrayList();

        // 转换成线程安全的
        Collections.synchronizedList(myList);

        // myList集合就是线程安全的
        myList.add("111");
        myList.add("112");
        myList.add("113");
    }
}
