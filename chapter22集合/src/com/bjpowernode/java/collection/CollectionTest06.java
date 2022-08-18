package com.bjpowernode.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的remove
 */
public class CollectionTest06 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        // 此时的迭代器指向没有元素的迭代器
        // 注意：集合结构只要发生改变，迭代器必须重新获取！
        // Iterator it = c.iterator();

        c.add(1); // Integer类型
        c.add(2);
        c.add(3);

        Iterator it = c.iterator();
        while (it.hasNext()){
            // next()方法返回值类型必须是Object
            // Integer i = it.next();
            Object obj = it.next();
            System.out.println(obj);
        }

        Collection c2 = new ArrayList();
        c2.add("abc");
        c2.add("def");
        c2.add("xyz");

        // 迭代过程中，不能调用集合对象的remove()方法，删除元素
        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            Object o = it2.next();
            // 删除元素
            // 删除元素之后，集合结构发生变化，应该重新获取
            // 出异常，集合中元素删除了，但是没有更新迭代器
            //c2.remove(o); 直接通过集合删除元素，没有通知迭代器，导致迭代器的快照和原集合不同

            // 迭代器中有remove
            // 迭代器remove时，会自动更新迭代器，并且更新集合（删除集合中的元素）
            it2.remove(); // 删除的是迭代器指向的当前元素
            System.out.println(o);
            System.out.println(c2.size());
        }
    }
}
