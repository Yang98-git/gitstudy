package com.bjpowernode.javase.array;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {35, 200, 77, 46 ,80, 120, 12};

        for (int i = 0; i < arr.length - 1; i++){ // 7个数据循环6次，把最小的数据放在左边
            // i正好是参加比较的数组中最左边的元素下标
            // i是一个参与比较的数据中的起点下标
            // 假设起点i的元素是最小的
            int min = i;
            for (int j = i+1; j < arr.length; j++){ // 内层循环是线性比较最小的数据
                if (arr[j] < arr[min]){
                    min = j; // 最小值元素下标变成j
                }
            }
            // 当i和min不相等时，交换位置
            if (min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
