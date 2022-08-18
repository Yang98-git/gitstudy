package com.bjpowernode.java.thread;

/*
    强行终止一个线程的执行
 */
public class ThreadTest09 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable3(), "t");
        t.start();

        // 模拟5秒钟
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5秒之后，强行终止t线程
        //t.stop(); // 已过时，容易丢失数据


    }
}

class MyRunnable3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


