package com.bjpowernode.javase.integer;

public class MyInt {
    int value;

    public MyInt() {
    }

    public MyInt(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
