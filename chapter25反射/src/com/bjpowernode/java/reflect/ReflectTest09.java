package com.bjpowernode.java.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
反编译Method签名
 */
public class ReflectTest09 {
    public static void main(String[] args) {


        try {
            StringBuilder s = new StringBuilder();
            Class userServiceClass = Class.forName("com.bjpowernode.java.service.UserService");

            s.append(Modifier.toString(userServiceClass.getModifiers()) +" class "+ userServiceClass.getSimpleName() +" {\n");

            // 获取方法
            Method[] methods = userServiceClass.getDeclaredMethods();

            for (Method method : methods){
                s.append("\t");
                s.append(Modifier.toString(method.getModifiers()));
                s.append(" ");
                s.append(method.getReturnType().getSimpleName());
                s.append(" ");
                s.append(method.getName());
                s.append("(");

                // 获取形式参数列表
                Class[] parameterTypes = method.getParameterTypes();
                for (Class parameterType : parameterTypes){
                    s.append(parameterType.getSimpleName());
                    s.append(",");
                }

                if (parameterTypes.length != 0){
                    // 删除指定下标的字符
                    s.deleteCharAt(s.length() - 1);
                }


                s.append("){}\n");
            }

            s.append("}");
            System.out.println(s);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
