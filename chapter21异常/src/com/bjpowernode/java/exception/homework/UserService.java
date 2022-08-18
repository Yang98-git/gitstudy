package com.bjpowernode.java.exception.homework;

public class UserService {

    /**
     * 用户注册
     * @param username
     * @param password
     * @throws IllegalNameException
     */
    public void register(String username, String password) throws IllegalNameException {
        /**
         * 引用等于null的判断放到前面，防止空指针异常
         *
         * username == null 不如写成 null == username, 防止手误 = 把null赋值给username
         */
        if (null == username || username.length() < 6 || username.length() > 14){
            throw new IllegalNameException("用户名不合法！长度必须在6-14之间");
        }
        System.out.println("注册成功，欢迎" + username);
    }
}
