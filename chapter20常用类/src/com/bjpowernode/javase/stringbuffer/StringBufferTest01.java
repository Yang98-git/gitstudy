package com.bjpowernode.javase.stringbuffer;

/**
 * 进行字符串拼接使用StringBuffer或者StringBuilder
 *
 * 如何优化StringBuffer的性能？
 *      在创建StringBuffer时，尽可能给定一个初始化容量
 *      最好减少底层数组的扩容次数。预估一下，给一个大一些的初始化容量
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        // 创建一个初始化容量为16的byte[] 数组
        StringBuffer stringBuffer = new StringBuffer();

        // 拼接字符串统一调用append()方法，追加字符串
        // append() 如果满了，会自动扩容
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append(3.14);
        stringBuffer.append(true);
        System.out.println(stringBuffer);

        StringBuffer sb = new StringBuffer(100);
        sb.append("hello");
        sb.append("world");
        System.out.println(sb);

    }
}
