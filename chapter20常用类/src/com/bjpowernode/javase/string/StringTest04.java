package com.bjpowernode.javase.string;

/**
 * String类中的构造方法
 */
public class StringTest04 {
    public static void main(String[] args) {

        // 只掌握常用构造方法
        byte[] bytes = {97, 98, 99}; // 97是a，98是b，99是c
        String s2 = new String(bytes);

        // String类已重写toString()方法
        System.out.println(s2); // abc

        // 将byte数组中的一部分转换成字符串
        String s3 = new String(bytes, 1, 2);
        System.out.println(s3); // bc

        char[] chars = {'你','好','呀'};
        String s4 = new String(chars);
        System.out.println(s4);

        // 将char数组中的一部分转换成字符串
        String s5 = new String(chars, 1, 2);
        System.out.println(s5);
    }
}
