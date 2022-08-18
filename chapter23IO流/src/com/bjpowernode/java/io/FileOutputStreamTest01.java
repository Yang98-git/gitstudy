package com.bjpowernode.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
文件字节输出流，写文件
从内存到硬盘
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {

            // myfile文件不存在的时候会自动新建
            // 这种方式谨慎使用，会将原文件清空然后从新写入
            // fos = new FileOutputStream("myfile");

            // 以追加的方式在原文件末尾写入
            fos = new FileOutputStream("myfile", true);


            // 开始写
            byte[] bytes = {97, 98, 99, 100};
            // 将byte数组全部写出
            fos.write(bytes); // abcd

            // byte数组写一部分
            fos.write(bytes, 0, 2); // 再写出ab

            String s = "say Hello! my bro";
            // 将字符串转换成byte数组
            byte[] bs = s.getBytes();
            // 写
            fos.write(bs);

           // 写完时候，一定要记得刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
