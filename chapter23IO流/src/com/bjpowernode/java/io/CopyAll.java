package com.bjpowernode.java.io;

import java.io.*;

/*
    拷贝目录
 */
public class CopyAll {
    public static void main(String[] args) {
        // 拷贝源
        File srcFile = new File("F:\\CS\\JAVA\\老杜进阶资料及源代码\\老杜零基础\\002-JavaSE每章作业");
        // 拷贝目标
        File destFile = new File("C:\\");
        // 调用方法拷贝
        copyDir(srcFile, destFile);
    }

    /**
     * 拷贝目录
     * @param srcFile
     * @param destFile
     */
    private static void copyDir(File srcFile, File destFile) {


        if (srcFile.isFile()){
            // 如果是一个文件，递归结束
            // 是文件，需要拷贝
            // 一边读一边写
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                // 输入流
                fis = new FileInputStream(srcFile);

                String srcDirs = srcFile.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcDirs.substring(3);

                // 输出流
                fos = new FileOutputStream(destDir);

                byte[] bytes = new byte[1024 * 1024];
                int readCount = 0;
                while ((readCount = fis.read(bytes)) != -1){
                    fos.write(bytes, 0, readCount);
                }

                fos.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }

        // 获取源下的子目录
        File[] files = srcFile.listFiles();
        // 是文件或者是目录
        for (File file : files){
            // 获取所有文件绝对路径
            // System.out.println(file.getAbsolutePath());

            if (file.isDirectory()){
                // 新建对应的目录
                String srcDirs = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcDirs.substring(3);

                File newFile = new File(destDir);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }

            // 递归调用
            copyDir(file, destFile);
        }

    }
}
