package 匿名内部类;

public class Test01 {
    //静态内部类
    static class Inner1{}
    //实例内部类
    class Inner2{}

    public void doSome(){
        //局部内部类
        class Inner3{}
    }

    public void doOther(){
        //doSome方法中的局部内部类Inner3在doOther中不能使用
    }

    public static void main(String[] args) {
        //调用MyMath中的mysum方法
        MyMath mm = new MyMath();
        //mm.mysum(接口new不了,需要实现接口,100, 20);
        //mm.mysum(new ComputeImpl(),100, 20);

        //使用匿名内部类，可以不用写接口的实现类，直接new接口加上接口内方法的实现！！
        //匿名内部类太复杂，太乱，可读性差
        //匿名内部类没有名字，没有办法重复使用
        mm.mysum(new Compute() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        }, 100, 20);

    }
}



interface Compute{ //父接口
    //抽象方法
    int sum(int a, int b);
}

//会在此编写Compute接口的实现类
/*class ComputeImpl implements Compute{ //子类不是抽象的，可以new对象
    public int sum(int a, int b){
        return a + b;
    }
}*/

class MyMath{
    public void mysum(Compute c, int x, int y){ //接口也是一种引用类型，是一种抽象类
        //调用接口的方法
        System.out.println(x + "+" + y + "=" + c.sum(x, y));
    }


}
