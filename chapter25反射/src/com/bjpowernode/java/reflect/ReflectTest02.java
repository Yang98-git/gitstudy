package com.bjpowernode.java.reflect;

import com.bjpowernode.java.bean.User;

public class ReflectTest02 {
    public static void main(String[] args) {

        // 不使用反射机制创建对象
        User user = new User();
        System.out.println(user);


        // 通过反射机制获取Class，通过Class来实例化对象
        try {
            Class c = Class.forName("com.bjpowernode.java.bean.User");

            // newInstance()会调用User类的无参数构造方法,完成对象的创建
            // 重点是：newInstance()调用无参构造，必须保证无参构造存在
            Object obj = c.newInstance(); // c代表User类型

            System.out.println(obj); // com.bjpowernode.java.bean.User@4eec7777 User对象内存地址
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
