package com.bjpowernode.java.threadsafe2;

public class AccountThread extends Thread{

    // 两个线程必须共享同一个账户对象
    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        // run方法的执行表示取款操作
        // 取款500
        double money = 5000;
        /*synchronized (act){ // 这样也可以，但是会扩大同步范围，影响效率
                              // 不能写this，此处this表示线程对象
            act.withdraw(money);
        }*/
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName() + "对" + act.getActno() + "取款"+ money +"成功，余额：" + act.getBalance());
    }
}
