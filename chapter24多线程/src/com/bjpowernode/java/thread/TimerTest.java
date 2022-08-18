package com.bjpowernode.java.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
    使用定时器指定定时任务
 */
public class TimerTest {
    public static void main(String[] args) {
        // 创建定时器对象
        Timer timer = new Timer();
        //Timer timer = new Timer(true); // 守护线程

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date firstTime = sdf.parse("2022-05-04 15:34:00");

            // 指定定时任务
            timer.schedule(new LogTimerTask(), firstTime, 1000 * 10);

            // 使用匿名内部类
            /*timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    // 编写需要执行的任务
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String strTime = sdf.format(new Date());

                    System.out.println(strTime + ":完成了一次数据备份！");
                }
            }, firstTime, 1000 * 10);*/


        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}

// 编写一个定时任务类
class LogTimerTask extends TimerTask {

    @Override
    public void run() {
        // 编写需要执行的任务
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());

        System.out.println(strTime + ":完成了一次数据备份！");

    }
}
