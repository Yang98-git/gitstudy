package 接口在开发中的作用;

public class Customer {
    //Customer has a FoodMenu.
    //has a 都以实例变量存在
    //面向接口编程，降低耦合度，提高扩展力
    private FoodMenu foodMenu;

    public Customer() {
    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //点菜方法
    public void order(){
        //先拿菜单再点菜
        //FoodMenu fm = this.getFoodMenu();
        //本类中私有方法可以直接访问
        //调用FoodMenu接口中的方法
        foodMenu.tomatoEgg();
        foodMenu.fishMeat();

    }

}
