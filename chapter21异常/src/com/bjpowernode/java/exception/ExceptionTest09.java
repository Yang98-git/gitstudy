package com.bjpowernode.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // 在实际的开发中建议使用这个，养成好习惯
            // 从上往下看异常追踪信息

            System.out.println(e.getMessage()); // 获取普通的异常信息
        }

        // 这里程序不耽误执行，很健壮
        System.out.println("Hello World!");

    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("F:\\ 01-JavaSE课象.pdf");
    }
}
