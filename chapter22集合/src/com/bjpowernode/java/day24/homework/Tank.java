package com.bjpowernode.java.day24.homework;

/**
 * 坦克是一个武器，可移动可射击
 */
public class Tank extends Weapon implements Moveable, Shootable{

    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮");
    }

    @Override
    public String toString() {
        return "Tank";
    }
}
