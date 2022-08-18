package com.bjpowernode.java.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    数据专属的流
        可以将数据连同数据的类型一起写入文件
        不是普通文本文档，记事本打不开
 */
public class DataOutputStreamTest {
    public static void main(String[] args) {
        // 创建数据专属的字节输出流
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("data"));
            // 写数据
            byte b = 100;
            short s = 200;
            int i = 300;
            long l = 400L;
            float f = 3.0F;
            double d = 3.14;
            boolean sex = false;
            char c = 'a';
            // 写
            dos.writeByte(b); // 把数据和数据类型一起写入文件
            dos.writeShort(s);
            dos.writeInt(i);
            dos.writeLong(l);
            dos.writeFloat(f);
            dos.writeDouble(d);
            dos.writeBoolean(sex);
            dos.writeChar(c);



            dos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
