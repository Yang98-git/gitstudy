package com.bjpowernode.java.collection;

import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("张三");
        ts.add("李四");
        ts.add("王五");
        ts.add("赵六");
        ts.add("老八");

        for (String s : ts){
            // 按照字典顺序，升序排序
            System.out.println(s);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(100);
        ts2.add(233);
        ts2.add(3);
        ts2.add(343);
        ts2.add(54);

        for (Integer i : ts2){
            System.out.println(i);
        }
    }
}
