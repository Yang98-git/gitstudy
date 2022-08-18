package com.bjpowernode.java.thread;
/*
    分析程序有几个线程
        除垃圾回收线程之外，只有一个线程
        只有一个栈，没有分支栈
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }
    
    private static void m1(){
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() {
        System.out.println("m3 execute!");
    }
}
