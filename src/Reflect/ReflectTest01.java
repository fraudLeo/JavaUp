package Reflect;

/**
 *
 * 反射机制:
 *  1.1反射机制有什么作用:
 *      通过java语言中的反射机制可以操作字节码文件,(可以读和修改字节码文件)
 *      直接通过反射机制,操作class文件
 *  1.2反射机制的相关类在java.lang.Reflect包下
 *      Class:代表整个字节码文件,代表一个类型
 *      Method:代表字节码文件中的方法字节码
 *      Constructor:代表字节码中的构造字节码
 *      Field:代表字节码中的属性字节码
 *      以上是主要的类
 */

import java.util.Date;

/**
 * 要操作一个类的字节码,首先就要获取到这个类的字节码,怎么获取Class实例呢?
 * 三种方式:
 *      第一种: Class c = Class.forName("完整类名")
 *      第二种: Class c = 对象.getCalss();
 *      第三种: Class c = 任何类型.class
 *
 *
 */
public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        * Class.forName()
        * 1. 是静态方法
        * 2. 方法的参数是一个字符串
        * 3. 字符串需要的是一个完整类名,必须包含类名
        * */

        //第一种方式:
        Class c1 = Class.forName("java.lang.String");
        Class c2 = Class.forName("java.util.Date");
        Class c3 = Class.forName("java.lang.Integer");
        Class c4 = Class.forName("java.lang.System");

        //java中所有的类都有一个方法/;叫做getClass()
        //字节码文件装载到JVM的时候,只装载一份
        String s = "abc";
        Class x = s.getClass();//这里的x里面保存的地址和c1里面保存的地址是一样的
                                //x代表String.class字节码文件,x表示的String类型
        //第二种方式:
        Date time = new Date();
        Class y = time.getClass();
        System.out.println(c2 == y);//true (c2和y的两个变量中保存的内存地址都是一样的

        //第三种方式: java语言中的任何一种类型,包含基本数据类型,他都有.class属性
        Class z = String.class;
        Class k = Date.class;
        Class f = int.class;
        Class e = double.class;
        System.out.println(x==z);//true


    }
}
