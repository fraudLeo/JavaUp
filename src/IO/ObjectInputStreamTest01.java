package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * 反序列化
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\JavaUp\\src\\IO\\FilePackage\\users"));
        //开始反序列化
//        Object obj = ois.readObject();
        //反序列化回来是一个学生对象,所以会调用学生对象的toString方法
        List<User> obj = (List<User>)ois.readObject();
        System.out.println(obj);
        ois.close();
    }
}
