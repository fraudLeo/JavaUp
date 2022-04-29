package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 当文件复制的时候,是一边读,一边写,中介是内存
 *      使用FileInputStream,FileOutStream完成文件的拷贝
 *      拷贝的过程应该是一边读,一边写.
 *      使用以上的字节流拷贝文件的时候,文件类型随意,万能的,什么样的文件都能拷贝
 *
 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("E:\\JavaUp\\src\\IO\\FilePackage\\temp.txt");
            fos = new FileOutputStream("E:\\JavaUp\\src\\IO\\FilePackage\\output.txt");

            //最核心的: 一边读,一边写
            byte[] bytes = new byte[1024*1024];//一次最多拷贝1MB
            int readCount = 0;
            while((readCount = fis.read(bytes))!=-1) {
                fos.write(bytes,0,readCount);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //分开try,不要一起try
            //一起try的时候,其中一个出问题可能会影响到另一个流的关闭
            try {
                if (fis!=null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fos!=null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
