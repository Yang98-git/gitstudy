package com.bjpowernode.java.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
了解内容
    反射Method
 */
public class ReflectTest08 {
    public static void main(String[] args) {
        try {
            // 获取类
            Class userServiceClass = Class.forName("com.bjpowernode.java.service.UserService");
            // 获取所有的Method
            Method[] methods = userServiceClass.getDeclaredMethods();
            System.out.println(methods.length); // 2

            // 遍历Method
            for (Method method : methods){
                // 获取修饰符列表
                System.out.println(Modifier.toString(method.getModifiers()));

                // 获取方法的返回值类型
                System.out.println(method.getReturnType().getSimpleName());

                // 获取方法名
                System.out.println(method.getName());

                // 方法的形式参数列表，可能会有多个
                Class[] parameterTypes = method.getParameterTypes();
                for (Class parameterType : parameterTypes){
                    System.out.println(parameterType.getSimpleName());
                }
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
