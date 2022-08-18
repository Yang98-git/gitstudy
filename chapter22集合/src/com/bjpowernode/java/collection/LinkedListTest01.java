package com.bjpowernode.java.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest01 {
    public static void main(String[] args) {
        List linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        Iterator it = linkedList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
