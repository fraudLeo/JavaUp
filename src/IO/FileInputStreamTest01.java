package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
*
* 1. 这是文件字节输入流,万能的,任何类型的文件都可以采用这份流来读
* 2. 字节的上市,完成输入的操作,完成读的操作(从硬盘到内存)
*
*
*
* */
//分析这个程序的缺点:一次读取一个byte 这样内存和硬盘交互太频繁,基本上时间/资源都耗费在交互上面了,能不能一次读取多个呢?
    //
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        //创建文件字节输入流对象
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\JavaUp\\src\\IO\\FilePackage\\temp.txt");


            //单独带文件的末尾了,再度的时候就读取不到任何数据了,就会返回-1
            int readData = 0;
            while((readData = fis.read())!=-1) {
               //返回值是:读取到的字节本身
                System.out.println(readData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //避免空指针异常
            if (fis!=null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
