package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader:
 *  文件字符输入流,只读取普通文本
 *  读取文本内容是,比较方便,快捷
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("E:\\JavaUp\\src\\IO\\FilePackage\\temp.txt");
            char[] chars = new char[4];
            int readCount = 0;
            while ((readCount = reader.read(chars))!=-1) {
                System.out.println(new String(chars,0,readCount)) ;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader!=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
