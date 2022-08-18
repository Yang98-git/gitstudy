package com.bjpowernode.java.annotation;

@MyAnnotation
public class AnnotationTest01 {

    @MyAnnotation
    private int no;

    public AnnotationTest01(){}

    public static void m1(){
        @MyAnnotation
        int i = 100;
    }

    public void m2(@MyAnnotation String name){}
}
