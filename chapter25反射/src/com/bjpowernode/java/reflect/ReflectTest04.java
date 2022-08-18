package com.bjpowernode.java.reflect;
/*
如果只希望一个类的静态代码块执行，可以使用Class.forName()

    JDBC需要
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            Class.forName("com.bjpowernode.java.bean.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
