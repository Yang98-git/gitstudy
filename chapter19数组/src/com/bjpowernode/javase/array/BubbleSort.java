package com.bjpowernode.javase.array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {35, 200, 77, 46 ,80, 120, 12};

        for (int i = arr.length - 1; i > 0; i--){ // 7个数据循环6次
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j+1]){
                    // 交换位置
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
