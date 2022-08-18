package com.bjpowernode.java.annotation4;

public class AnnotationTest {

    // 如果数组只有一个元素，大括号可以不写
    @MyAnnotation(age = 25, email = {"nihao@gmail.com" , "sdfsdf@gmail.com"})
    public void doSome(){

    }
}
