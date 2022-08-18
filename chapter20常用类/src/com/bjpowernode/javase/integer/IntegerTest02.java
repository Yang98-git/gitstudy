package com.bjpowernode.javase.integer;

public class IntegerTest02 {
    public static void main(String[] args) {

        // 基本数据类型转成引用数据类型 （装箱）
        Integer i = new Integer(123);

        // 引用数据类型转成基本数据类型（拆箱）
        float f = i.floatValue();
        System.out.println(f); //123.0
    }
}
