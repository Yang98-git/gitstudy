package com.bjpowernode.java.day24.homework;

/**
 * 类在强制类型转换过程中，如果是类转换成接口类型。
 * 那么类和接口之间不需要存在继承关系，也可以转换，
 * java语法中允许。
 */

public class Army {

    private Weapon[] weapons;

    /**
     * 创建军队的构造方法
     * @param count
     */
    public Army(int count){
        weapons = new Weapon[count];
        // 数组中都是null
    }

    /**
     * 将武器加入数组
     * @param weapon
     */
    public void addWeapon(Weapon weapon) throws AddWeaponException {
        for (int i = 0; i < weapons.length; i++){
            if (null == weapons[i]){
                weapons[i] = weapon;
                System.out.println(weapon + "武器添加成功");
                return;
            }
        }
        // 如果程序执行到此处说明，武器没有添加成功
        throw new AddWeaponException("武器数量已到达上限！");
    }

    public void attackAll(){
        for (int i = 0; i < weapons.length; i++){
            // 调用子类特有方法，向下转型
            if (weapons[i] instanceof Shootable){
                Shootable shootable = (Shootable) weapons[i];
                shootable.shoot();
            }
        }
    }

    public void moveAll(){
        for (int i = 0; i < weapons.length; i++){
            if (weapons[i] instanceof Moveable){
                Moveable moveable = (Moveable) weapons[i];
                moveable.move();
            }
        }
    }
}
