package IO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 数据专属流
 *  这个流可以将数据联通数据的类型一并写入文件
 *  注意:这个文件不是普通文本文档
 */
public class DataOutputStreamTest {

    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data"));
        byte b = 100;
        short s = 200;
        int i = 300;
        boolean sex = true;
        char c = 'a';

        dos.writeByte(b);//把数据以及数据的类型一并写入到文件当中
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeBoolean(sex);
        dos.writeChar(c);


        dos.flush();
        dos.close();
    }
}
