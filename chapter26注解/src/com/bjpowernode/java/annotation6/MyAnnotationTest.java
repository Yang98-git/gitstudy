package com.bjpowernode.java.annotation6;

import java.lang.reflect.Method;

public class MyAnnotationTest {
    @MyAnnotation(username = "admin", password = "123")
    public void doSome(){}

    public static void main(String[] args) {
        // 获取方法上的注解信息

        // 先获取类
        try {
            Class c = Class.forName("com.bjpowernode.java.annotation6.MyAnnotationTest");

            // 获取方法
            Method doSomeMethod = c.getDeclaredMethod("doSome");

            // 判断方法是否有注解
            if (doSomeMethod.isAnnotationPresent(MyAnnotation.class)){
                // 获取该注解对象
                MyAnnotation myAnnotation = doSomeMethod.getAnnotation(MyAnnotation.class);
                // 获取注解对象的属性
                System.out.println(myAnnotation.username());
                System.out.println(myAnnotation.password());
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
