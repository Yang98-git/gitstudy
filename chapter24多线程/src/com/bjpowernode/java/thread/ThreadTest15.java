package com.bjpowernode.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask; // 属于java的并发包
/*
    实现线程的第三种方式，实现Callable接口
        优点：可以获取线程的返回结果
        缺点：效率较低，获取t线程时，当前线程受阻
 */
public class ThreadTest15 {
    public static void main(String[] args) {
        // 创建一个FutureTask对象
        // 需要给一个Callable的实现对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception { // call()方法就相当于是run方法，只不过这里有返回值
                // 线程执行一个任务，可能会有一个执行结果
                System.out.println("call begin");
                Thread.sleep(1000 * 10);
                System.out.println("call over");
                int a = 100;
                int b = 200;
                return a + b; // 自动装箱int --> Integer
            }
        });

        // 创建线程对象
        Thread t = new Thread(task);
        t.start();

        // 这里是main方法主线程
        // 在主线程中获取t线程的返回结果
        try {
            // get()方法的执行会导致当前线程的阻塞
            Object obj = task.get();
            System.out.println("线程执行结果：" + obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("hello world");

    }
}
