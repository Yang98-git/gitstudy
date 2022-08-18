package com.bjpowernode.java.thread;
/*
    实现线程的第一种方式：
        编写一个类，继承Thread,重写run方法
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        // main方法，这里的代码属于主线程，在主栈中运行
        MyThread mt = new MyThread();
        // 启动线程
        mt.start();

        // 这里的代码还是在主线程当中
        for (int i = 0; i < 1000; i++){
            System.out.println("主线程---->" + i);
        }

    }


}

class MyThread extends Thread{
    @Override
    public void run() {
        // 编写程序，这段程序运行在分支线程/分支栈中
        for (int i = 0; i < 1000; i++){
            System.out.println("分支线程---->" + i);
        }
    }
}
