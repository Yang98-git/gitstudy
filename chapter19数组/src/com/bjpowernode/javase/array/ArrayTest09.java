package com.bjpowernode.javase.array;

public class ArrayTest09 {
    public static void main(String[] args) {
        int[][] a = {
                {100, 200, 300},
                {30, 20, 40, 50 ,60},
                {6, 7, 9, 1},
                {0}
        };

        System.out.println(a.length); // 4
        System.out.println(a[0].length); // 3

        int a00 = a[0][0];
        System.out.println(a00);

        System.out.println("===================");

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
