public class AbstractTest02 {
    public static void main(String[] args) {
        Animal a = new Bird(); //面向抽象编程, 向上转型 （自动类型转换）
        a.move();

        Animal b = new Cat();
        b.move();
    }
}

abstract class Animal{
    public abstract void move();
}

class Bird extends Animal{

    @Override
    public void move(){
        System.out.println("鸟儿在飞翔！");
    }
}

class Cat extends Animal{

    public void move(){
        System.out.println("猫在走猫步！");
    }
}
