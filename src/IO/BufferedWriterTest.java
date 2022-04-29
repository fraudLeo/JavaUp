package IO;

import java.io.*;

/*
* BufferedWriter:   带有缓冲的字符输出流
* */
public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        //带有缓冲取得自读输出流
//        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\JavaUp\\src\\IO\\FilePackage\\BufferedWriterTest.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy2")));
        bw.write("asdasd");
        bw.write("\n");
        bw.write("asdasd");
        bw.write("\n");
        bw.write("asdasd");
        bw.write("\n");
        bw.write("asdasd");
        bw.write("\n");
        bw.flush();
        bw.close();
    }

}
