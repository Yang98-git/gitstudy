package com.bjpowernode.java.singlelinkedlist;



public class Test {
    public static void main(String[] args) {
        // 创建集合对象
        SingleLink singleLink = new SingleLink();

        singleLink.add(100);
        singleLink.add(200);
        singleLink.add(300);

        System.out.println(singleLink.size());

    }
}
