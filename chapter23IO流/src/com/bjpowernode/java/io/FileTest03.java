package com.bjpowernode.java.io;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        // File[] listFiles()
        // 获取当前目录下的所有子文件
        File f = new File("F:\\CS\\JAVA\\老杜进阶资料及源代码\\老杜零基础\\001-JavaSE课堂笔记+思维导图\\07-JavaSE进阶每日复习与笔记");
        File[] files = f.listFiles();

        for (File file : files){
            //System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
        }
    }
}
