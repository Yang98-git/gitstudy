package com.bjpowernode.java.reflect;

import java.util.Date;

/*
    操作一个类的字节码，首相要获取类的字节码，怎么获取java.lang.Class实例
        三种方式
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        /*
            Class.forName()
                1.静态方法
                2.方法参数是一个字符串
                3.字符串需要一个完整的类名，包名不可以省略
         */
        Class c1 = null;
        Class c2 = null;
        try {
            // 第一种：Class.forName()
            c1 = Class.forName("java.lang.String"); // c1代表String.class文件，或者代表String类型
            c2 = Class.forName("java.util.Date"); // c2代表Date类型
            Class c3 = Class.forName("java.lang.Integer");
            Class c4 = Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 第二种：java任何一个对象都有一个方法：getClass()
        String s = "abc";
        Class x = s.getClass(); // x代表String.class字节码文件，x代表String类型
        System.out.println(c1 == x); // true, 内存地址相同

        Date time = new Date();
        Class y = time.getClass();
        System.out.println(c2 == y); // true

        // 第三种：java中任何一种类型，包括基本数据类型，都有一种.class属性
        Class z = String.class; // z代表String类型
        Class k = Date.class;

        System.out.println(x == z); // true

    }
}
