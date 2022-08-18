package 接口基础语法;

public class Test02 {
    public static void main(String[] args) {

        //多态，父类型引用指向子类型对象
        MyMath2 mm2 = new MyMathImpl();
        //调用接口中的方法（面向接口编程）
        int result1 = mm2.sub(10, 20);
        int result2 = mm2.sum(10, 20);
        System.out.println(result1);
        System.out.println(result2);
    }
}

interface MyMath2{

    double PI = 3.1415;
    int sum(int a, int b);
    int sub(int a, int b);
}

class MyMathImpl implements MyMath2{

    //如果一个非抽象类实现接口，必须将接口中所有方法全部实现（覆盖，重写）
    @Override
    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public int sub(int a, int b){
        return a - b;
    }

}
