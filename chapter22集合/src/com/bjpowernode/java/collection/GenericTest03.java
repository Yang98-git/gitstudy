package com.bjpowernode.java.collection;

/**
 * 自定义泛型
 */
public class GenericTest03<A> {

    public void doSome(A o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        // new对象的时候指定了泛型String
        GenericTest03<String> gt = new GenericTest03<>();

        gt.doSome("a");
    }
}
