package com.bjpowernode.java.exception;

public class ExceptionTest13 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result); // 100
    }

    // return必须最后执行
    // 代码自上而下执行
    public static int m(){
        int i = 100;
        try{
            return i;
        }finally {
            i++;
        }
    }
}


/**
* int i = 100;
* int j = i;
* i++;
*  return j;
 */
