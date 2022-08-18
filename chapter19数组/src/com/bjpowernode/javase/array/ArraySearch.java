package com.bjpowernode.javase.array;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 77, 88 ,90, 120, 200};

        int index = ArrayUtil.arraySearch(arr, 1);
        System.out.println(index == -1? "该元素不存在" : "该元素下标是：" + index);

        System.out.println("============================");

        int[] arr1 = {35, 200, 77, 46 ,80, 120, 12};
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        int index1 = Arrays.binarySearch(arr1, 120);
        System.out.println(index == -1? "该元素不存在" : "该元素下标是：" + index1);





    }


}
