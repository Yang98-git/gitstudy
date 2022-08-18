package com.bjpowernode.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
把第一个程序改进为循环方式

缺点：
    一次读取一个字节，内存和硬盘交互太频繁，时间资源都耗费
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\CS\\JAVA\\老杜进阶资料及源代码\\JP\\temp");

            /*while (true){
                int readData = fis.read();
                if (readData == -1){
                    break;
                }
                System.out.println(readData);
            }*/

            // 改造while循环
            int readData = 0;
            while ((readData = fis.read()) != -1){
                System.out.println(readData);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
