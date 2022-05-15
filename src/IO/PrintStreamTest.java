package IO;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * PrintStream :标准的字节输出流,默认输出到控制台.
 *
 */
public class PrintStreamTest {
    public static void main(String[] args) throws Exception {
        System.out.println("helloworld!");
        //这里的System.out 里面的out返回的就是PrintStream类型的数据
        PrintStream ps = System.out;
        ps.printf("helloworld!");
        //标准输出流不需要手动close()关闭
        //可以改变标准输出流的输出方向吗?可以
        //标准输出流不在直向控制台,指向"aaa"文件
        PrintStream printStream = new PrintStream(new FileOutputStream("E:\\JavaUp\\src\\IO\\FilePackage\\aaa"));
        //修改输出方向,将输出方向修改到"log"文件
        System.setOut(printStream);
        //再输出
        System.out.println("hello world");
        System.out.println("hello kitty");
        //重新定向回控制台
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        System.out.println("hello");

    }
}
