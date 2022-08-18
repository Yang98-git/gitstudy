package com.bjpowernode.java.exception;

/**
 * 自定义异常：栈操作异常
 */
public class MyStackOperationException extends Exception{ // 编译时异常
    public MyStackOperationException() {
    }

    public MyStackOperationException(String message) {
        super(message);
    }
}
