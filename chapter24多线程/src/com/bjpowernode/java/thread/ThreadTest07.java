package com.bjpowernode.java.thread;

/*
    sleep面试题
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        Thread t = new MyTread3();
        t.setName("t");
        t.start();

        // 调用sleep方法
        try {
            // 问题：这会让线程t进入休眠状态吗？
            t.sleep(5000); // Thread.sleep(); 执行还是变成这个
                                // 只会让当前线程睡眠，静态方法和对象无关
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello world");
    }
}

class MyTread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++){
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
