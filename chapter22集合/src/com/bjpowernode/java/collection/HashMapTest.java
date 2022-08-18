package com.bjpowernode.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 1.HashMap底层是哈希表/散列表
 * 2.哈希表是一个数组和单向链表的结合体
 *
 */
public class HashMapTest {

    public static void main(String[] args) {
        // HashMap集合key部分的元素特点
        Map<Integer, String> map = new HashMap<>();
        // Integer是key，它的hashCode和equals都重写了
        map.put(1111, "张三");
        map.put(6666, "李四");
        map.put(7777, "王五");
        map.put(2222, "赵六");
        map.put(2222, "king");

        System.out.println(map.size()); // 4

        // 遍历Map集合
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        /*Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> node = it.next();
            System.out.println(node);
        }*/

        // HashMap集合key部分的元素，无序不可重复
        for (Map.Entry<Integer, String> node : entrySet){
            System.out.println(node.getKey() + "=" + node.getValue());
        }
    }

}
