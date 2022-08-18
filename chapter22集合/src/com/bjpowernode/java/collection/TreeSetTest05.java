package com.bjpowernode.java.collection;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

/*
 先按照年龄升序，如果年龄一样再按照姓名升序
  */
public class TreeSetTest05 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();
        vips.add(new Vip("zhangsan", 20));
        vips.add(new Vip("lisi", 30));
        vips.add(new Vip("wangwu", 25));
        vips.add(new Vip("zhaoliu", 80));
        vips.add(new Vip("laoba", 20));

        for (Vip p : vips){
            System.out.println(p);
        }

    }
}

class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip() {
    }

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Vip o) {
        if (this.age == o.age){
            // 年龄一样，按字母顺序排序
            return this.name.compareTo(o.name);
        } else {
            return this.age - o.age;
        }
    }
}
