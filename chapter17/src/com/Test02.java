package com;

import com.bjpowernode.javase.chapter17.HelloWorld;

public class Test02 {
    public static void main(String[] args) {
        //不在同一个包下，不能省略
        //com.bjpowernode.javase.chapter17.HelloWorld hw = new com.bjpowernode.javase.chapter17.HelloWorld();
        //使用import，导入需要的类
        HelloWorld hw = new HelloWorld();
        System.out.println(hw);

    }
}
