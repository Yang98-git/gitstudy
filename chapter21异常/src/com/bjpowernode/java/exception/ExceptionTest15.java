package com.bjpowernode.java.exception;

// 测试MyStack
public class ExceptionTest15 {
    public static void main(String[] args) {
        // 创建栈对象
        MyStack stack = new MyStack();
        // 压栈
        try {
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            // 栈满了
            stack.push(new Object());
        } catch (MyStackOperationException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        //弹栈
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            // 栈已空
            stack.pop();
        } catch (MyStackOperationException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
