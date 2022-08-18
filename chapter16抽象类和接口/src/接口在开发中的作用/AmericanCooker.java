package 接口在开发中的作用;

//厨师实现菜单
public class AmericanCooker implements FoodMenu{
    @Override
    public void tomatoEgg() {
        System.out.println("西式———西红柿鸡蛋");
    }

    @Override
    public void fishMeat() {
        System.out.println("西式———鱼香肉丝");
    }
}
