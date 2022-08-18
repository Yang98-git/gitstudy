package com.bjpowernode.javase.array;

public class ArrayTest02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1,2,3};
        printArray(a);

        //printArray({1,2,3});
        //如果直接传递一个静态数组
        printArray(new int[]{1,2,3});
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

}
