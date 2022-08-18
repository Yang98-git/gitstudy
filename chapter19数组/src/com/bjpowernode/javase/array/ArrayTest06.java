package com.bjpowernode.javase.array;

// 模拟一个系统，使用前必须输入用户名和密码
public class ArrayTest06 {
    // 用户名和密码输入到String[] args数组中
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("请输入用户名和密码：");
            return;
        }

        // 判断用户名和密码是否正确
        String userName = args[0];
        String password = args[1];

        //if (userName.equals("admin") && password.equals("123")){
        // 即使userName和password都是null, 也不会出现空指针异常
        if ("admin".equals(userName) && "123".equals(password)){ // 可避免空指针异常
            System.out.println("登录成功，欢迎" + userName + "回来！");
        }else{
            System.out.println("验证失败,用户名不存在或者密码错误");
        }

    }
}
