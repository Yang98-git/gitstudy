package com.bjpowernode.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List特有的方法
 *      void	add(int index, E element)
 *      E	get(int index)
 *      int	indexOf(Object o)
 *      int	lastIndexOf(Object o)
 *      E	remove(int index)
 *      E	set(int index, E element)
 */
public class ListTest01 {
    public static void main(String[] args) {
        List myList = new ArrayList();

        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add(2);
        myList.add("C");

        // 在列表指定位置插入元素，底层数组，增删元素效率低
        myList.add(1,"KING");

        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println(myList.get(0));

        System.out.println("-----------------");

        // List集合可以使用下标遍历,Set没有
        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i).getClass());
            System.out.println(myList.get(i));
        }

        // 获取对象第一次出现的索引
        System.out.println(myList.indexOf("KING"));

        // 最后一次出现的索引
        System.out.println(myList.lastIndexOf("C"));

        // 根据下标删除元素
        myList.remove(0);
        System.out.println(myList.size()); // 5

        System.out.println("-----------------------------");

        // 修改指定位置元素
        myList.set(2,"Soft");

        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

    }
}
