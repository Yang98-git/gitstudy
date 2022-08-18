package com.bjpowernode.java.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet集合：
 *      无序不可重复
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("100");
        stringSet.add("hello");
        stringSet.add("102");
        stringSet.add("你好");
        stringSet.add("104");
        stringSet.add("101");

        for (String s : stringSet){
            System.out.println(s);
        }
    }
}
