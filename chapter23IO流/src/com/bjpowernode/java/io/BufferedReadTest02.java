package com.bjpowernode.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/*
    转换流
 */
public class BufferedReadTest02 {
    public static void main(String[] args) throws Exception{

        /*// 字节流
        FileInputStream fis = new FileInputStream("Copy02.java");
        // 转换流转换,字节流转换成字符流
        InputStreamReader reader = new InputStreamReader(fis);

        // 这个构造方法只能传字符流，不能传字节流
        BufferedReader br = new BufferedReader(reader);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Copy02.java")));

        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        // 关闭最外层
        br.close();
    }
}
