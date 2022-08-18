package com.bjpowernode.java.io;

import com.bjpowernode.java.bean.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
    序列化多个对象
        可以把对象放到集合当中，序列化集合
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(111, "jack"));
        userList.add(new User(222, "mike"));
        userList.add(new User(333, "rose"));

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("users"));

            // 序列化集合
            oos.writeObject(userList);

            oos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
