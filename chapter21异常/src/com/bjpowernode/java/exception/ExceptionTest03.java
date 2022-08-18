package com.bjpowernode.java.exception;

public class ExceptionTest03 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*System.out.println(100 / 0);
        System.out.println("Hello World!");*/

        // main方法调用doSome()方法
        // 因为doSome()方法声明位置上有：throws ClassNotFoundException
        // 我们在调用doSome()方法时必须对此异常进行预先处理
        // 如果不处理，编译器报错a
        doSome();

    }

    /**
     * 表示doSome()方法在执行过程中，有可能出现ClassNotFoundException异常
     * 此异常直接父类为：Exception,属于编译时异常，需要处理
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!!!!");
    }
}
