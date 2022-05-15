package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 一次是否可以序列化多个对象呢?
 *  可以 可以将对象放到集合当中,序列化集合
 *
 *     java 语言中采用什么机制来区分类的?
 *      第一:首先通过类名进行对比,如果类名不一样,肯定不是同一个类
 *      第二:如果类名一样,再怎么进行类的分类?靠序列化版本号进行区分
 *      对于java虚拟机来说,java虚拟机时可以区分开这两个类的,因为这两个类都实现了Serializable接口
 *      都有默认的序列化版本号,他们的序列化版本号不同,所以区分开了,
 *      这是序列化版本号的好处
 *
 *      但是有缺陷吗?
 *          后续不能修改代码
 *          一旦代码确立之后,不能进行后续的修改,因为只要修改 必然会重新编译此时会生成全新的序列化版本号,这个时候,java虚拟机
 *          会认为这是一个全新的类
 *      最终结论:
 *          凡是一个类实现了Serializable接口,建议给该类提供一个固定不变的序列号
 *          建议将序列化版本号手动写出来,不建议自动生成
 */
public class ObjectOutputDtreamTest02 {
//    private static Object uesrList;

    public static void main(String[] args) throws Exception {
        List<User> userList = new ArrayList<User>();
        userList.add(new User(1,"zhangsan"));
        userList.add(new User(2,"lisi"));
        userList.add(new User(3,"wangwu"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\JavaUp\\src\\IO\\FilePackage\\users"));
        //序列化一个集合,这个集合对象中放了很多其他对象
        oos.writeObject((Object)userList);
        oos.flush();
        oos.close();

    }
}

class User implements Serializable {
    private int no;
    //如果不希望哪个属性参与序列化,,可以添加关键字: transient 表示游离的
    private transient String name;
    private static final long serialVersionUID = 1L;
    public User() {
    }

    public User(int no, String name) {
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
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}