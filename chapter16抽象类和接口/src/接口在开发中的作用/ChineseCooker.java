package 接口在开发中的作用;

//不同厨师实现菜单接口
public class ChineseCooker implements FoodMenu{
    @Override
    public void tomatoEgg() {
        System.out.println("中餐———西红柿鸡蛋");
    }

    @Override
    public void fishMeat() {
        System.out.println("中餐———鱼香肉丝");
    }
}
