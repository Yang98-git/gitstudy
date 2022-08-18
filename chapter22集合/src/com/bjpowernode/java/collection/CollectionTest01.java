package com.bjpowernode.java.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection中的常用方法
 *
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        // 创建一个集合对象
        //Collection c = new Collection(); 接口是抽象的，无法实例化

        // 多态
        Collection c = new ArrayList();
        // 测试Collection接口中的常用方法
        c.add(1200); // 自动装箱，实际上是放进去了一个对象的内存地址： Integer x = new Integer(1200);
        c.add(3.14);
        c.add(new Student());

        // 获取集合中元素的个数
        System.out.println("集合中元素的个数为：" + c.size()); // 3

        // 清空集合
        c.clear();
        System.out.println("集合中元素的个数为：" + c.size()); // 0

        c.add("hello");
        c.add("world");
        c.add("你好");
        c.add(1);

        System.out.println("集合中是否包含\"你好\":" + c.contains("你好"));
        System.out.println("集合中是否包含\"1\":" + c.contains(1));
        System.out.println("集合中是否包含\"2\":" + c.contains(2));

        System.out.println("集合中元素的个数为：" + c.size()); // 4

        // 删除元素
        c.remove(1);
        System.out.println("集合中元素的个数为：" + c.size()); // 3
        System.out.println("集合中是否包含\"1\":" + c.contains(1));

        System.out.println("集合是否为空：" + c.isEmpty());
        c.clear();
        System.out.println("集合是否为空：" + c.isEmpty());

        c.add("hello");
        c.add(true);
        c.add("你好");
        c.add(1);
        c.add(new Student());

        // 转换成数组
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length; i++){
            System.out.println(objs[i]);
        }

    }
}

class Student{

}
