package com.bjpowernode.java.threadsafe;

public class Test {
    public static void main(String[] args) {
        // 创建一个账户对象
        Account act = new Account("act-001", 10000);
        // 创建两个线程
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);

        t1.setName("t1");
        t2.setName("t2");

        // 启动线程取款
        t1.start();
        t2.start();

        System.out.println(act.getBalance());
    }
}
