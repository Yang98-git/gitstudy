package com.bjpowernode.javase.array;

/*数组扩容
先新建一个大容量的数组，然后将小容量数组中的数据一个一个拷贝到大数组中
扩容效率较低，因为涉及到拷贝的问题。所以在以后的开发中请尽可能的少进行数组的拷贝，
可以在创建数组对象的时候，预估一下多长合适，最好估计估计准确，这样可以减少数组扩容次数，提高效率
*/

public class ArrayTest08 {
    public static void main(String[] args) {
        // 数组拷贝
        int[] src = {1, 11, 22, 3, 4};
        int[] dest = new int[10];
        System.arraycopy(src, 0, dest, 0, src.length);

        for (int i = 0; i < dest.length; i++){
            System.out.println(dest[i]);
        }

        // 数组中是引用也可以拷贝，拷贝的是对象地址
    }
}
