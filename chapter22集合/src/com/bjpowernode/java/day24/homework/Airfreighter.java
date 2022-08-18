package com.bjpowernode.java.day24.homework;

public class Airfreighter extends Weapon implements Moveable{
    @Override
    public void move() {
        System.out.println("运输机起飞");
    }

    @Override
    public String toString() {
        return "Airfreighter";
    }
}
