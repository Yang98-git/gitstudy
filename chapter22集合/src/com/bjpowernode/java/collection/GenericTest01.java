package com.bjpowernode.java.collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        /*// 不使用泛型的缺点
        List myList = new ArrayList();

        // 准备对象
        Cat c = new Cat();
        Bird b = new Bird();

        // 将对象添加到集合当中
        myList.add(c);
        myList.add(b);

        // 遍历集合，分别让他们实现自己的方法
        *//*Iterator it = myList.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            if (obj instanceof Cat){
                Cat cat = (Cat)obj;
                cat.catchMouse();
            }else if (obj instanceof Bird){
                Bird bird = (Bird) obj;
                bird.fly();
            }
        }*//*

        // 遍历集合，取出每个Animal，让它move
        Iterator it = myList.iterator();
        while (it.hasNext()){
            // 没有使用泛型，迭代器取出的是Object类型，需要强制类型转换
            Object obj = it.next();
            if (obj instanceof Animal){
                Animal a = (Animal) obj;
                a.move();
            }
        }*/

        // 使用泛型
        // 使用泛型<Animal>之后，表示list集合中只允许存储Animal类型的数据
        // 用泛型来指定集合中存储的数据类型
        List<Animal> myList = new ArrayList<>();
        // myList.add("asdf");

        // 准备对象
        Cat c = new Cat();
        Bird b = new Bird();

        // 将对象添加到集合当中
        myList.add(c);
        myList.add(b);

        // 迭代
        // 泛型，表示迭代器迭代的是Animal类型
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            // 使用泛型，迭代器直接返回Animal类型，不需要强制类型转换，Animal父类方法不用转型
            Animal a = it.next();
            a.move();
            // 如调用子类特有方法还是需要转型
            if (a instanceof Cat){
                Cat cat = (Cat) a;
                cat.catchMouse();
            }else if (a instanceof Bird){
                Bird bird = (Bird) a;
                b.fly();
            }
        }
    }
}

class Animal {
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal {
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}

class Bird extends Animal {
    public void fly(){
        System.out.println("鸟儿在飞翔！");
    }
}
