package com.bjpowernode.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws Exception{
        Date nowTime = new Date();
        System.out.println(nowTime);

        // 1970/1/1 00:00:00 001
        Date dateTime2 = new Date(1); // 参数是毫秒
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf3.format(dateTime2)); // 1969-12-31 19:00:00 001 时差

        // 获取昨天的此时的时间
        Date dateTime3 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 *24);
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf4.format(dateTime3));

        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(nowTime));

        // String转成Date
        String time = "2008-08-08 08:08:08 888";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss SSS"); //里面的格式不能随便写，要和日期字符串格式相同
        Date date = sdf2.parse(time);
        System.out.println(date);

        // 获取自1970/1/1到当前系统时间的毫秒数
        // 1s = 1000毫秒
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);

        long begin = System.currentTimeMillis();
        print();
        long end  = System.currentTimeMillis();
        System.out.println("所耗费的时长" + (end - begin) + "毫秒");
    }

    // 统计一个方法执行所耗费的时长
    public static void print(){
        for (int i = 0; i < 1000; i++){
            //System.out.println("i = " + i);
        }
    }
}
