public class FinalTest02 {
    public static void main(String[] args) {
        Person p1 = new Person(20);
        System.out.println(p1.age);

        //final修饰的变量只能赋一次值！
        final Person p = new Person(30); //内存地址：0X1111
        //p = new Person(50); 内存地址：0X2356, 只要new对象就会产生新的内存地址, 无法指向新的对象
        p.age = 50; //对象属性可以修改
        System.out.println(p.age);


    }
}

class Person{
    int age;
    //final int age;
    final int age1 = 0; //final修饰的变量必须初始化, 也可以在构造方法中赋值
    //final int age2;

    public Person() {
        //this.age2 = 2; //final变量在构造方法中初始化
    }

    public Person(int age) {
        this.age = age;

    }
}

