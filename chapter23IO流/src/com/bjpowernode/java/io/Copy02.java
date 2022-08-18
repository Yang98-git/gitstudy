package com.bjpowernode.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    使用FileReader和FileWriter进行拷贝，只能拷贝普通文本文件
 */
public class Copy02 {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            // 读
            reader = new FileReader("chapter23IO流/src/com/bjpowernode/java/io/Copy02.java");
            // 写
            writer = new FileWriter("Copy02.java");

            // 一边读一边写
            char[] chars = new char[1024 * 512]; // 1mb 1char = 2 kb
            int readCount = 0;
            while ((readCount = reader.read(chars)) != -1){
                writer.write(chars, 0, readCount);
            }

            // 刷新
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
