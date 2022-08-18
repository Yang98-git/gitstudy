package com.bjpowernode.java.threadsafe2;
/*
    银行账户
        使用线程同步机制，解决线程安全问题
 */
public class Account {
    private  String actno;
    private double balance;
    Object obj = new Object(); // 实例变量，（Account对象是多线程共享的，其中的实例变量也是共享的）

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 取款方法
    public void withdraw(double money){
        // 局部变量，每次都会new一个对象，不是共享对象
        Object obj2 = new Object();

        // 以下这几行代码，必须是线程排队
        // 一个线程执行结束之后，另一个线程才能进来
        // obj是共享的
        // 写“abc”也可以，在字符串常量池当中，所有线程都会同步，t1t2t3t4t5
        // this 只有共享一个对象才同步，t1t2同步，t3异步
        synchronized(this) {
            double before = this.getBalance();
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }

    }
}
