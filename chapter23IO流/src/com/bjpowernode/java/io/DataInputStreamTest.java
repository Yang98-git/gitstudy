package com.bjpowernode.java.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    数据字节输入流
        DataOutputStream写的文件，只能使用DataInputStream去读。
        并且读的时候，需要提前知道写入的顺序，读写顺序一致，才可以取出数据
 */
public class DataInputStreamTest {
    public static void main(String[] args) {
        DataInputStream dis = null;

        try {
            dis = new DataInputStream(new FileInputStream("data"));

            // 开始读
            byte b = dis.readByte();
            short s = dis.readShort();
            int i = dis.readInt();
            long l = dis.readLong();
            float f = dis.readFloat();
            double d = dis.readDouble();
            boolean sex = dis.readBoolean();
            char c = dis.readChar();

            System.out.println(i + 1000);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
