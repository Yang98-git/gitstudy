package com.bjpowernode.java.exception.homework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入注册用户名:");
        String username = s.nextLine();
        System.out.print("请输入注册密码:");
        String password = s.nextLine();

        UserService userService = new UserService();
        try {
            userService.register(username,password);
        } catch (IllegalNameException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
