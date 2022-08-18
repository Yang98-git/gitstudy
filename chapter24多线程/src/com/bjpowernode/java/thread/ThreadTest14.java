package com.bjpowernode.java.thread;
/*
    守护线程
 */
public class ThreadTest14 {
    public static void main(String[] args) {
        Thread t = new BakDataThread();
        t.setName("备份数据的线程");

        // 启动线程之前，将线程设置成守护线程
        t.setDaemon(true);

        t.start();

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

class BakDataThread extends Thread{
    public void run(){
        int i = 0;
        // 即使是死循环，但是是守护线程，主线程结束后，守护线程自动结束
        while (true){
            System.out.println(Thread.currentThread().getName() + "-->" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}