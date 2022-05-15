package Reflect;

import java.util.ResourceBundle;

/**
 * java.util包下提供了一个资源绑定器,便于获取属性配置文件中的内容
 * 使用一下这种方式的时候,属性配置文件xxx.properties必须放到类路劲下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //资源绑定器,只能绑定xxx.properties文件,并且这个文件必须在类路径下,文件扩展名也必须是properties
        //并且扩展名也不能写
        //ResourceBundle boudle = ResourceBundle.getBundle("Reflect/Propreties/properties.properties");//错误
        //ResourceBundle boudle = ResourceBundle.getBundle("properties.properties");//错误
        ResourceBundle boudle = ResourceBundle.getBundle("properties");
//        ResourceBundle boudle = ResourceBundle.getBundle("Reflect/Propreties/properties.properties");

        //倘若要实现深入文件夹寻找文件,那么就得从src下一级开始写,但是最后的后缀依旧不写
        String className = boudle.getString("className");
        System.out.println(className);
    }
}
