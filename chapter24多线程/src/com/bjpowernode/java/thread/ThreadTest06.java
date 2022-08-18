package com.bjpowernode.java.thread;

import java.util.concurrent.ThreadLocalRandom;

/*
    sleep方法
 */
public class ThreadTest06 {
    public static void main(String[] args) {

        /*try {
            // 让当前线程休眠5秒
            // 当前线程是main
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5秒之后，执行此代码
        System.out.println("Hello World");*/

        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "---->" + i);

            // 循环一次睡眠2秒
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
