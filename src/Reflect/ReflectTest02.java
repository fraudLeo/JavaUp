package Reflect;

import java.io.FileReader;
import java.util.Properties;

/**
 * 使用反射机制之后,不需要对代码进行多少变化,只需要修改配置类就可以
 * 符合oct开发原则(对扩展开放,对修改关闭)
 *
 */
public class ReflectTest02 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("E:\\JavaUp\\src\\Reflect\\Propreties\\properties.properties");
        Properties properties = new Properties();
        properties.load(reader);
        reader.close();
        String className = properties.getProperty("className");
//        System.out.println(className);

        //通过反射机制实例化对象
        Class c = Class.forName(className);
        Object o = c.newInstance();
        System.out.println(o);

    }
}
