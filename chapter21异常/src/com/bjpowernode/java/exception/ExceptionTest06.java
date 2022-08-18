package com.bjpowernode.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest06 {
    // 一般不建议在main方法上使用throws，如果这个异常发生，JVM只有终止程序
    // 一般main方法中的异常采用try..catch


    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
            // 以上代码出异常，直接进入catch中执行
            System.out.println("Hello World!");
        } catch (FileNotFoundException e) {
            // e引用保存的内存地址是new出来异常对象的内存地址
            System.out.println("文件不存在，可能路径错误或者已被删除！");
        }
        System.out.println("main over");
    }

    // 只要异常没有捕捉，而是采用上报的方式，此方法的后续代码不会执行
    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        // 以上代码出异常，这里是无法执行的
        System.out.println("m1 over");
    }

    // 抛FileNotFoundException的父类IOException, 也可以抛Exception, Exception包括所有的异常
    // 可以声明多个异常， “,”隔开
    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        // 以上代码出异常，这里是无法执行的
        System.out.println("m3 over");
    }

    private static void m3() throws FileNotFoundException {
        // 创建一个输入流对象，该流指向一个文件
        // 最终的异常方法中，若出现异常，直接结束方法
        new FileInputStream("F:\\CS\\JAVA\\老杜进阶资料及源代码\\老杜零基础\\001-JavaSE课堂笔记+思维导图\\08-JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
    }
}
