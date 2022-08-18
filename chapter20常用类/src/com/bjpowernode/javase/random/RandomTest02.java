package com.bjpowernode.javase.random;

import java.util.Arrays;
import java.util.Random;

/**
 * 随机生成5个不同的数，放到数组
 */
public class RandomTest02 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[5];

        // 默认值是0
        for (int i = 0; i< arr.length; i++){
            arr[i] = -1;
        }

        int index = 0;
        while (index < arr.length){
            int num = random.nextInt(6);
            if (!contains(arr, num)){
                arr[index++] = num; // 先赋值后自加1

            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static boolean contains(int[] arr, int key){

        // 有bug
        /*// 对数组升序
        Arrays.sort(arr);
        // 二分法查找
        return Arrays.binarySearch(arr, key) >= 0;*/
        for (int j: arr){
            if (j == key){
                return true;
            }
        }
        return false;

    }
}
