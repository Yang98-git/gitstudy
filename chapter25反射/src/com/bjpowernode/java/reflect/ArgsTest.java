package com.bjpowernode.java.reflect;
/*
可变长度参数
    int... args
    语法: 类型... (一定是三个点)

    1.可变长度参数要求的个数是：0~N个
    2.可变长度参数在参数列表中必须在最后一个，并且只能有一个
    3.可以将可变长度参数当成数组来看
 */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10, 20);
        //m("abc"); 需要int类型

        m2(100);
        m2(100, "abc");
        m2(100, "abc", "def");

        m3("ab", "de", "kk", "ff");

        String[] strs = {"a", "b", "c"};
        // 也可以传数组
        m3(strs);

        m3(new String[]{"我", "好"});

    }

    public static void m(int... args){
        System.out.println("m方法执行了！");
    }

    //public static void m2(String... args, int args2){}

    // 可变长度参数必须在最后，只能有一个
    public static void m2(int a, String... args1){

    }

    public static void m3(String... args){
        // args是一个数组
        // 可以将可变长度参数当成数组来看
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }

}
