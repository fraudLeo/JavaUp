package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用FileWriter和FileReader进行拷贝只能拷贝普通文本
 */
public class Copy02 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("src/IO/FilePackage/FileReader.txt");
            fw = new FileWriter("src/IO/FilePackage/FileWriter.txt");
            int readContext = 0;
            char[] chars = new char[1024*512];
            while((readContext= fr.read(chars))!=-1) {
                fw.write(chars,0,readContext);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr!=null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
