package com.bjpowernode.java.annotation;

public class AnnotationTest03 {
    public static void main(String[] args) {

        AnnotationTest03.doSome();

        /*Class s  = Class.forName("java.lang.Stirng");
        s.newInstance();*/
    }

    @Deprecated
    public static void doSome(){
        System.out.println("do some");
    }
}

class T{
    public static void main(String[] args) {
        // doSome方法已过时
        AnnotationTest03.doSome();
    }
}
