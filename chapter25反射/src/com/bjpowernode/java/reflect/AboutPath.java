package com.bjpowernode.java.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

/*
文件路径，获取绝对路径，前提是必须在src路径下
 */
public class AboutPath {
    public static void main(String[] args) {

        /*FileReader reader = null;
        try {
        // IDEA中当前路径是project的根，可移植性差
            reader = new FileReader("chapter25/classinfo2.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/

        // 通用路径，即使代码换位置了，这样编写也是通用的
        // 跨操作系统通用
        // 使用通用方式前提是：此文件必须在类路径下
        // src是类的根路径
        /*
        getContextClassLoader() 获取当前线程的类加载器对象
        getResource() 当前线程的类加载器默认从类的根路径下加载资源，文件就在根路径下,根路径作为起点
         */

        // 获取文件的绝对路径
        // 如果有中文或者空格，需要加toURI()

        String path = null;
        String path2 = null;
        try {
            path = Thread.currentThread().getContextClassLoader()
                    .getResource("classinfo2.properties").toURI().getPath();
            // 获取dp.properties文件的绝对路径
            path2 = Thread.currentThread().getContextClassLoader()
                    .getResource("com/bjpowernode/java/bean/dp.properties").toURI().getPath();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        System.out.println(path);
        System.out.println(path2);
    }
}
