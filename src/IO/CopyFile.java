package IO;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {

        /*先进行设计:
        *       拷贝源
        *       拷贝目标
        *       调用方法拷贝
        * */
        File srcFile = new File("E:\\shubiao\\");
        File destFile = new File("E:\\newOne\\");
        //调用方法拷贝
        copyDir(srcFile,destFile);
    }

    /**
     * 拷贝目录
     * @param file1-->拷贝源
     * @param file2-->目标源
     */
    private static void copyDir(File file1, File file2) {
        if (file1.isFile()) {
            //如果file1是一个文件的话,递归结束
            //是文件的时候需要拷贝
            //边读边写
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                //读这个文件
                in = new FileInputStream(file1);
                System.out.println(file1.getAbsolutePath());
                String path = ((file2.getAbsolutePath().endsWith("\\")?file2.getAbsolutePath(): file2.getAbsolutePath())+"\\")+file1.getAbsolutePath().substring(3);
                System.out.println(path);
                out = new FileOutputStream(path);
                byte[] bytes = new byte[1024*1024];//每次赋值1MB
                int readCount = 0;
                while((readCount = in.read(bytes))!=-1) {
                    out.write(bytes,0,readCount);
                }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out!=null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in!=null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        //获取源下面的子目录\
        File[] files = file1.listFiles();
        for (File file: files) {
            //递归调用
            if (file.isDirectory()) {
                //新建对应目录
//                System.out.println(file.getAbsolutePath());
                String srcFile = file.getAbsolutePath();
                String destDir = file2.getAbsolutePath().endsWith("\\")?file2.getAbsolutePath():file2.getAbsolutePath()+"\\"+srcFile.substring(3);
                File newFile = new File(destDir);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
//                System.out.println(srcFile.substring(3));//从第四个字符开始截取
//                System.out.println(destDir);
            }


            copyDir(file,file2);
        }
    }
}
