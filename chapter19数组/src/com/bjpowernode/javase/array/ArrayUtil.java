package com.bjpowernode.javase.array;

/**
 * 数组工具类：自己写的
 */
public class ArrayUtil {
    public static int arraySearch(int[] arr, int ele) {
        int beginPos = 0;
        int endPos = arr.length - 1;

        while (beginPos <= endPos){
            int minPos = (beginPos + endPos) / 2;

            if (ele == arr[minPos]){
                return minPos;
            }else if (ele > arr[minPos]){
                beginPos = minPos + 1;
            }else if (ele < arr[minPos]){
                endPos = minPos - 1;
            }
        }

        return -1;

    }
}
