package com.bjpowernode.java.collection.bean;

import java.util.HashSet;
import java.util.Set;

public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1 = new Student("张三");
        Student s2 = new Student("张三");

        // 没有重写equals，比较内存地址，false
        // System.out.println(s1.equals(s2));

        // 重写equals之后，true
        System.out.println(s1.equals(s2));

        // 没有重写hashCode，调用父类hashCode取得不同的内存地址
        /*System.out.println("s1的hashCode=" + s1.hashCode());
        System.out.println("s2的hashCode=" + s2.hashCode());*/

        // 重写hashCode之后，hashCode相同
        System.out.println("s1的hashCode=" + s1.hashCode());
        System.out.println("s2的hashCode=" + s2.hashCode());

        // s1.euqals(s2)是true，表示s1和s2是一样的，按理来说，只能放一个
        // 只重写了equals，没有重写hashCode，先判断hashCode，不同就直接放了
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        // 2, 先调hashCode，hashCode不同，所以放进去了
        //System.out.println(students.size());

        // 重写equls和重写hashCode之后
        System.out.println(students.size());//1

    }
}
