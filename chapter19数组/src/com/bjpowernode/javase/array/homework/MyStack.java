package com.bjpowernode.javase.array.homework;
/*
	编写程序，使用一维数组，模拟栈数据结构。
	要求：
		1、这个栈可以存储java中的任何引用类型的数据。
		2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
		3、在栈中提供pop方法模拟弹栈。（栈空了，也有有提示信息。）
		4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
		5、假设栈的默认初始化容量是10.（请注意无参数构造方法的编写方式。）
 */
public class MyStack {
    // Object类型数组可以存储任何引用类型数据
    private Object[] elements;

    // 栈帧
    private int index;

    public MyStack() {
        // 默认初始化是10
        this.elements = new Object[10];
        this.index = -1; // 在此赋值初始化和在private直接初始化是一样的，都是在创建对象的时候赋值
    }

    public void push(Object obj){ // 压栈
        if (this.index >= this.elements.length - 1){
            System.out.println("压栈失败，栈已满！");
            return;
        }
        this.index++;
        this.elements[index] = obj;
        System.out.println("压栈" + obj + "成功，栈帧指向" + this.index );
    }

    public void pop(){ // 弹栈
        if (this.index < 0){
            System.out.println("弹栈失败，栈已空！");
            return;
        }
        System.out.println("弹栈" + this.elements[this.index] + "成功！");
        this.index--;
        System.out.println("栈帧指向" + this.index);
    }

    // Getter and Setter
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}


