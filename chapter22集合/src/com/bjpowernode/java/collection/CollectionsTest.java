package com.bjpowernode.java.collection;

import java.util.*;

/*
集合工具类
 */
public class CollectionsTest {
    public static void main(String[] args) {
        // ArrayList集合是非线程安全的
        List<String> list = new ArrayList<>();

        // 变成线程安全的
        Collections.synchronizedList(list);

        // 排序
        list.add("abc");
        list.add("abx");
        list.add("abcx");
        list.add("abb");

        Collections.sort(list);
        for (String s : list){
            System.out.println(s);
        }

        List<WuGui2> wuGui2s = new ArrayList<>();
        wuGui2s.add(new WuGui2(100));
        wuGui2s.add(new WuGui2(800));
        wuGui2s.add(new WuGui2(200));

        // list集合要排序，相应的类需要实现Comparable接口
        //Collections.sort(wuGui2s);

        Collections.sort(wuGui2s, new Comparator<WuGui2>() {
            @Override
            public int compare(WuGui2 o1, WuGui2 o2) {
                return o1.age - o2.age;
            }
        });
        for (WuGui2 wuGui2 : wuGui2s){
            System.out.println(wuGui2);
        }

        // 对Set集合怎么排序
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("kingsd");
        set.add("kingas");
        set.add("kingxe");

        // Set集合需要转成List集合
        List<String> setList = new ArrayList<>(set);
        Collections.sort(setList);

        for (String s : setList){
            System.out.println(s);
        }

    }
}

class WuGui2 implements Comparable<WuGui2>{
    int age;
    public WuGui2(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGui2{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(WuGui2 o) {
        return this.age - o.age;
    }
}
