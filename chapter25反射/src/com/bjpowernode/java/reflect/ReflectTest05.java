package com.bjpowernode.java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
反射Student类当中的所有Field
 */
public class ReflectTest05 {
    public static void main(String[] args) {
        // 获取整个类
        Class studentClass = null;
        try {
            studentClass = Class.forName("com.bjpowernode.java.bean.Student");
            System.out.println("完整类名：" + studentClass.getName());
            System.out.println("简类名：" + studentClass.getSimpleName());

            // 获取类中所有public的Field
            Field[] fields = studentClass.getFields(); // public Field
            System.out.println(fields.length); // 数组中只有一个元素
            // 取出这个Field
            Field f = fields[0];
            // 取出Field的名字
            String fieldName = f.getName();
            System.out.println(fieldName); // no

            System.out.println("=================================");

            // 获取所有的Field
            Field[] fs = studentClass.getDeclaredFields();
            System.out.println(fs.length); // 4

            // 遍历
            for (Field field : fs){
                // 获取属性修饰符
                int i = field.getModifiers(); // 返回的修饰符是一个数字，修饰符代号
                System.out.println(Modifier.toString(i));

                // 获取类型
                System.out.println(field.getType().getSimpleName());

                // 获取名字
                System.out.println(field.getName());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
