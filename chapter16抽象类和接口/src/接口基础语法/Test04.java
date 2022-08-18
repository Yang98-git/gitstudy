package 接口基础语法;

//继承和实现都存在
public class Test04 {
    public static void main(String[] args) {
        Flyable f = new Cat();
        f.fly(); //不可以用Animal创建Cat对象，Animal中没有fly方法
    }
}

class Animal{

}

//可飞翔的接口，像一对翅膀
interface Flyable{
    void fly();
}

//Flyable是一个飞翔接口，插在猫身上，让猫类飞翔
class Cat extends Animal implements Flyable{
    public void fly(){
        System.out.println("猫猫在飞！");
    }
}

//没有飞翔接口的Snake
class Snake extends Animal{

}
