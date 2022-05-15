package IO;

import java.io.*;

/**
 * 将对象放到硬盘文件里叫做序列化
 *      序列化: Serialize java对象存储到文件中,将java对象的状态保存下来的过程
 *      反序列化: DeSerialize 将硬盘上的数据重新恢复成java对象
 *
 *      java.io.NotSerializableException:
 *          Student对象不支持序列化,参与序列化和反序列化 必须实现Serializable接口
 *
 *       通过源代码发现,Serializable接口只是一个标志接口
 *          起到一个标识的动作,jVM看到这个类实现了这个接口,可能会对这个类进行特殊待遇
 *          JAVA中有两种接口  一种是有内容的接口 还有一种是标志接口 是给JVM参考的 JVM看到这个接口之后,会为该类自动生成一个序列化版本号
 *          这里没有手动写出来 JVM会默认提供这个序列化的版本号
 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        //创建java对象
        Student s1 = new Student(1111,"zhangsan");
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\JavaUp\\src\\IO\\FilePackage\\students"));
        //序列化对象
        oos.writeObject(s1);
        //刷新
        oos.flush();
        //关闭
        oos.close();

    }
}

//学生类
//应用的这个接口里面没有东西,只是一个标志性的东西
class Student implements Serializable {
    int no;
    String name;

    public Student() {}

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}