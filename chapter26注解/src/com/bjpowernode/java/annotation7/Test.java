package com.bjpowernode.java.annotation7;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        // 获取类
        try {
            Class userClass = Class.forName("com.bjpowernode.java.annotation7.User");
            // 判断类上是否存在Id注解
            if (userClass.isAnnotationPresent(Id.class)){
                // 当一个类上有@Id注解时，要求类中必须存在int类型的id属性
                // 如果没有int类型id，则报异常

                // 获取类的属性
                Field[] fields = userClass.getDeclaredFields();
                boolean isID = false;
                for (Field field : fields){
                    // 判断是否有int类型id属性
                    if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())){
                        isID = true;
                        break;
                    }
                }

                // 判断是否合法
                if (!isID){
                    throw new NotHasIDException("被@Id注解标注的类中必须有int类型id属性！");
                }

            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NotHasIDException e) {
            e.printStackTrace();
        }
    }
}
