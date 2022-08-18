package com.bjpowernode.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件拷贝
FileInputStream + FileOutputStream
一边读，一边写，文件类型随意
 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 创建一个输入流对象
            fis = new FileInputStream("F:\\CS\\JAVA\\老杜进阶资料及源代码\\老杜零基础\\001-JavaSE课堂笔记+思维导图\\08-JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");

            // 创建一个输出流对象
            fos = new FileOutputStream("D:\\JavaSE进阶-01-面向对象.pdf");

            //重要！一边读一边写
            // 1024 byte = 1 kb
            // 1024 kb = 1 mb
            byte[] bytes = new byte[1024 * 1024]; // 一次读1mb
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1){
                // 读多少写多少
                fos.write(bytes, 0, readCount);
            }



            // 输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 分开try，如果一起try，上面的出异常，下面的关不了
           if (fis != null) {
               try {
                   fis.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
           if (fos != null) {
               try {
                   fos.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }

        }
    }
}
