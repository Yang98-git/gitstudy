package com.bjpowernode.java.io;

import java.io.File;
import java.io.IOException;

/*

 */
public class FileTest01 {
    public static void main(String[] args) {
        // 创建一个File对象
        File f1 = new File("D:/file");

        System.out.println(f1.exists());

        // 如果文件不存在，则以文件的型式创建出来
        /*if (!f1.exists()){
            try {
                // 创建文件
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        if (!f1.exists()){
            // 创建目录
            f1.mkdir();
        }

        File f2 = new File("D:/a/d/c/f");
        if (!f2.exists()){
            // 创建多重目录
            f2.mkdirs();
        }

        File f3 = new File("F:\\CS\\JAVA\\老杜进阶资料及源代码\\老杜零基础\\001-JavaSE课堂笔记+思维导图\\07-JavaSE进阶每日复习与笔记\\day21课堂笔记.txt");
        // 获取文件父路径
        System.out.println(f3.getParent());

        // 父路径以File型式返回
        File parentFile = f3.getParentFile();
        System.out.println("获取绝对路径：" + parentFile.getAbsolutePath());

        File f4 = new File("copy");
        System.out.println("绝对路径：" + f4.getAbsolutePath());

    }
}
