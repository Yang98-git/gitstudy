package com.bjpowernode.java.day24.homework;

public class Test {
    public static void main(String[] args) {
        Army army = new Army(4); // 军队只有四个武器

        // 创建武器对象
        Weapon figher = new Fighter();
        Weapon figher2 = new Fighter();
        Weapon tank = new Tank();
        Weapon ackack = new AckAck();
        Weapon airfreighter = new Airfreighter();

        // 添加武器
        try {
            army.addWeapon(figher);
            army.addWeapon(tank);
            army.addWeapon(ackack);
            army.addWeapon(airfreighter);
            army.addWeapon(figher2);
        } catch (AddWeaponException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        army.moveAll();
        army.attackAll();

    }
}
