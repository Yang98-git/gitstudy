package com.bjpowernode.java.thread;
/*
    合理的终止一个线程的执行
 */
public class ThreadTest10 {
    public static void main(String[] args) {

        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r, "t");
        t.start();

        // 模拟5秒钟
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 终止t线程
        r.setRun(false);

    }
}

class MyRunnable4 implements Runnable{

    // 打布尔标记
    private boolean run = true;

    public void setRun(boolean run) {
        this.run = run;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            if (run){
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else{
                // return之前可以保存数据
                // 终止当前线程
                return;
            }

        }
    }
}
