package com.bjpowernode.javase.string;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringTest05 {
    public static void main(String[] args) {
        // String类中的常用方法
        //（掌握） .char chatAt(int index)
        char c = "中国人".charAt(1); // 双引号括起来是一个对象，只要是对象就可以调用方法
        System.out.println(c);

        //（了解） .int compareTo(String anotherString)
        // 字符串比较大小
        int r = "abc".compareTo("abc");
        System.out.println(r); // 0

        int r2 = "abcd".compareTo("abce");
        System.out.println(r2); // -1 前小后大

        int r3 = "abce".compareTo("abcd");
        System.out.println(r3); // 1 前大后小

        //（掌握） .boolean contains(CharSequence s)
        // 判断前面的字符串是否包含后面的子字符串
        System.out.println("Yancy Xu".contains("Yan")); // true
        System.out.println("http://".contains("https://")); // false

        System.out.println("test.txt".endsWith("txt")); // T
        System.out.println("test.txt".startsWith("test")); // T


        // 比较字符串是否相等并且忽略大小写
        System.out.println("ABC".equalsIgnoreCase("abc")); // T

        byte[] bytes = "abcdef".getBytes(); // 将字符串对象转换成字节数组
        for (int i = 0; i < bytes.length; i++){
            System.out.println(bytes[i]);
        }

        // 判断某个子字符串在当前字符串中第一次出现处的下标
        System.out.println("javac++python".indexOf("c++")); // 4

        // 判断某个子字符串在当前字符串中最后一次出现处的下标
        System.out.println("javac++helloworldjava".lastIndexOf("java")); // 17

        // 判断字符串是否为空，不是null，null则会出现空指针异常
        String s = "sdfs";
        System.out.println(s.isEmpty());

        // 判断字符串长度
        System.out.println("abc".length()); // 3
        System.out.println("".length()); // 0

        // 替换字符串
        String newString = "http://www.google.com".replace("http://", "https://");
        System.out.println(newString);

        // 拆分字符串
        String[] date = "1998-09-17".split("-");
        for (int i = 0; i < date.length; i++){
            System.out.println(date[i]);
            // 可以继续向下拆分，通过”9“
        }

        // 截取字符串
        System.out.println("http://www.google.com".substring(7)); // www.google.com
        System.out.println("http://www.google.com".substring(7, 10)); // www, 10不包括

        // 转换成char数组
        char[] chars = "我是中国人".toCharArray();
        for (int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }

        // 转小写和大写
        System.out.println("ABCDEFG".toLowerCase());
        System.out.println("abcdefg".toUpperCase());

        // 去除字符串前后空白
        System.out.println("     hello     world      ".trim());

        // 将非字符串转换成字符串 String类中唯一一个静态方法，用类名调用
        String s1 = String.valueOf(true);
        String s2 = String.valueOf(3.14);
        System.out.println(s1);
        System.out.println(s2);

        // 如果是一个对象，会调用toString()方法，把对象转换成字符串
        String s3 = String.valueOf(new Customer());
        System.out.println(s3);








    }
}
class Customer{
    @Override
    public String toString() {
        return "I am a customer.";
    }
}
