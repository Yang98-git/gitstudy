package com.bjpowernode.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
其他常用方法
    int available(): 返回流当中剩余的字节数量
    long skip(long n): 跳过几个字节不读
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("chapter23IO流/src/tempfile3");

            System.out.println("总字节数量：" + fis.available());

            // 读一个字节
            //int readByte = fis.read();
            // 还剩下可以读的字节数量是
            //System.out.println("剩下的字节数量：" + fis.available());

            // 不需要循环了
            //byte[] bytes = new byte[fis.available()]; // 不适合大文件，byte[]数组不能太大
            // 直接读一次就好了
            //int readCount = fis.read(bytes);
            //System.out.println(new String(bytes, 0 ,readCount));

            // skip
            fis.skip(3);

            System.out.println("跳过之后的总字节数：" + fis.available());

            byte[] bytes = new byte[fis.available()]; // 不适合大文件，byte[]数组不能太大
            // 直接读一次就好了
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes, 0 ,readCount));
            //System.out.println(fis.read());



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
