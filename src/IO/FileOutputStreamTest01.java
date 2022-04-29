package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件字节输出流,负责写
 * 从内存到硬盘
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //反复执行这个文件会见源文件清空,然后再重新写入
            //如果文件不存在就会自动重建
            fos = new FileOutputStream("E:\\JavaUp\\src\\IO\\FilePackage\\output.txt");
            //fos = new FileOutputStream("E:\\JavaUp\\src\\IO\\FilePackage\\output.txt",true);//添加后面那个系数,不会清空源文件内同,表示追加
            byte[] bytes = {97,98,99,100};
            fos.write(bytes);//abcd
            //将byte数组的一部分写出
            fos.write(bytes,0,2);
            String s = "我是中国人";
            byte[] bs = s.getBytes();
            fos.write(bs);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
