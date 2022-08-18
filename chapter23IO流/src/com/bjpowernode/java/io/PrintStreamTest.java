package com.bjpowernode.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
    标准输出流，打印流。
    默认输出控制台
 */
public class PrintStreamTest {
    public static void main(String[] args) {

        // 联合起来写
        System.out.println("Hello World!");

        // 分开写
        PrintStream ps = System.out;
        ps.println("你好");
        ps.println("123");

        // 标准输出流不需要手动close()

        FileOutputStream fos = null;
        try {
            // 修改输出方向，将输出方向修改到”log“文件
            fos = new FileOutputStream("log");
            System.setOut(new PrintStream(fos));

            System.out.println("你好");
            System.out.println("你好");
            System.out.println("你好！！！");



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
