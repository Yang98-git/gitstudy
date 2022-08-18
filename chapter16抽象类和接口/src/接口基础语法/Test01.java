package 接口基础语法;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(MyMath.PI); //访问接口常量
        //MyMath.PI = 3.141556; 常量不可以修改

    }
}

interface A{

}

interface B{

}

interface C extends A, B{ //接口支持多继承

}

interface MyMath{

    //常量
    //public static final double PI = 3.1415;
    //public static final 也可省略不写
    //接口内随便写一个都是常量
    double PI = 3.1415;

    //public abstract int sum(int a, int b);
    //public abstract 可以省略不写
    int sum(int a, int b); //接口内的抽象方法，抽象方法没有方法体

    int sub(int a, int b);
}


