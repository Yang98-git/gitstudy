package com.bjpowernode.javase.array;

// 数组存储引用数据类型, 数组只能存储java对象的内存地址，数组中存储的每个元素是引用
public class ArrayTest07 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1, a2};

        //对数组遍历
        for (int i = 0; i < animals.length; i++){
            Animal a = animals[i];
            a.move();

            animals[i].move();
        }

        // 动态初始化
        Animal[] ans = new Animal[2];
        ans[0] = new Animal();
        //ans[1] = new Product();

        //Cat是Animal的子类
        ans[1] = new Cat();
        ans[1].move();

        System.out.println("================================");

        // 创建一个Animal类型的数组，存储Cat和Bird
        Animal[] animals1 = {new Cat(), new Bird()};
        for (int i = 0; i < animals1.length; i++){
            // 如果调用的方法在父类中也存在，直接使用父类型引用调用即可
            animals1[i].move();

            // 如果是特有方法，需要向下转型!!
            if (animals1[i] instanceof Cat){
                Cat c = (Cat)animals1[i];
                c.catchMouse();
            }else if (animals1[i] instanceof Bird){
                Bird b = (Bird)animals1[i];
                b.sing();
            }
        }
    }
}

class Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}

class Product{

}

class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步！");
    }

    // 特有方法
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("Bird fly!");
    }

    // 特有方法
    public void sing(){
        System.out.println("鸟儿在歌唱");
    }
}
