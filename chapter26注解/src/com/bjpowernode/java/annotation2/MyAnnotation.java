package com.bjpowernode.java.annotation2;

public @interface MyAnnotation {

    /**
     * 在注解中定义属性
     * @return
     */
    String name();

    String color();

    int age() default 25;
}
