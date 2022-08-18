public class AbstractTest01 {
    public static void main(String[] args) {
        //Account act = new Account(); 抽象类不能实例化，不能创建对象
    }
}

abstract class Account {
    //抽象方法
    public abstract void withdraw();
}

//子类继承抽象类，子类可以实例化对象
class CreditAccount extends Account {

    //子类中必须重写抽象方法，必须实现抽象方法
    @Override
    public void withdraw() {

    }



}
