package com.bjpowernode.java.service;

/**
 * 用户业务类
 */
public class UserService {

    // 登录方法
    public boolean login(String name, String password){
        if ("admin".equals(name) && "123".equals(password)){
            return true;
        }
        return false;
    }

    // 退出登录方法
    public void logout(){
        System.out.println("系统已经安全退出！");
    }
}
