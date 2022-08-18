/*定义一个交通工具（Vehicle）类
    其中有属性：
        speed，size，move（），setSpeed（int speed），speedUp（），speedDown（）

    最后在Vehicle类中的main方法中实例化一个交通工具对象，并通过方法给它初始化speed，size且打印出来
    另外调用加速减速方法对速度进行改变*/

public class Homework2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(120,5);
        System.out.println("v‘s speed is " + v.getSpeed());
        System.out.println("v‘s size is " + v.getSize());

        v.speedUp(15);
        System.out.println("v‘s speed is " + v.getSpeed());


        Vehicle v1 = new Vehicle();
        v1.setSpeed(100);
        v1.setSize(6);
        System.out.println("v1‘s speed is " + v1.getSpeed());
        System.out.println("v1‘s size is " + v1.getSize());

        v1.speedDown(20);
        System.out.println("v1‘s speed is " + v1.getSpeed());



    }

}

class Vehicle{
    private int speed;
    private int size;

    public Vehicle() {
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    //实例方法需要创建对象，用引用访问
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void move(){

    }

    public void speedUp(int addSpeed){
        //this.setSpeed(this.getSpeed() + addSpeed);
        speed += addSpeed;

    }

    public void speedDown(int minusSpeed){
        //this.setSpeed(this.getSpeed() - minusSpeed);
        speed -= minusSpeed;

    }
}
