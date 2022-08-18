package com.bjpowernode.java.exam1;

// 面试题：doOther方法执行时需要等待doSome方法结束吗？
        // 不需要，doOther没有synchronized,不需要锁

public class Exam01 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();

        Thread t1 = new MyThread(mc, "t1");
        Thread t2 = new MyThread(mc, "t2");

        t1.start();
        try {
            Thread.sleep(1000); //此睡眠保证t1先执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

class MyThread extends Thread{
    private MyClass mc;

    public MyThread(MyClass mc , String name) {
        this.mc = mc;
        this.setName(name);
    }

    public void run(){
        if (Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}

class MyClass {
    // synchronized出现在实例方法上，锁this
    public synchronized void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}
