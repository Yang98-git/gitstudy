package com.bjpowernode.java.annotation2;

public class MyAnnotationTest {

    // 如果一个注解当中有属性，那么必须给属性赋值，除非该属性使用default指定了默认值
    // 指定name属性的值
    @MyAnnotation(name = "jack", color = "red", age = 20)
    public void doSome(){

    }
}
