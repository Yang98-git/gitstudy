package com.bjpowernode.java.exception;

public class ExceptionTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a / b; //JVM执行到此处时会创建一个异常对象，并且JVM将new的异常对象抛出
        System.out.println(a + "/" + b + "=" + c);
    }

}
