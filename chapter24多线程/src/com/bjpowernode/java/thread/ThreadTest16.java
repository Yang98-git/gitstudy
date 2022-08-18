package com.bjpowernode.java.thread;

import java.util.ArrayList;
import java.util.List;

/*
    1.使用wait和notify方法实现生产者和消费者模式
 */
public class ThreadTest16 {
    public static void main(String[] args) {
        // 创建一个仓库对象，共享的
        List list = new ArrayList();
        // 创建两个线程对象
        //生产者线程
        Thread t1 = new Thread(new Producer(list), "生产者");
        //消费者线程
        Thread t2 = new Thread(new Consumer(list), "消费者");

        t1.start();
        t2.start();
    }
}

// 生产线程
class Producer implements Runnable{
    // 仓库
    private List list;

    public Producer(List list){
        this.list = list;
    }
    @Override
    public void run() {
        // 一直生产(死循环)
        while (true){
            // 给仓库对象list加锁，仓库对象是共享的，需要加锁
            synchronized (list){ // 只有一个同步代码块可以执行
                if (list.size() > 0){ // 仓库已满
                    // 当前线程进入等待状态，生产线程等待，并且释放list集合的锁
                    // 如果不释放list集合的锁，消费者线程就无法操作
                    try {
                        // 仓库已满，生产者wait，释放锁，消费者线程可以执行
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 仓库已空，需要生产
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName() + "-->" + obj);

                // 唤醒消费者进行消费
                list.notify();
            }

        }
    }
}

// 消费线程
class Consumer implements Runnable{
    // 仓库
    private List list;

    public Consumer(List list){
        this.list = list;
    }

    @Override
    public void run() {
        // 一直消费
        while (true){
            synchronized (list){
                if (list.size() == 0){
                    try {
                        // 仓库已空，消费者wait
                        // 消费者线程等待，释放掉list集合的锁，生产线程执行
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 仓库已满，需要消费
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName() + "-->" + obj);

                // 唤醒生产者生产
                list.notify();

            }
        }
    }
}
