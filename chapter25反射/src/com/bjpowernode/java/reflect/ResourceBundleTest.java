package com.bjpowernode.java.reflect;

import java.util.ResourceBundle;

/*
java.util下提供了资源绑定器,获取属性配置文件的内容
    此方式，属性配置文件必须放到类路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        // 资源绑定器
        // 文件后缀必须是.properties
        // 写路径时，后缀不写
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");

        String className = bundle.getString("className");

        // 反射机制实例化对象
        try {
            Class c = Class.forName(className);

            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
