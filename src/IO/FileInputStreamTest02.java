package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * int read(byte[] b)
 *      一次读取多个字节  b.length个字节
 *      减少硬盘和内存的交互,提高程序的执行效率
 *      往byte数组中读
 *
 *      //IDEA中国默认的当前路径是Poject的根
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\JavaUp\\src\\IO\\FilePackage\\temp.txt");
            //开始读,采用byte[]数组,一次读取多个字节.最多读取"数组.length"个字节
            byte[] bytes = new byte[4];//准备一个长度为4的byte数组
            //这个方法的返回值是:读取到的字节数量,不是字节本身
            while(true) {
                int readCount = fis.read(bytes);
                if (readCount==-1) {
                    break;
                }
                //把byte数组转换为字符串,读到多少个转换多少个
                System.out.println(new String(bytes,0,readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
