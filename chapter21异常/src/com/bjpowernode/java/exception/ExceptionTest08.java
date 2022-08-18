package com.bjpowernode.java.exception;

public class ExceptionTest08 {
    public static void main(String[] args) {
        // 这里只是new了异常对象，但是没有抛出
        NullPointerException e = new NullPointerException("空指针异常");
        System.out.println(e.getMessage()); // 这个信息实际上就是构造方法上的String参数

        e.printStackTrace(); // 打应异常堆栈信息, 在实际的开发中建议使用这个，养成好习惯

        System.out.println("Hello World!");
    }
}
