package com.bjpowernode.java.io;

import com.bjpowernode.java.bean.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/*
    反序列化集合
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("users"));

            // 反序列化集合
            List<User> userList = (List<User>) ois.readObject();

            for (User users : userList){
                System.out.println(users);
            }


        } catch (FileNotFoundException e) {
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
