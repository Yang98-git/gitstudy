package com.bjpowernode.java.reflect;

import com.bjpowernode.java.bean.Vip;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
使用反射创建对象
 */
public class ReflectTest12 {
    public static void main(String[] args) {
        // 不使用反射创建对象
        Vip v1 = new Vip();
        Vip v2 = new Vip(110, "jack", "1998-09-17", true);

        // 使用反射创建对象
        try {
            Class vipClass = Class.forName("com.bjpowernode.java.bean.Vip");
            // 调用无参构造
            Object obj = vipClass.newInstance(); // 通过Class调用
            System.out.println(obj);

            // 调用有参构造
            // 先获取有参构造,根据形参列表区分不同的构造方法
            Constructor con = vipClass.getDeclaredConstructor(int.class, String.class,
                    String.class, boolean.class);
            //调用构造方法new对象
            Object obj2 = con.newInstance(110, "Mike", "1998-09-17", true);
            System.out.println(obj2);

            // 获取无参构造
            Constructor ncon = vipClass.getDeclaredConstructor();
            Object obj3 =  ncon.newInstance();
            System.out.println(obj3);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
