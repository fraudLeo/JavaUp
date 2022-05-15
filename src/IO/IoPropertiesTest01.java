package IO;

import java.io.*;
import java.util.Map;
import java.util.Properties;

/*
* IO+Properties联合应用
*   非常好的一个设计理念:
*   以后经常改变数据,可以单独写到一个文件中,使用程序动态读取
* 将来只需要修改修改这个文件内同,服务器也不需要重启,就可以拿到动态信息
*
* 类似以上机制的这种文件被称为配置文件
* java规范中有要求,属性配置文件建议以.properties结尾,但并不是必须的
* 以.properties结尾的被称为属性配置文件
* */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws Exception {
        /*
        * Properties是一个Map集合,key和value都是String类型
        * 想将userinfo文件中的数据加载到Properties对象当中
        * */
        //新建一个输入流队形
        FileReader fis = new FileReader("E:\\JavaUp\\src\\IO\\FilePackage\\properties.properties.properties.properties");
        //新建一个Map集合,Properties 是一个Map集合
        Properties properties = new Properties();
        //调用Properties对象的load方法将文件中的数据加载到Map集合中
        properties.load(fis);//文件中的数据顺着管道加载到Map集合中,其中等号左边做key,右边做value
        //是否能通过key来获取value呢?
        String username = properties.getProperty("username");
        System.out.println(username);
        String password = properties.getProperty("password");

    }
}
