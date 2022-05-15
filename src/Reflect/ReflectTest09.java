package Reflect;

/**
 * 重点: 给你一个类,怎么获取这个类的父类,已经实现了哪些接口?
 */
public class ReflectTest09 {
    public static void main(String[] args) throws Exception {
        //String举例
        Class stringClass = Class.forName("java.lang.String");
        //获取String的父类
        String name = stringClass.getSuperclass().getName();
        System.out.println(name);
        
        //获取String的所有接口
        Class[] interfaces = stringClass.getInterfaces();
        for (Class in :
                interfaces) {
            System.out.println(in.getSimpleName());
        }
    }
}
