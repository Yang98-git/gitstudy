package com.bjpowernode.java.threadsafe3;
/*
    银行账户
        不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题
 */
public class Account {
    private  String actno;
    private double balance;

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
    /*
    在实例方法上使用synchronized, 如果此处，锁的就一定是this，没得挑，不灵活
    整个方法体同步，可能会扩大同步范围，降低程序
    好处：只有节俭代码
    如果共享的对象就是this，并且需要同步的代码块就是整个方法体，那么可以这样写
     */
    public synchronized void withdraw(double money){

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
