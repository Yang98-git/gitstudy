package com.bjpowernode.javase.array;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        int[] arr = {112,5,8,2,45,7894,547,6};

        // 工具类当中大部分方法都是静态的，直接才用类名调用不用创建对象
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
