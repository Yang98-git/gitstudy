package com.bjpowernode.java.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
    带有缓冲区的字符输入流
    使用这个流，不需要自定义char或byte数组，自带缓冲
 */
public class BufferedReadTest01 {
    public static void main(String[] args) throws Exception {

        FileReader reader = new FileReader("Copy02.java");
        // 一个流的构造方法中需要另一个流的时候，这个传进去的流叫做：节点流
        // 外部包装的这个流叫做：包装流，处理流
        // 此处，FileReader是节点流；BufferedRead是包装流/处理流

        BufferedReader br = new BufferedReader(reader);

        // 读一行
        /*String firstLine = br.readLine();
        System.out.println(firstLine);*/
        String s = null;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }

        // 关闭流，只需要关闭外层包装流。节点流会自动关闭
        br.close();
    }
}
