package com.bjpowernode.java.exception;

public class ExceptionTest05 {
    // 第一种处理方式，继续上抛
    /*public static void main(String[] args) throws ClassNotFoundException {
        doSome();
    }*/

    // 第二种处理方式，try.. catch进行捕捉
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
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
