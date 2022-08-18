package com.bjpowernode.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * finally必须和try一起出现，不能单独编写
 * finally一定会执行
 */
public class ExceptionTest10 {
    public static void main(String[] args) {

        FileInputStream fis = null; // 声明位置放到try外面，这样finally中才能使用fis
        try {
            // 创建输入流对象
            fis = new FileInputStream("F:\\CS\\刷题\\Leetcode\\LeetCode刷题手册.pdf");
            // 开始读文件

            String s  = null;
            // 这里一定会出现空指针异常
            s.toString();

            // 流使用完需要关闭，因为流是占用资源的
            // 即使以上程序出现异常，流也需要关闭
            // 放在这里流可能关闭不了
            // fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 流的关闭放在这里比较保险
            // finally中的代码一定会执行的
            // 即使try中出现了异常
            if (fis != null) { // 避免空指针异常
                try {
                    // close()方法有异常，采用捕捉
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
