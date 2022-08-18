package com.bjpowernode.java.collection;

import java.util.TreeSet;

/**
 * 对自定义的类型，可以排序吗？
 *      不可以
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        Person p1 = new Person(32);
        Person p2 = new Person(40);
        Person p3 = new Person(50);
        Person p4 = new Person(20);

        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p4);

        // 报错原因， Person类没有实现Comparable接口，类型转换异常
        /*for (Person p : personTreeSet){
            System.out.println(p);
        }*/

        for (Person p : personTreeSet){
            System.out.println(p);
        }
    }
}

// TreeSet中的元素需要实现Comparable接口和compareTo方法
// equals可以不写
class Person implements Comparable<Person>{
    int age;
    public Person(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    // 需要在这个方法中实现比较逻辑
    // k.compareTo(t.key),用参数k和集合中的每一个key比较
    @Override
    public int compareTo(Person o) {
        /*if (this.age == o.age){
            return 0;
        } else if (this.age > o.age){
            return 1;
        } else{
            return -1;
        }*/
        return this.age - o.age; // 升序
        // 1 换位置， -1 不换位置
        // return o.age - this.age; // 降序

    }
}
