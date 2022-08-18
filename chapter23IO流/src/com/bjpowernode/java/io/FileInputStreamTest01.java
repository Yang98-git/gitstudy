package com.bjpowernode.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 创建文件字节输入流对象
            // 文件路径 F:\CS\JAVA\老杜进阶资料及源代码\JP\temp ，IDEA会自动变成双斜杠，因为单斜杠代表转义
            // 写成 /斜杠也是可以的，都是绝对路径
            fis = new FileInputStream("F:\\CS\\JAVA\\老杜进阶资料及源代码\\JP\\temp");

            // 读文档
            int readData = fis.read(); // 97 返回：读取到的字节本身
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData); // 98

            readData = fis.read();
            System.out.println(readData); // 99
            readData = fis.read();
            System.out.println(readData); // 100
            readData = fis.read();
            System.out.println(readData); // 101
            readData = fis.read();
            System.out.println(readData); // 102

            // 读到末尾，没有任何数据，返回-1
            readData = fis.read();
            System.out.println(readData); // -1


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 在finally语句块当中确保流一定关闭
            if (fis != null) { // 避免空指针异常
                // 关闭流的前提是：流不是空
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
