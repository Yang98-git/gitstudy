package com.bjpowernode.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
int  read(byte[] b)
    一次最多读取b.length个字节
    减少硬盘和内存的交互，提高程序效率
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 相对路径，从当前所在位置开始寻找
            // IDEA默认的当前路径在哪？工程Project的根，就是IDEA默认当前路径
            //fis = new FileInputStream("tempfile");
            //fis = new FileInputStream("chapter23IO流\\tempfile2");
            //fis = new FileInputStream("chapter23IO流\\src\\tempfile3");
            fis = new FileInputStream("chapter23IO流\\src\\com\\bjpowernode\\java\\io\\tempfile4");

            // 读文件，采用byte数组，一次读取多个字节，最多读取b.length个字节
            byte[] bytes = new byte[4]; // 准备一个长度为4的byte数组

            // 读取到的字节数量，不是字节本身
            int readCount = fis.read(bytes);
            System.out.println(readCount); // 第一个读到了4个字节

            // 将字节数组全部转换成字符串
            //System.out.println(new String(bytes)); // abcd

            // 不应该全部转换，应该读到多少转多少
            System.out.println(new String(bytes, 0, readCount)); // 读了4个转4个

            readCount = fis.read(bytes); // 第二次只能读到2个字节，剩余的两个字节
            System.out.println(readCount);
            // 将字节数组全部转换成字符串
            //System.out.println(new String(bytes)); // efcd
            System.out.println(new String(bytes, 0, readCount)); // 读了2个转2个

            readCount = fis.read(bytes); // 一个字节都读不到，-1
            System.out.println(readCount);

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
