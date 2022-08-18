package com.bjpowernode.javase.array.homework;

import java.util.Objects;

public class Room {
    private int no;
    private String type;
    private boolean status;

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    //Setter and Getter
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // 将java对象转换成字符串形式
    // 重写toString方法和equals方法的内容都是程序员自定的
    @Override
    public String toString() {
        return "[" + no + "," + type + "," + (status ? "空闲" : "占用") + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return no == room.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, type, status);
    }

    public static void main(String[] args) {
        Room room = new Room(101, "单人间", true);
        System.out.println(room);
        Room room1 = new Room(101, "单人间", true);
        System.out.println(room.equals(room1));

    }


}
