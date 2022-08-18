package 接口在开发中的作用;

public class Test {
    public static void main(String[] args) {
        //创建厨师对象
        FoodMenu cookerC = new ChineseCooker();
        FoodMenu cookerA = new AmericanCooker();
        //创建顾客对象
        Customer customer = new Customer(cookerC);
        Customer customer1 = new Customer(cookerA);
        //顾客点餐
        customer.order();
        customer1.order();
    }
}
