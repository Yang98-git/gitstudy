package com.bjpowernode.javase.array;

/*
* 1. 分析main方法的(String[] args)的作用
*   JVM调用main方法的时候，会自动传一个String数组过来
* */

public class ArrayTest05 {
    public static void main(String[] args) {
        // JVM传递过来的String数组的长度是? 默认是0，初始化数组长度为0
        // 数组对象创建了，数组里面没有东西
        // args不是null
        System.out.println("JVM传递过来的String数组的长度是：" + args.length); // 0

        // 此数组是留给用户的，用户可以在控制台上输入参数，这个参数会自动被转换成String[] args
        // e.g. java ArrayTest05 abc def xyz
        // JVM会自动将abc def xyz通过空格的方式分离然后放到String[] args中
        // 变成{"abc", "def", "xyz"}

    }
}
