package com.bjpowernode.java.thread;
/*
    唤醒一个睡眠的线程，并没有中断线程的执行而是终止线程的睡眠
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2(), "t");
        t.start();

        // 希望5秒之后，t线程醒来
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 中断t线程的睡眠
        t.interrupt(); // 会让正在睡眠的线程出异常，进入catch语句块

    }
}

class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "---> begin");
        // 睡眠1年
        // 只能try/catch，子类不能比父类抛出更多的异常，父类没有抛异常
        try {
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "---> end");
    }
}