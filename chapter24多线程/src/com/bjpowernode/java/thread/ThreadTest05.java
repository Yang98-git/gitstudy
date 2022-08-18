package com.bjpowernode.java.thread;

import javax.swing.plaf.TableHeaderUI;

/*
    1.获取当前线程对象
    2.获取线程对象名字
    3.修改线程对象名字
 */
public class ThreadTest05 {
    public static void main(String[] args) {

        // currentThread就是当前线程对象
        // 这个代码在main方法中，当前线程就是主线程
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName()); // main

        MyThread2 t1 = new MyThread2();

        // 设置线程名字
        t1.setName("t1");

        // 获取线程名字
        System.out.println(t1.getName()); // Thread-0; 默认线程名字

        MyThread2 t2 = new MyThread2();
        t2.setName("t2");
        System.out.println(t2.getName()); //Thread-1
        t2.start();


        // 启动线程
        t1.start();
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i< 100; i++){
            // 当t执行run方法，这个当前线程就是t1
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
