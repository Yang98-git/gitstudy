package com.bjpowernode.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExceptionTest07 {
    public static void main(String[] args) {
        /*try {
            FileInputStream fis = new FileInputStream("F:\\CS\\JAVA\\老杜进阶资料及源代码\\老杜零基础\\001-JavaSE课堂笔记+思维导图\\08-JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
        } catch(FileNotFoundException e) {
            System.out.println("文件不存在");
        }
        System.out.println("hello world!");*/


        // catch后面的类型可以是具体的异常类型，也可以是该异常的父类型
        // catch可以写多个，要精确的匹配异常
        /*try {
            FileInputStream fis = new FileInputStream("F:\\CS\\JAVA\\老杜进阶资料及源代码\\老杜零基础\\001-JavaSE课堂笔记+思维导图\\08-JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
        } catch(IOException e) { // 多态：IOException e = new FileNotFoundException();
            System.out.println("文件不存在");
        }
        System.out.println("hello world!");*/

        /*try {
            // 创建输入流
            FileInputStream fis = new FileInputStream("F:\\CS\\JAVA\\老杜进阶资料及源代码\\老杜零基础\\001-JavaSE课堂笔记+思维导图\\08-JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
            // 读文件
            fis.read();
        } catch(FileNotFoundException e) { // 多态：IOException e = new FileNotFoundException();
            System.out.println("文件不存在");
        } catch(IOException e) {
            System.out.println("文件报错了");
        }
        System.out.println("hello world!");*/

        /*try {
            // 创建输入流
            FileInputStream fis = new FileInputStream("F:\\CS\\JAVA\\老杜进阶资料及源代码\\老杜零基础\\001-JavaSE课堂笔记+思维导图\\08-JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
            // 读文件
            fis.read();
        } catch(IOException e) { // 多态：IOException e = new FileNotFoundException();
            System.out.println("文件不存在");
        } catch(FileNotFoundException e) { // 编译报错，上面IO为父类，等于上面已经捕捉过异常了，从小到大写异常
            System.out.println("文件报错了");
        }
        System.out.println("hello world!");*/

        try {
            // 创建输入流
            FileInputStream fis = new FileInputStream("F:\\CS\\JAVA\\老杜进阶资料及源代码\\老杜零基础\\001-JavaSE课堂笔记+思维导图\\08-JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
            // 数学运算
            System.out.println(100 / 0);
        } catch (FileNotFoundException | ArithmeticException | NullPointerException e){
            System.out.println("文件不存在？数学异常？空指针异常？都有可能");
        }




    }
}
