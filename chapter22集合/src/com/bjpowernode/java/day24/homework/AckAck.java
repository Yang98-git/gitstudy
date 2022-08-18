package com.bjpowernode.java.day24.homework;

public class AckAck extends Weapon implements Shootable{
    @Override
    public void shoot() {
        System.out.println("高射炮开炮");
    }

    @Override
    public String toString() {
        return "AckAck";
    }
}
