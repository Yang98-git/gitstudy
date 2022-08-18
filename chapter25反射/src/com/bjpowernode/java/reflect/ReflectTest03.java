package com.bjpowernode.java.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Properties;

/*
验证反射机制的灵活性
    不改变java代码，可以做到不同对象的实例化
    符合OCP开闭原则：对扩展开放，对修改关闭

    配置文件改动即可改变代码

后期要学习高级框架，高级框架实现原理都是反射，有利于理解框架底层原理
包括：ssh ssm
    Spring SpringMVC MyBatis
    ...
 */
public class ReflectTest03 {
    public static void main(String[] args) {
        // 通过IO流读取classinfo.properties文件
        //FileReader reader = null;
        InputStream reader = null;
        try {
            // 使用通用方法获取文件绝对路径
            /*String path = Thread.currentThread().getContextClassLoader().
                    getResource("classinfo2.properties").toURI().getPath();
            reader = new FileReader(path);*/

            // 以流的形式返回
            reader = Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("classinfo2.properties");

            //reader = new FileReader("chapter25反射/classinfo2.properties");

            // 创建属性类对象Map
            Properties pro = new Properties();
            // 加载
            pro.load(reader);


            // 通过key获取value
            String stringClass = pro.getProperty("className"); // User类名

            // 通过反射机制实例化对象
            Class c = Class.forName(stringClass); // c代表User类型

            Object obj = c.newInstance(); // 调用无参构造，创建对象
            System.out.println(obj);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } /*catch (URISyntaxException e) {
            e.printStackTrace();
        } */finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
