package com.bjpowernode.javase.random;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();

        // nextInt: 下一个数是101，即不包括101
        int num = random.nextInt(101);
        System.out.println(num);
    }
}
