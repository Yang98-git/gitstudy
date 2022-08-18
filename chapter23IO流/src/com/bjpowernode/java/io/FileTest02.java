package com.bjpowernode.java.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
    File类的常用方法
 */
public class FileTest02 {
    public static void main(String[] args) {

        File f1 = new File("F:\\CS\\JAVA\\老杜进阶资料及源代码\\JP\\javase进阶\\copy");

        // 获取文件名
        System.out.println("文件名：" + f1.getName());

        // 判断是是否是目录/文件
        System.out.println(f1.isDirectory()); // f
        System.out.println(f1.isFile()); // t

        // 获取文件最后一次修改时间
        long haoMiao = f1.lastModified(); // 1970到现在的总毫秒数
        // 将总毫秒数转换成日期
        Date time = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(time));

        // 获取文件大小
        System.out.println(f1.length());
    }
}
