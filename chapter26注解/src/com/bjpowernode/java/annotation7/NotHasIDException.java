package com.bjpowernode.java.annotation7;
/*
自定义异常
 */
public class NotHasIDException extends Exception{
    public NotHasIDException() {
    }

    public NotHasIDException(String message) {
        super(message);
    }


}
