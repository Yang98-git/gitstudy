package com.bjpowernode.java.io;

import java.io.*;

public class BufferedWriterTest {
    public static void main(String[] args) throws Exception {
        //BufferedWriter out = new BufferedWriter(new FileWriter("copy"));

        // 转换流
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy", true)));

        out.write("hello world!");
        out.write("\n");
        out.write("hello world!!!!");

        out.flush();
        out.close();

    }
}
