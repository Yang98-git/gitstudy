package com.bjpowernode.javase.integer;

/**
 * 1. java中为8种基本数据类型准备了8种包装类。包装类属于引用数据类型，父类是Object
 * 2. SUN公司已经写好包装类，我们可以直接使用
 *
 */
public class IntegerTest01 {
    public static void main(String[] args) {
        // 调用doSome()方法需要传一个数字，但数字属于基本数据类型
        // 所以可以传一个包装类进去

        // 把100这个数字经过构造方法包装成对象
        MyInt myInt = new MyInt(100);
        doSome(myInt);
    }

    public static void doSome(Object obj){
        // System.out.println(obj); // com.bjpowernode.javase.integer.MyInt@4eec7777
        System.out.println(obj); // 100
    }
}
