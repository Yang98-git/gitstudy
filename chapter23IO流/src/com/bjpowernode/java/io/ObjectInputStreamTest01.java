package com.bjpowernode.java.io;

import com.bjpowernode.java.bean.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    反序列化
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("students"));

            // 开始反序列化，读
            Student student = (Student) ois.readObject();
            System.out.println(student);


        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
