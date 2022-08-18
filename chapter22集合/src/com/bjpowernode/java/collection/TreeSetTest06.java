package com.bjpowernode.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet集合中可排序的第二种方式：使用比较器
 */
public class TreeSetTest06 {
    public static void main(String[] args) {
        // 创建TreeSet集合时，需要使用比较器
        // TreeSet<WuGui> wuGuis = new TreeSet<>(); 这样没有比较器，需要通过构造方法传递一个比较器

        // 给构造方法转递一个比较器
        // TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());

        // 可以使用匿名内部类，不写实现类也可以new接口，加上接口内方法的实现！！
        TreeSet<WuGui> wuGuis = new TreeSet<>(new Comparator<WuGui>() {
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o1.age - o2.age;
            }
        });

        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(800));
        wuGuis.add(new WuGui(750));
        wuGuis.add(new WuGui(950));

        for (WuGui wuGui : wuGuis){
            System.out.println(wuGui);
        }

    }
}

class WuGui {
    int age;
    public WuGui(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGui{" +
                "age=" + age +
                '}';
    }
}

// 单独编写比较器
// 比较器是java.util.Comparator接口；Comparable是java.lang包的
// 因为除匿名内部类外，接口不能被实例化，不能被new出来，所以需要一个接口的实现类
// 为什么不直接在WuGui类中直接实现Comparator接口，然后在需要传比较器的地方new一个WuGui？：
    //这样的话就没有分离比较规则，把需要比较的类和Comparator绑定死了
    //而且new一个WuGui分不清是对象还是接口的实现类
    //最好还是单独编写比较器的实现类，而且可以编写多个比较器的实现类每个都是不同的比较规则
class WuGuiComparator implements Comparator<WuGui> {

    @Override
    public int compare(WuGui o1, WuGui o2) {
        return o1.age - o2.age; // 升序
    }
}
