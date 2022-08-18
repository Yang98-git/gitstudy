package com.bjpowernode.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr = {654,56,4,5,45,58,6,8};

        for (int i: arr){
            System.out.println(i);
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");
        stringList.add("你好");

        // foreach循环
        for (String data : stringList){
            System.out.println(data);
        }
        System.out.println("====================");

        // 迭代器循环
        Iterator<String> it = stringList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=================");

        // 下标for循环
        for (int i = 0; i < stringList.size(); i++){
            System.out.println(stringList.get(i));
        }

    }
}
