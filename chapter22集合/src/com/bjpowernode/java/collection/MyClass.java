package com.bjpowernode.java.collection;

import java.util.HashSet;
import java.util.Set;

public class MyClass {

    // 声明一个静态内部类
    private  static class InnerClass<K,V> {

        // 静态方法
        public static void m1() {
            System.out.println("静态内部类的m1方法执行");
        }

        // 实例方法
        public void m2(){
            System.out.println("静态内部类的实例方法执行！");
        }
    }

    public static void main(String[] args) {
        MyClass.InnerClass.m1();

        // 创建静态内部类对象
        MyClass.InnerClass mi = new MyClass.InnerClass();
        mi.m2();

        // Set集合中存储的对象是：MyClass.InnerClass类型
        Set<MyClass.InnerClass> set = new HashSet<>();

        // 因为Map (K:1   V:你好) 已经转成 Set (1=你好)
        // 有两个值，所以内部类也可以使用泛型
        Set<MyClass.InnerClass<Integer, String>> set3 = new HashSet<>();

        // 这个Set集合中存储的是字符串对象
        Set<String> set2 = new HashSet<>();
    }
}
