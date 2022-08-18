package com.bjpowernode.java.io;

import com.bjpowernode.java.bean.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest01 {
    public static void main(String[] args) {

        // 创建java对象
        Student s  = new Student(1111, "jack");

        // 序列化
        ObjectOutputStream oos =null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("students"));

            // 序列化对象
            oos.writeObject(s);


            oos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
