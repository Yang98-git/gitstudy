package com.bjpowernode.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历
 */
public class MapTest02 {
    public static void main(String[] args) {
        // 第一种方式：获取所有的key，通过遍历key，来遍历value
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");
        map.put(4, "赵六");

        // 遍历map
        // 先获取所有的key
        Set<Integer> keys = map.keySet();
        // 遍历key，获取所有的value

        // 迭代器
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("==================");
        // foreach
        for (Integer i : keys){
            String value = map.get(i);
            System.out.println(i + "=" + value);
        }

        System.out.println("===================");
        // 第二中方式：Set<Map.Entry<K,V>> entrySet()
        // 大数据量使用entrySet()，直接从node中获取key和value
        // 将Map集合转换成Set集合，Set集合中元素的类型是Map.Entry
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        // 遍历Set集合，每一次取出一个Node
        // 迭代器
        Iterator<Map.Entry<Integer, String>> it2 = entrySet.iterator();
        while (it2.hasNext()){
            Map.Entry<Integer, String> node = it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
            // System.out.println(it2.next());
        }
        System.out.println();

        // foreach
        for (Map.Entry<Integer, String> node : entrySet){
            Integer key = node.getKey();
            String value = node.getValue();
            //System.out.println(key + "=" + value);
            System.out.println(node);
        }



    }
}
