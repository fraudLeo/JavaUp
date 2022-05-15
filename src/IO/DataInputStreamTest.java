package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * DataInputStream:数据字节输入流
 * DataOutputStream:写的文件,只能由DataInputStream去读,并且读的时候需要读写顺序一样
 */
public class DataInputStreamTest {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("data"));
        //开始读
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        boolean sex = dis.readBoolean();
        char c = dis.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(sex);
        System.out.println(c);
    }
}
