package com.bjpowernode.java.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();

        stringSet.add("ABC");
        stringSet.add("Z");
        stringSet.add("Y");
        stringSet.add("Z");
        stringSet.add("K");
        stringSet.add("M");

        for (String s : stringSet){
            System.out.println(s);
        }
    }
}
