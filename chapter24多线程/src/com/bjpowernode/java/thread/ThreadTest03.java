package com.bjpowernode.java.thread;
/*
    实现线程的第二种方式：
        编写一个类，实现Runnable接口
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        // 创建一个可运行的对象
        /*Runnable r1 = new MyRunnable();
        // 将可运行的对象封装成一个线程对象
        Thread t = new Thread(r1);*/

        Thread t = new Thread(new MyRunnable()); // 合并代码
        // 也可使用匿名内部类
        /*Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++){
                    System.out.println("分支线程2---->" + i);
                }
            }
        });*/

        // 启动线程
        t.start();

        for (int i = 0; i < 1000; i++){
            System.out.println("主线程---->" + i);
        }
    }
}

// 这不是一个线程类，是一个可运行的类，还不是一个线程
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("分支线程---->" + i);
        }
    }
}


