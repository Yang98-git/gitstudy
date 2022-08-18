package com.bjpowernode.java.collection;

import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) {
        // 创建Properties对象
        Properties pro = new Properties();

        // 掌握两个方法，一个存，一个取
        pro.setProperty("username", "root");
        pro.setProperty("password", "123");
        pro.setProperty("password2", "1232");

        System.out.println(pro.get("password"));




    }
}
