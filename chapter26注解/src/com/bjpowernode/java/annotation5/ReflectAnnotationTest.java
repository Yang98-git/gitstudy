package com.bjpowernode.java.annotation5;

public class ReflectAnnotationTest {
    public static void main(String[] args) {
        // 获取类
        try {
            Class c = Class.forName("com.bjpowernode.java.annotation5.MyAnnotationTest");

            // 判断类上面是否有@Annotation
            System.out.println(c.isAnnotationPresent(Annotation.class)); // true
            if (c.isAnnotationPresent(Annotation.class)){
                // 获取该注解对象
                Annotation annotation = (Annotation) c.getAnnotation(Annotation.class);
                System.out.println(annotation);

                // 获取注解对象的属性，和调接口类似
                System.out.println(annotation.value());

            }

            // 判断String类上是否存在@Annotation
            Class stringClass = Class.forName("java.lang.String");
            System.out.println(stringClass.isAnnotationPresent(Annotation.class)); // false




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
