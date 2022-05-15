package IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File
 *      1. File类和四大家族没有关系,所以File类不能完成文件的读和写
 *      2. File对象代表什么?
 *          文件和目录路径名的抽象表示形式
 *          File对象有可能是对应目录,也可能是文件
 *         File常用方法
 */
public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("E:\\JavaUp\\src\\IO\\FilePackage\\FileTest01");
        //判断存不存在
        System.out.println(file.exists());
        //如果不存在,那么就以目录的形式创建
        if (!file.exists()) {
            file.mkdir();
            //倘若是多重目录的形式新建,那么就应该
            //file.mkdirs();
        }
        //获取父路径字符串
        String parentPath = file.getParent();
        System.out.println(parentPath);
        //获取父路径File
        File parentFile = file.getParentFile();
        System.out.println("获取绝对路径:"+parentFile.getAbsolutePath());

        //获取文件最后一次的修改时间
        //这个毫秒数是从1970年到现在的总毫秒数
        long haomiao = file.lastModified();
        //将总毫秒数转换为日期
        Date date = new Date(haomiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(date);
        System.out.println(strTime);

        //获取当前目录下所有的子文件
        File dirFile = new File("E:\\JavaUp\\src\\IO\\FilePackage");
        File[] files = dirFile.listFiles();
        for (File f: files) {
            System.out.println(f);
        }

    }
}
