package com.bjpowernode.javase.chapter17;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        //Test03类和Scanner类不在同一个包下
        //java.util是Scanner类的包名
        //java.util.Scanner s  = new java.util.Scanner(System.in);
        //或者导包
        Scanner s = new Scanner(System.in);
        System.out.print("请输入内容：");
        String str = s.next();
        System.out.println("您的输入为：" + str);
    }
}
