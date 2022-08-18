package com.bjpowernode.java.reflect;

import com.bjpowernode.java.bean.Student;

import java.lang.reflect.Field;

/*
通过反射机制，访问对象属性
    给属性赋值set
    获取属性的值get
 */
public class ReflectTest07 {
    public static void main(String[] args) {
        // 不使用反射，访问对象的属性
        Student s = new Student();
        s.no = 111;
        System.out.println(s.no);

        // 使用反射访问对象属性（set,get）
        try {
            Class studentClass = Class.forName("com.bjpowernode.java.bean.Student");
            Object obj = studentClass.newInstance(); // 调用无参数构造方法创建Student对象

            // 获取no属性,根据属性名称获取Field
            Field noField = studentClass.getDeclaredField("no");

            // 给obj对象(Student对象)的no属性赋值
            noField.set(obj, 2222); // 给obj对象的no属性赋值2222

            // 只用改变配置文件

            // 读取属性的值
            System.out.println(noField.get(obj));

            // 访问私有属性
            Field nameField = studentClass.getDeclaredField("name");
            // 打破封装 (反射机制的缺点：打破封装，可能会给不法分子留下机会)，在外部也可以访问private属性
            nameField.setAccessible(true);
            // 给name属性赋值
            nameField.set(obj, "jackson");
            // 获取name属性的值
            System.out.println(nameField.get(obj));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
