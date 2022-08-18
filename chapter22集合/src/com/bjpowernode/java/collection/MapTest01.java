package com.bjpowernode.java.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Map接口中常用方法
 *      V	put(K key, V value)
 *      V	get(Object key)
 *      void	clear()
 *      boolean	containsKey(Object key)
 *      boolean	containsValue(Object value)
 *      boolean	isEmpty()
 *      Set<K>	keySet()
 *      V	remove(Object key)
 *      int size()
 *      Collection<V>	values()
 *      Set<Map.Entry<K,V>>	entrySet() 将Map集合转换成Set集合
 *
 *
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Integer i = new Integer(1) 自动装箱
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");
        map.put(4, "赵六");

        // 通过key获取value
        String value = map.get(2);
        System.out.println(value);

        // 获取键值对数量
        System.out.println("键值对数量：" + map.size()); // 4

        // 通过key删除
        map.remove(2);
        System.out.println("键值对数量：" + map.size()); // 3

        // 判断是否包含key或者value
        // contains方法底层调用equals进行比较，所以自定义的类型需要重写equals方法
        System.out.println(map.containsKey(2)); // f
        System.out.println(map.containsValue(new String("王五"))); // t

        // 获取所有的value
        Collection<String> values = map.values();
        for (String s : values){
            System.out.println(s);
        }

        // 清除
        map.clear();
        System.out.println("键值对数量：" + map.size()); // 0
        System.out.println(map.isEmpty()); // T

    }
}
