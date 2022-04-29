package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInoutStream类的其他常用方法:
 *  int available:  返回流当中的剩余的没有读到的字节数量
 *  long skip:      跳过几个字节不读
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {

            fis = new FileInputStream("E:\\JavaUp\\src\\IO\\FilePackage\\temp.txt");
            System.out.println("总字节数量:"+fis.available());
            //先读取一个字节
//            int readByte = fis.read();
            //还剩下的可以读的字节数量是5
//            System.out.println("剩下多少个字节没有读:"+fis.available());
            //这个方法有什么用   这样就直接一次性都出来了 但是这样的方法不适合大文件,因为数组的局限性
            byte[] bytes = new byte[fis.available()];
            //不需要循环了
            //直接读取有一次就可以了
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
