package com.bjpowernode.java.reflect;
/*
获取一个类的父类，和实现了哪些接口
 */
public class ReflectTest13 {
    public static void main(String[] args) {
        // String举例
        try {
            Class stringClass = Class.forName("java.lang.String");

            // 获取String的父类
            Class superClass = stringClass.getSuperclass();
            System.out.println(superClass.getName());

            // 获取String类实现的所有接口
            Class[] interfaces = stringClass.getInterfaces();
            for (Class in : interfaces){
                System.out.println(in.getName());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
