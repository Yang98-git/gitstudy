/*编写一个简单的计算器
定义一个Number类,其中有两个私有int为n1和n2
编写构造方法给n1 n2赋初始值
再在本类中定义addition(), subtraction(), multiplication(), division()等公有实例方法
分别对两个成员变量执行加减乘除

在main方法中创建Number类的对象调用各个方法并现实计算结果*/

public class Homework4 {
    public static void main(String[] args) {
        Number num = new Number(10, 5);
        num.addition();
        num.subtraction();

    }
}

class Number{
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void addition(){
        System.out.println(n1 + n2);
    }

    public void subtraction(){
        System.out.println(n1 - n2);
    }

    public void multiplication(){
        System.out.println(n1 * n2);
    }

    public void division(){
        System.out.println(n1 / n2);
    }
}
