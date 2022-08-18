package 接口基础语法;

public class Test03 {
    public static void main(String[] args) {
        //多态
        Aa a = new D();
        //a.m2(); 报错，Aa接口中没有m2方法
        //调用其他接口中的方法，需要接口转转型
        Bb b = new D();
        Cc c = new D();

        //接口和接口之间没有继承关系也可强转
        //这个编译和运行都没有问题，a和b都有new D子类
        Bb b2 = (Bb)a;
        b2.m2();

        //也可以直接向下转型为D
        D d = (D)a;
        d.m2();

        M m = new E();
        //接口和接口之间没有继承关系也可强转，但是运行时可能出现ClassCastException异常
        //编译通过，运行报错
        //M new了E对象，E和K没有联系
        //K k = (K) m;
        if (m instanceof K){
            K k = (K)m;
        }

    }
}

interface K{

}

interface M{

}

class E implements M{

}

interface Aa{
    void m1();
}
interface Bb{
    void m2();
}

interface Cc{
    void m3();
}

//一个类实现多个接口
class D implements Aa,Bb,Cc{
    public void m1(){

    }

    public void m2(){
        System.out.println("m2 .....");
    }

    public void m3(){

    }
}


