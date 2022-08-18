package com.bjpowernode.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
    IO + Properties联合应用
 */
public class IoPropertiesTest01 {
    public static void main(String[] args) {
        /*
        Properties是一个Map集合
        将userinfo文件的数据加载到Properties对象当中
         */

        // 创建一个输入流
        FileReader reader = null;
        try {
            reader = new FileReader("chapter23IO流/userinfo.properties");

            // 新建一个Map集合
            Properties pro = new Properties();

            // 调用Properties对象的load方法，把文件中的数据加载的Map集合当中
            pro.load(reader); // 等号左边做key，右边做value

            // 通过key获取value
            System.out.println(pro.getProperty("username"));
            System.out.println(pro.getProperty("password"));



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
