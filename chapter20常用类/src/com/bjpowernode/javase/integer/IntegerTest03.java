package com.bjpowernode.javase.integer;

public class IntegerTest03 {
    public static void main(String[] args) {
        // 访问包装类的常量
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        Integer i1 = 100; // 自动装箱
        int i2 = i1; // 自动拆箱，Number类方法就用不着了
        System.out.println(i1);
        System.out.println(i2);

        System.out.println(i1 + 1); // 自动拆箱

        // a和b中的保存的内存地址不同
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b); // false
    }
}
