package com.bjpowernode.java.reflect;

import com.bjpowernode.java.service.UserService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
通过反射，调用一个对象的方法
 */
public class ReflectTest10 {
    public static void main(String[] args) {
        // 不使用反射机制调用方法
        // 创建对象
        UserService userService = new UserService();
        // 调用方法
        boolean loginSuccess = userService.login("admin", "123");
        System.out.println(loginSuccess ? "登录成功" : "登录失败");

        // 使用反射机制调用对象的方法
        try {
            Class userServiceClass = Class.forName("com.bjpowernode.java.service.UserService");
            // 创建对象
            Object obj = userServiceClass.newInstance();

            // 获取Method
            // 可能有同名方法，依靠方法名和参数列表区分
            Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
            Method logoutMethod = userServiceClass.getDeclaredMethod("logout");
            // 调用方法，对象/方法名/实际参数列表/返回值
            // 反射机制中重要的方法!!!!
            Object retVelue = loginMethod.invoke(obj, "admin", "123");
            System.out.println(retVelue);

            logoutMethod.invoke(obj);




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
