package com.bjpowernode.javase.array.homework;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(); // 创建对象，初始化容量是10个

        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object()); // 压栈失败，栈已满
        myStack.push(new Object());
        myStack.push(new Object());

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
    }
}
