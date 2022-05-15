package Reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Thread.currentThread() 当前线程对象
 * getContextClassloader()是线程对象的方法,可以获取到当前线程的
 * getResource() [获取资源] 这是类加载器对象的方法,当前线程的类加载器默认从类的路径的根路径下载资源
 */
public class AboutPath {
    public static void main(String[] args) throws IOException {
        //获取方法路径
//        同志们 空指针异常估计是idea没自动在运行程序时将文件复制到out下，这串代码取的是out目录下的
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("Reflect/Propreties/properties.properties").getPath();//这种方式和绝对路劲差不多,不过比他更稳定
        System.out.println(path);
        //也可以以流的形式获取:
        InputStream reader = Thread.currentThread().getContextClassLoader().
                getResourceAsStream("Reflect/Propreties/properties.properties");

        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        String path2 = pro.getProperty("className");
        System.out.println(path2);
    }
}
