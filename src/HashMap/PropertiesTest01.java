package HashMap;

import java.util.Properties;

/**
 * 目前只需要掌握Properties属性类对象的相关方法即可
 * 是一个Map集合,继承hashtable,Properties的key和value都是String类型
 * Properties被称为属性类对象
 * 是线程安全的
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("url","JDBC:mysql://asdadad");
        properties.setProperty("driver","com.leo");
        properties.setProperty("username","admin");
        properties.setProperty("password","123123");

        //通过key来获取value
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");


    }
}
